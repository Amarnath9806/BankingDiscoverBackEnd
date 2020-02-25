package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.banking.ao.Type;
import com.banking.bo.SelectTypeBO;
@Component
public class SelectTypeImpl implements SelectType {
	@Autowired
	 SelectTypeBO selectTypebo;

	@Override
	public Type getType() {
		return 	selectTypebo.getAll();
		
	}

}
