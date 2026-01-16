package com.formservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String contactNumber;
	 private String address;
	 private String city;
	 private String state;
	 private String country;
	 public UserData(long id, String firstName, String lastName, String email, String contactNumber, String address,
			String city, String state, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	 }
	 
	 public UserData() {
		 
	 }
	 
}
