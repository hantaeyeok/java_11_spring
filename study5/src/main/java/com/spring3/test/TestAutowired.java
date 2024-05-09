package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring3.dao.SampleDAO;

public class TestAutowired {

	@Autowired
	private SampleDAO sampleDAO;

	public TestAutowired(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}
	
	
}
