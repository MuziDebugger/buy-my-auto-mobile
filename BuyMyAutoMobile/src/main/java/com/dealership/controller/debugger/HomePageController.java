package com.dealership.controller.debugger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.repository.auto.debugger.CarRepository;
import org.springframework.web.bind.annotation.PathVariable;
import com.service.dealership.debugger.DealershipService;


@Controller
public class HomePageController {

	private static final Logger logger = LoggerFactory.getLogger(HomePageController.class);
		private DealershipService dealershipService;

		@Autowired
		public HomePageController(DealershipService dealershipService){
			this.dealershipService = dealershipService;
		}
		
		@RequestMapping("/")
		public String home(Model model){
			model.addAttribute("ourCars", dealershipService.carList());
			return "carsHome"; // Return one that lists cars alphabetically
			
			// create a folder called ourCars
			// create a file called carsHome.html this is our home page 
			// return carsHome in the home method
			// Insert the necessary details about the home page. The home page should have an introduction
			// and a list of available cars in other words where buyer is null 
			// The user can view/has access to this page 
			// The car.List() method calls all the cars from the DealershipService class 
		}
		
	}