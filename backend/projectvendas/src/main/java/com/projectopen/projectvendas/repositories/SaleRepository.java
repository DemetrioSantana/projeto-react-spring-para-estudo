package com.projectopen.projectvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectopen.projectvendas.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
