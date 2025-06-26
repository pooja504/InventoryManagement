package com.pooja.product.inventorymanagement.service;

import com.pooja.product.inventorymanagement.client.InventoryServiceFeignClient;
import com.pooja.product.inventorymanagement.dto.Stocks;
import com.pooja.product.inventorymanagement.model.Product;
import com.pooja.product.inventorymanagement.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Productrepo productrepo;
    @Autowired
    private InventoryServiceFeignClient inventoryServiceFeignClient;

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

    public void deleteAll(){
        productrepo.deleteAll();
    }

    public void addAllProducts(List<Product> products){


        List<Stocks> stocksList = new ArrayList<>();

        products.forEach(
                eachproduct ->{
                    stocksList.add(new Stocks(eachproduct.getId(),eachproduct.getQuantity()));
                }
        );
        inventoryServiceFeignClient.addProductToInventory(stocksList);
        productrepo.insert(products);

    }

}
