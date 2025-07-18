package com.pooju.inventory_service.controller;


import com.pooju.inventory_service.dto.Request;
import com.pooju.inventory_service.dto.Response;
import com.pooju.inventory_service.model.Stocks;
import com.pooju.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/getstocks")
    public ResponseEntity<List<Response>> isInStock(@RequestBody List<Request> request){
        return ResponseEntity.ok(inventoryService.checkInStock(request));
    }

    @PostMapping("/addstocks")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void addStock(@RequestBody List<Stocks> stonk){
        inventoryService.addStocks(stonk);

    }
    @GetMapping
    public String hello(){
        return "Hi i am inventory service";
    }

}
