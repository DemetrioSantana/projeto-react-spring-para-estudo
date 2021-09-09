package com.projectopen.projectvendas.dto;

import java.io.Serializable;

import com.projectopen.projectvendas.model.Seller;

public class SaleSumDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String SellerName;
	private Double sum;
	
	
	public SaleSumDTO(Seller seller, Double sum) {
		SellerName = seller.getName();
		this.sum = sum;
	}


	public String getSellerName() {
		return SellerName;
	}


	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
