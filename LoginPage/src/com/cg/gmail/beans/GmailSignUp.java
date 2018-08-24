package com.cg.gmail.beans;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class GmailSignUp {
	@Id
private String firstName;
private String lastName;
private String middleName;
private String userName;
private String dob;
private int age;
private String phoneNumber;
private String alternatePhoneNumber;
private String State;

private String country;
private String password;
private String confirmPassword; 
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
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAlternatePhoneNumber() {
	return alternatePhoneNumber;
}
public void setAlternatePhoneNumber(String alternatePhoneNumber) {
	this.alternatePhoneNumber = alternatePhoneNumber;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}

}
