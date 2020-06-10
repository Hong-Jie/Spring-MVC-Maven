package com.elvisjacob.showroom.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="brands")
@Table(name="brands")
public class BrandEntity {
	@Id
	@Column(name="brand_id")
	private int brandID;
	@Column(name="brand_name")
	private String brandName;
	
	public BrandEntity() {
	}

	public BrandEntity(int brandID, String brandName) {
		super();
		this.brandID = brandID;
		this.brandName = brandName;
	}

	public int getBrandID() {
		return brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
