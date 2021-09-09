package com.projectopen.projectvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectopen.projectvendas.dto.SaleSuccessDTO;
import com.projectopen.projectvendas.dto.SaleSumDTO;
import com.projectopen.projectvendas.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.projectopen.projectvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupeBySeller();
	
	@Query("SELECT new com.projectopen.projectvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupeBySeller();
	

}
