package com.projectopen.projectvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectopen.projectvendas.dto.SaleDTO;
import com.projectopen.projectvendas.model.Sale;
import com.projectopen.projectvendas.repositories.SaleRepository;
import com.projectopen.projectvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		this.sellerRepository.findAll();
			Page<Sale> result = this.repository.findAll(pageable);
			return result.map(s -> new SaleDTO(s));
	}
}
