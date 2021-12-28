package org.prafull.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.prafull.DAO.ProductDAO;
import org.prafull.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
	
	@Autowired
	private ProductDAO productDao;
	
	@RequestMapping("/")
	public String hello(Model m) {
		
		List<Product> products =  productDao.getProducts();
		
		m.addAttribute("products",products);
		
		return "index";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(Model model) {
		
		model.addAttribute("title","Add Product");
		return "addProductForm";
	}
	
	@RequestMapping(value = "/addToDB", method = RequestMethod.POST)
	public RedirectView addToDB(@ModelAttribute Product product, HttpServletRequest request) {
		
		productDao.createProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	
	
	@RequestMapping(value = "/toDeleteFromDB/{productID}")
	public RedirectView toDeleteFromDB(@PathVariable("productID") int productID, HttpServletRequest request) {
		
		this.productDao.deleteProduct(productID);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
	}
	
	
	@RequestMapping(value = "/updateDetails/{productID}")
	public String updateDetails(@PathVariable("productID") int productID, Model model) {
		
		Product product = this.productDao.getProduct(productID);
		
		model.addAttribute("product",product);
		
		
		return "updateDetails";
	}
	
	
	
	
}
