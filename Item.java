package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ItemId;
	private String name;
	private double cost;
	
	@ManyToOne
	private AmazonOrder amazonOrder;

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public AmazonOrder getAmazonOrder() {
		return amazonOrder;
	}

	public void setAmazonOrder(AmazonOrder amazonOrder) {
		this.amazonOrder = amazonOrder;
	}

	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", name=" + name + ", cost=" + cost + ", amazonOrder=" + amazonOrder + "]";
	}
	
	
	
	
	
}
