package com.service.dealership.debugger;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.domain.dealership.debugger.OurCars;
import com.repository.auto.debugger.CarRepository;


public class DealershipService {
	
	private CarRepository carRepository;
	
	@Autowired
	public DealershipService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public OurCars getByMileage() {
		return carRepository.OrderByMileage();
	}
	
	public List<OurCars> carList() {
		return carRepository.listAllInAlphabeticalOrder();
	}
	
}