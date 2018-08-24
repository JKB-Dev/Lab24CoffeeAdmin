package com.coffeeAdmin.CoffeeShopAdmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.coffeeAdmin.CoffeeShopAdmin.dao.AdminRepository;
import com.coffeeAdmin.CoffeeShopAdmin.entity.Item;

@Controller
public class AdminController {

	@Autowired
	AdminRepository adminDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("products", adminDao.findAll());
		return mv;
	}
	
	@RequestMapping("/item/{id}/edit")	// {id} is placeholder, here doesn't include $
	public ModelAndView showEditForm(@PathVariable("id") int id) {  // annotation pulls id from view
		ModelAndView mv = new ModelAndView("item-editor"); 
		mv.addObject("title", "Edit Item");
		mv.addObject("item", adminDao.findById(id).orElse(null)); 
		return mv;
	}
	
	@RequestMapping("/item/{id}/delete") // {id} is placeholder, here doesn't include $
	public void deleteItem(Item item) {
		adminDao.delete(item); 
	}
	
	@RequestMapping("item/create")
	public ModelAndView submitEditForm(Item item) {
		ModelAndView mv = new ModelAndView("item-add");  //TODO: implement this page
		adminDao.save(item);
		return mv;
	}
	
//	@RequestMapping("/item")
//	public ModelAndView listItem(@PathVariable("id") int id) {
//		ModelAndView mv = new ModelAndView("list-item");
//		mv.addObject("items", adminDao.delete(item, integer));
//		mv.addObject("items", adminDao.findAll());
//		new dao methods
//		mv.addObject("items", adminDao.findByNameContaining(keyword));
//		mv.addObject("items", adminDao.findByCategory(category));
//		mv.addObject("items", adminDao.findAllCategories());
//		
//		
//		return mv;
//	}
	
}
