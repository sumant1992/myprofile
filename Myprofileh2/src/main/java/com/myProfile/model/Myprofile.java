package com.myProfile.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Myprofile
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String firstname;
	public String lastname;
	public String adressline1;
	public String adressline2;
	public String city;
	public String state;
	public String pincode;
	public String profession;
	public String email;
	public String mobile;
	public Date dob;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAdressline1() {
		return adressline1;
	}
	public void setAdressline1(String adressline1) {
		this.adressline1 = adressline1;
	}
	public String getAdressline2() {
		return adressline2;
	}
	public void setAdressline2(String adressline2) {
		this.adressline2 = adressline2;
	}
	public String getPune() {
		return city;
	}
	public void setPune(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Myprofile [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", adressline1="
				+ adressline1 + ", adressline2=" + adressline2 + ", pune=" + city + ", state=" + state + ", pincode="
				+ pincode + ", profession=" + profession + ", email=" + email + ", mobile=" + mobile + ", dob=" + dob
				+ "]";
	}
	
	
	public Myprofile(int id, String firstname, String lastname, String adressline1, String adressline2, String pune,
			String state, String pincode, String profession, String email, String mobile, Date dob) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.adressline1 = adressline1;
		this.adressline2 = adressline2;
		this.city = pune;
		this.state = state;
		this.pincode = pincode;
		this.profession = profession;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
	}
	public Myprofile() {
		super();
	}

	
	
	
	
	
	
	
	
	
	
}
