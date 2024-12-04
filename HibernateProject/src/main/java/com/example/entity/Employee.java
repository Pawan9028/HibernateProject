package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //we write this annotation to those class which class going to be mapped with the database
//@Table(name = "Employee")
public class Employee {

	public Employee(int eid, String ename, String ecity) {
		super();
		Eid = eid;
		Ename = ename;
		Ecity = ecity;
	}
	 public Employee() {
	    }
	@Id // this annotation denotes the primary key
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Eid;
	private String Ename;
	private String Ecity;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEcity() {
		return Ecity;
	}

	public void setEcity(String ecity) {
		Ecity = ecity;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Ecity=" + Ecity + "]";
	}

}
