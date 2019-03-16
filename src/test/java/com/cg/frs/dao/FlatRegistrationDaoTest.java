package com.cg.frs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatRegistrationDTO;

import org.junit.jupiter.api.BeforeAll;

class FlatRegistrationDaoTest {
	static FlatRegistrationDao flatRegistrationDao;
	static FlatRegistrationDTO dto;

	@BeforeAll
	public static void init() {
		flatRegistrationDao = new FlatRegistrationDao();
		dto = new FlatRegistrationDTO();
	}

	@Test
	void testRegisterFlat() {

		dto.setDepositAmount(27000);
		dto.setFlatArea(700);
		dto.setFlatType(2);
		dto.setOwnerId(2);
		dto.setRentAmount(9000);
		FlatRegistrationDTO flat = flatRegistrationDao.registerFlat(dto);//create an object of FlatRegistration and call registerFlat();
		assertEquals(1010,flat.getFlatId());
	}

	@Test
	void testGetAllOwnerIds() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);//create the arraylist {1,2,3} to check if getAllOwnerIds() is returning same arraylist or not
		assertEquals(a, flatRegistrationDao.getAllOwnerIds());
	}

}
