package com.mapping.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dish {
	@Id
	public int id;
	public boolean template;
	public String tittle;
	public String description;
	
	public String servers;

	public String price;
	
	
	 @OneToMany(targetEntity = Breakfast.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	public List<Breakfast> breakfast; 
	 
	 
	 @OneToMany(targetEntity = Delevery.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	 public List<Delevery> delevery;
	 
	 @OneToMany(targetEntity = Inclussion.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	 public List<Inclussion> inclusion;
	 
	 
	 public String minorder;
	 
	 public String maxorder;
	 
	 public String category;
	  
	 public String foodtype;
	 
	 public String cusinetype;
	 
	 public String usp;
	 
	 
	 public boolean accompaniment;
	 
	 
	 public String anyoffer;
	 
	 public Date calender;
	 
	 
	 
	
	
	
	

}
