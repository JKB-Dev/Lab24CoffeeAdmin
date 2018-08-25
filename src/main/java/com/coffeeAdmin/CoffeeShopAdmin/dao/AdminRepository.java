package com.coffeeAdmin.CoffeeShopAdmin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeeAdmin.CoffeeShopAdmin.entity.Item;


public interface AdminRepository extends JpaRepository<Item, Integer>{
	
	
	List<Item> findByNameContaining(String keyword);

}
