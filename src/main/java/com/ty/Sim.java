package com.ty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String provider;
private String type;
@Column(nullable = false)
private double cost;
@Column(unique = true,length=10)
private long phno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProvider() {
	return provider;
}
public void setProvider(String provider) {
	this.provider = provider;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

}
