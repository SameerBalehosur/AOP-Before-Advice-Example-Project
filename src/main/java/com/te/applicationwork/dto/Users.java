package com.te.applicationwork.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Bangalore_User_Info")
public class Users {
	@Id
	@GeneratedValue
	@Column(name = "User_Id")
	private int id;
	@Column(name = "User_Name")
	private String name;
	@Column(name = "User_Address")
	private String address;
	@Column(name = "User_Pincode")
	private int pincode;
	@Column(name = "User_State")
	private String state;


}
