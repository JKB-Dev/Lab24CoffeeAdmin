package com.coffeeAdmin.CoffeeShopAdmin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeAdmin.CoffeeShopAdmin.dao.AdminRepository;
import com.coffeeAdmin.CoffeeShopAdmin.entity.Item;

@Controller
public class AdminController {

	@Autowired
	AdminRepository repository;
	
	// admin home page
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("products", repository.findAll());
		return mv;
	}
	
	// item edit page, loads current values
	@RequestMapping("/item/{id}/edit")
	public ModelAndView showEditForm(@PathVariable("id") int id) { // path variable is the product selected by user input
		ModelAndView mv = new ModelAndView("item-editor"); // calls .jsp view
		mv.addObject("title", "Edit Item");
		mv.addObject("item", repository.findById(id).orElse(null)); 
		return mv;
	}
	
	// save new values from edit page, returns user to home
	@PostMapping("/item/{id}/edit")
	public ModelAndView editItem(Item item, @PathVariable("id") int id) { // path variable is the product selected by user input
		item.setItem_id(id);	// entity method chooses existing product to modify
		repository.save(item);	// calling respository method to save or update
		return new ModelAndView("redirect:/"); // return to index after save
	}
	
	// add-item page
	@RequestMapping("item/create") // from href
	public String showAddForm() {
		return "item-add"; // calls item-add.jsp
	}
	
	// create new item from user input, returns user to home
	@PostMapping("item/create")
	public ModelAndView addItemForm(@RequestParam("name") String name, 
			@RequestParam("description") String description,
			@RequestParam("quantity") int quantity, @RequestParam("price") String price) { // item properties to be described
		Item item = new Item(name, description, quantity, price); // calling ID-less constructor
		ModelAndView mv = new ModelAndView("redirect:/"); // return to index when item is created
		repository.save(item); // calling respository method to save or update
		return mv;
	}
	
	// delete item, refreshes home page
	@RequestMapping("/item/{id}/delete")
	public ModelAndView deleteItem(@PathVariable("id") int id) {
		repository.deleteById(id); 
		return new ModelAndView("redirect:/");
	}
	
}
