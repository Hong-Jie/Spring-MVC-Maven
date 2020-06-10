package com.elvisjacob.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.elvisjacob.showroom.hibernate.entity.BrandEntity;

public class BrandDAO {
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
												.addAnnotatedClass(BrandEntity.class)
												.buildSessionFactory();

	public List<BrandEntity> getBrands() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<BrandEntity> brands = session.createQuery("from brands").getResultList();
		return brands;
	}

	public void addBrand(BrandEntity brand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();
	}

	public void updateBrand(BrandEntity updatedBrand) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int id = updatedBrand.getBrandID();
		BrandEntity brand = session.get(BrandEntity.class, id);
		brand.setBrandName(updatedBrand.getBrandName());
		session.getTransaction().commit();
	}

	public void deleteBrand(int brandID) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand = session.get(BrandEntity.class, brandID);
		session.delete(brand);
		session.getTransaction().commit();
	}
	
	
}
