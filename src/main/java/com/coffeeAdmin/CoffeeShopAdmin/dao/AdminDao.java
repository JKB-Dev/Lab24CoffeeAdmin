package com.coffeeAdmin.CoffeeShopAdmin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.coffeeAdmin.CoffeeShopAdmin.entity.Item;

@Repository
@Transactional
public class AdminDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Item>findAll() {
		return em.createQuery("From Items", Item.class).getResultList();
	}
}
