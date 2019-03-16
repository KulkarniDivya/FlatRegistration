package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.daoCollection.FlatRegistrationCollectionDao;
import com.cg.frs.daoCollection.IFlatRegistrationCollectionDao;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationService implements IFlatRegistrationService {
	IFlatRegistrationCollectionDao flatRegistrationDao = new FlatRegistrationCollectionDao();
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		// TODO Auto-generated method stub
		return flatRegistrationDao.registerFlat(flat);
	}

	public ArrayList<Integer> getAllOwnerIds() {
		// TODO Auto-generated method stub
		return flatRegistrationDao.getAllOwnerIds();
	}

}
