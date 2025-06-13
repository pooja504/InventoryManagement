package com.pooja.product.inventorymanagement.repository;

import com.pooja.product.inventorymanagement.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends MongoRepository<Product,String> {
}
