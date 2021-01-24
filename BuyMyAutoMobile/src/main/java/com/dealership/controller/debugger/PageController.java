package com.dealership.controller.debugger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.dealership.debugger.DealershipService;

@Controller
@RequestMapping("/ourCars") // resource for cars set cars in ourCars.html file
public class PageController {
	
		
		private static final Logger logger = LoggerFactory.getLogger(PageController.class);
		
		private DealershipService dealership;
		
		@Autowired
		public PageController(DealershipService dealership) {
			this.dealership = dealership;
		}

		@RequestMapping("/list") 
		public String listCars(Model model) {
			model.addAttribute("cars", dealership.carList()); 
			return "cars/carsHome";
		}
		
		
}

