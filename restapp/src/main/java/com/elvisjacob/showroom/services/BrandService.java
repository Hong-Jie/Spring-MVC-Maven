package com.elvisjacob.showroom.services;

import java.util.List;

import com.elvisjacob.showroom.hibernate.DAO.BrandDAO;
import com.elvisjacob.showroom.hibernate.entity.BrandEntity;

public class BrandService {

	BrandDAO dao = new BrandDAO();
	
	public List<BrandEntity> getBrands() {
		return dao.getBrands();
	}

	public void addBrand(BrandEntity brand) {
		dao.addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		dao.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandID) {
		dao.deleteBrand(brandID);
		
	}


}
