package com.elvisjacob.showroom.resources;

import java.util.List;

import com.elvisjacob.showroom.hibernate.entity.BrandEntity;
import com.elvisjacob.showroom.services.BrandService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	
	BrandService service = new BrandService(); 
	
	@GET
	@Path("/brands")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands() {
		List<BrandEntity> brands = service.getBrands();
		return brands;
	}
	
	@POST
	@Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	public void postBrands(BrandEntity brand) {
		service.addBrand(brand);
	}
	
	@PUT
	@Path("/brands/{brandID}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandID") int brandID, BrandEntity updatedBrand) {
		updatedBrand.setBrandID(brandID);
		service.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteBrands(@PathParam("brandID") int brandID) {
		service.deleteBrand(brandID);
	}

}
