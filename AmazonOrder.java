package com;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class AmazonOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
private String address;
private String status;
private long phno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "AmazonOrder [id=" + id + ", address=" + address + ", status=" + status + ", phno=" + phno + "]";
}


}
