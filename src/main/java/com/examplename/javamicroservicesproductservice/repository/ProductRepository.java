package com.examplename.javamicroservicesproductservice.repository;

import com.examplename.javamicroservicesproductservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
