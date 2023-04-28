package com.crud.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Workers{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name="first_name",nullable=false,length=45)
private String firstName;


@Column(name="last_name",nullable=false,length=45)
private String lastName;

@Column(name="city",nullable=false,length=45)
private String city;

private long mobile;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}



}