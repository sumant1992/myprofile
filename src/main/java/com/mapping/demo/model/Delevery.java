package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delevery 
{
	@Id
	public int id;
	public String time;

}
