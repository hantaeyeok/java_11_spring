package com.spring3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.dao.StoreDAO;
import com.spring3.dto.Store;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreDAO storeDAO;
	
	@Override
	public List<Store> getStoreList() {
		return storeDAO.getStoreList();
	}

	@Override
	public Store getStore(int storeNum) {
		return storeDAO.getStore(storeNum);
	}

	@Override
	public int maxNum() {
		return storeDAO.maxNum();
	}

	@Override
	public void insStore(Store store) {
		storeDAO.insStore(store);
	}

	@Override
	public void upStore(Store store) {
		storeDAO.upStore(store);
	}

	@Override
	public void delSore(Store store) {
		storeDAO.delSore(store);
	}

	
}