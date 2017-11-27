package com.springhibernateproject.controllers;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springhibernateproject.entities.Customer;
import com.springhibernateproject.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	@GetMapping("/list")	
	public String listcustomers(Model model){
		
		List<Customer> customerlist = customerservice.getCustomers();
		model.addAttribute("customers",customerlist);
		return "list-customers";
		
	}
	
	@GetMapping("/showformForAdd")
	public String showForm(Model model){
		
		Customer customer = new Customer();
		model.addAttribute("customerdetails",customer);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customerdetails") Customer customer){
		customerservice.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("showFormUpdate")
	public String showFormUpdate(@RequestParam("id")int id, Model model){
		Customer costumer = customerservice.getCustomer(id);
		model.addAttribute("customerdetails", costumer);
		return "customer-form";
		
	}
	
	@GetMapping("deleteCustomer")
	public String deleteCustomer(@RequestParam("id")int id){
		customerservice.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	
}
