package in.ineuron.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.beans.Customer;
import in.ineuron.service.ICustomerService;

//@RequestMapping("/controller")
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping("/list")
	public String getHomePage(Map<String, Object> model) {
		List<Customer> allCustomer = service.getAllCustomer();
		allCustomer.forEach(System.out::println);
		model.put("customers", allCustomer);
		return "list-customer";
	}

	@GetMapping("/showform")
	public String getShowForm(Map<String, Object> model) {
		Customer customer = new Customer();
		model.put("customer", customer);
		return "ShowForm";
	}

	@PostMapping("/addcustomer")
	public String saveForm(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer);
		service.saveCustomer(customer);
		return "redirect:/customer/list";

	}

	@GetMapping("/showFormUpdate")
	public String updateForm(@RequestParam Integer customerId, Map<String, Object> map) {
		Customer customer = service.getCustomer(customerId);
		map.put("customer", customer);
		return "ShowForm";

	}

	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam Integer customerId, Map<String, Object> map) {
		service.DeleteCustomer(customerId);
		return "redirect:/customer/list";

	}

}
