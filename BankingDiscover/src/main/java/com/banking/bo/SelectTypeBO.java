package com.banking.bo;

import org.springframework.stereotype.Component;

import com.banking.ao.Type;
@Component
public class SelectTypeBO {

	Type type = new Type();
	
	
	public Type getAll() {
		
		type.setRest("REST");
		type.setSoap("SOAP");
		
		return type;
		
	}
}
