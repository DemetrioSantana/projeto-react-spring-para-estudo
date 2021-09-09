package com.projectopen.projectvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectopen.projectvendas.dto.SellerDTO;
import com.projectopen.projectvendas.service.SellerService;

@RestController
@RequestMapping(value = "sellers")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll() {
		List<SellerDTO> list = this.service.findAll();
		return ResponseEntity.ok(list);
	}
	
}