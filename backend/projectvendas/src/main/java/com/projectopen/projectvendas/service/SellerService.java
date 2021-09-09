package com.projectopen.projectvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectopen.projectvendas.dto.SellerDTO;
import com.projectopen.projectvendas.model.Seller;
import com.projectopen.projectvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
			List<Seller> result = this.repository.findAll();
			return result.stream().map(s -> new SellerDTO(s)).collect(Collectors.toList());
	}
}
