package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inclussion {

	@Id
	public int id;
	public String item;
	public String portion;
	
	
	
}
