package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.ao.Type;
import com.banking.service.SelectType;


@CrossOrigin(origins = "http://localhost:3000",allowedHeaders="*")
@RestController
public class Controller {

	    @Autowired
		SelectType selectType;

		@RequestMapping(value = "/getType", method = RequestMethod.GET)
		public Type getType() {

			return  selectType.getType() ;
			
		}
	

}
