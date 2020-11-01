package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Breakfast 
{
	@Id	
	public int id;
	public String breakfast;
	public String time;
	public String day;
	
	

}
