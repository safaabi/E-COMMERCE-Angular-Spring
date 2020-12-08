package com.ecommerce.ecommerces.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecommerce.ecommerces.entities.State;

@CrossOrigin("http://localhost:4200")
public interface StateRepository extends JpaRepository<State,Integer> {
	List<State> findByCountryCode(@Param("code") String code); 

}
