package com.pooja.product.inventorymanagement.controller;

import com.pooja.product.inventorymanagement.model.Product;
import com.pooja.product.inventorymanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Productcontroller {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody Product product){
        productService.CreateProduct(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getByID(@PathVariable String id){
        Product product = productService.getById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();

        }else {
            return ResponseEntity.ok(product);
        }

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable String id){
        if (productService.deleteById(id)){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addall")
    public ResponseEntity addAll(@RequestBody List<Product> products){

        productService.addAllProducts(products);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/all")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void deleteall(){
        productService.deleteAll();
    }


    @GetMapping
    public String hello(){
        return "Hi i am product service";
    }



}
