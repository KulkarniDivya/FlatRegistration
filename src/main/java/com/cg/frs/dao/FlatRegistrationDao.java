package com.cg.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.utility.Database;

public class FlatRegistrationDao implements IFlatRegistrationDao {
	Database db = new Database();
	Connection con = db.getConnection();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		int  i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into flat_registration(owner_id,flat_type,flat_area,rent_amount,deposit_amount) values (?,?,?,?,?)" );
			ps.setInt(1, flat.getOwnerId());
			ps.setInt(2, flat.getFlatType());
			ps.setInt(3, flat.getFlatArea());
			ps.setInt(4, flat.getRentAmount());
			ps.setInt(5, flat.getDepositAmount());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i == 1)
		{
			flat = flatDetails(flat);
			return flat;
		}
		else
			return null;
	}

	//To retrieve the flat_id 
	private FlatRegistrationDTO flatDetails(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps  = con.prepareStatement("select * from flat_registration where owner_id = ?");
			ps.setInt(1, flat.getOwnerId());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				flat.setFlatId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flat;
	}

	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		ArrayList<Integer> owners = new ArrayList<Integer>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from flat_owners");
			while(rs.next())
			{
				owners.add(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return owners;
	}

}
