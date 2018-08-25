package com.coffeeAdmin.CoffeeShopAdmin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Item {		// implement persistable?
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	private String name;
	private String description;
	private int quantity;
	private String price;
	
	public Item () {
		item_id = 0;
		name = "";
		description = "";
		quantity = 0;
		price = "";
	}

	public Item(int item_id, String name, String description, int quantity, String price) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Item(String name, String description, int quantity, String price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

//	@Override
//	public boolean isNew(){
//		// implement
//	   }
//	@Override
//	public int getId() {
//		// implement
//	}
	
	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
}
