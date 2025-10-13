package com.andres.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.andres.curso.springboot.backend.backend_products.entities.Product;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "products") //Esta anotacion genera totalmente el CRUD con su controller 
public interface ProductRepository extends CrudRepository<Product, Long> {
}
