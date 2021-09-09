package com.projectopen.projectvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectopen.projectvendas.dto.SaleDTO;
import com.projectopen.projectvendas.dto.SaleSuccessDTO;
import com.projectopen.projectvendas.dto.SaleSumDTO;
import com.projectopen.projectvendas.service.SaleService;

@RestController
@RequestMapping(value = "sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = this.service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	 
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupeBySeller(){
		List<SaleSumDTO> list = this.service.amountGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupeBySeller(){
		List<SaleSuccessDTO> list = this.service.successGroupeBySeller();
		return ResponseEntity.ok(list);
	}
	
}