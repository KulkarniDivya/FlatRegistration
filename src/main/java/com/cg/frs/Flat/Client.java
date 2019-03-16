package com.cg.frs.Flat;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationService;
import com.cg.frs.service.IFlatRegistrationService;
import com.cg.frs.utility.WrongDepositAmountException;
import com.cg.frs.utility.WrongFlatAreaException;
import com.cg.frs.utility.WrongFlatTypeException;
import com.cg.frs.utility.WrongIdException;

public class Client {
	 static IFlatRegistrationService flatRegistrationService = new FlatRegistrationService();
	 static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Register Flat"+"\n"+"2.Exit");
			int n = scanner.nextInt();
			switch(n)
			{
			case 1: FlatRegistrationDTO flat = enterDetails();
					if(flat != null)
					{
						flat = flatRegistrationService.registerFlat(flat);
						if(flat != null)
							System.out.println("Flat Successfully Registered. Registration id: <"+flat.getFlatId()+">");
						else
							System.out.println("No");
					}
					break;
			case 2: System.out.println("Thank You");
			        System.exit(0);
			}
		}
	}

	//To enter the flat details
	private static FlatRegistrationDTO enterDetails() {
		// TODO Auto-generated method stub
		FlatRegistrationDTO flatRegistrationDTO = new FlatRegistrationDTO();
		ArrayList<Integer> owners = flatRegistrationService.getAllOwnerIds();
		System.out.println("Existing Owner Id's are:-"+owners);
		System.out.println("Enter owner id:");
		int id = scanner.nextInt();
		int c = 0;
		if(owners.contains(id))
		{
			flatRegistrationDTO.setOwnerId(id);
			System.out.println("Enter Flat Type(1-1BHK, 2-2BHK)");
			int flat_type = scanner.nextInt();
			if(flat_type == 1 || flat_type == 2)
			{
				flatRegistrationDTO.setFlatType(flat_type);
				System.out.println("Enter Flat Area in sq.ft:");
				int flat_area = scanner.nextInt();
				if(flat_area > 0)
				{
					flatRegistrationDTO.setFlatArea(flat_area);
					System.out.println("Enter desired rent amount in Rs:");
					int rent_amt = scanner.nextInt();
					flatRegistrationDTO.setRentAmount(rent_amt);
					System.out.println("Enter desired deposit amount in Rs:");
					int deposit_amt = scanner.nextInt();
					if(deposit_amt >= rent_amt)
					{
						c++;
						flatRegistrationDTO.setDepositAmount(deposit_amt);
					}
					else
					{
						try {
							throw new WrongDepositAmountException();
						} catch (WrongDepositAmountException e) {
							// TODO Auto-generated catch block
						}
					}
				}
				else
				{
					try {
						throw new WrongFlatAreaException();
					} catch (WrongFlatAreaException e) {
						// TODO Auto-generated catch block
					}
				}
				
			}
			else
			{
				try {
					throw new WrongFlatTypeException();
				} catch (WrongFlatTypeException e) {
					// TODO Auto-generated catch block
				}
			}
			
		}
		else
		{
			try {
				throw new WrongIdException();
			} catch (WrongIdException e) {
				// TODO Auto-generated catch block
			}
		}
		if(c == 1)
			return flatRegistrationDTO;
		else
			return null;
	}

}
