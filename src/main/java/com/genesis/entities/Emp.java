package com.genesis.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Emp {
	
	
	@Id
	private int eno;
	private String ename;
	private int esal;

	public Emp(int eno, String ename, int esal) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		
	}
	
	public Emp(int eno) {
		this.eno = eno;
	}
	public Emp() {
		super();
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {		
		String s= "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + "]";
		return s;
	}
	
	
	
}
