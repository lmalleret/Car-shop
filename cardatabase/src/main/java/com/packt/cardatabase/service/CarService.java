package com.packt.cardatabase.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.packt.cardatabase.domain.Car;

@Service
public class CarService {

	@PreAuthorize("hasRole('USER')")
	public void updateCar(Car car) {
		// This method can be invoked by user with USER role.
	}

	@PreAuthorize("hasRole('ADMIN')")
	public void deleteOwner(Car car) {
		// This method can be invoked by user with ADMIN role.
	}

}
