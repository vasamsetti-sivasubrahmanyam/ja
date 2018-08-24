package com.capgemini.onlinebanking.entity;

import java.time.LocalDate;

public class Account {
    int accNum;
    String firstName;
    String lastNmae;
    float accBal;
    LocalDate transDate;
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public void setLastNmae(String lastNmae) {
		this.lastNmae = lastNmae;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	public Account() {
		super();
		this.accNum = 0000;
		this.firstName = "";
		this.lastNmae ="";
		this.accBal = 0000;
		this.transDate = null;
	}
	public Account(String firstName2, String lastName, float accBal2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + "\tfirstName=" + firstName + "\t lastNmae=" + lastNmae + "\t accBal="
				+ accBal + ", transDate=" + transDate ;
	}
}
