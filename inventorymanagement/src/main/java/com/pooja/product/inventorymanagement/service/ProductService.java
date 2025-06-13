package com.pooja.product.inventorymanagement.service;

import com.pooja.product.inventorymanagement.model.Product;
import com.pooja.product.inventorymanagement.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Productrepo productrepo;

    public void CreateProduct(Product product){
        productrepo.insert(product);

    }

    public List<Product> getAll(){
        return productrepo.findAll();
    }

    public Product getById(String id){
        if (productrepo.existsById(id)){
            return productrepo.findById(id).get();
        }else {
            return null;
        }
    }

    public boolean deleteById(String id){
        if(productrepo.existsById(id)){
            productrepo.deleteById(id);
            return true;
        }
        return false;

    }

    public void addAllProducts(List<Product> products){
        productrepo.insert(products);
    }

}
