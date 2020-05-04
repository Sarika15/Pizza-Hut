package com.pizza.bean;

public class Pizza {
	private int pid;
	private String pname;
	private String size;
	private double price;
	private int qant;
	
	public Pizza() {}

	public Pizza(int pid, String pname, String size, double price, int qant) {
		
		this.pid = pid;
		this.pname = pname;
		this.size = size;
		this.price = price;
		this.qant = qant;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQant() {
		return qant;
	}

	public void setQant(int qant) {
		this.qant = qant;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
public String toString() {
	return pid+"\t"+pname+"\t"+size+"\t"+price;
}
}
