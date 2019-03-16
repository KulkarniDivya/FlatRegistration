package com.cg.frs.daoCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.dto.Owner;

public class FlatRegistrationCollectionDao implements IFlatRegistrationCollectionDao {
	Map<Integer,Owner> owner; 
	Map<Integer,FlatRegistrationDTO> flats = new HashMap<>();
	static int count = 1000;
	public FlatRegistrationCollectionDao() {
		// TODO Auto-generated constructor stub
		owner = new HashMap<>();
		owner.put(1, new Owner("Vaishali Srivastava","8888108810"));
		owner.put(2, new Owner("Ankita Ghokila","9876665454"));
		owner.put(3, new Owner("Rohini Vijayar","7659993201"));
	}
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		flat.setFlatId(count);
		flats.put(count, new FlatRegistrationDTO(count,flat.getOwnerId(),flat.getFlatType(),flat.getFlatArea(),flat.getRentAmount(),flat.getDepositAmount()));
		if(flat.getOwnerId() == flats.get(count).getOwnerId())
		{
			return flats.get(count++);
		}
		else 
			return null;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		ArrayList<Integer> owners = new ArrayList<>();
		for(Map.Entry<Integer, Owner> m:owner.entrySet())
		{
			owners.add(m.getKey());
		}
		return owners;
	}

}
