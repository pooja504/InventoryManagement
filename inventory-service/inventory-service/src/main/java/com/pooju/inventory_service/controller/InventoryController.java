package com.pooju.inventory_service.controller;


import com.pooju.inventory_service.dto.Request;
import com.pooju.inventory_service.dto.Response;
import com.pooju.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    public ResponseEntity<List<Response>> isInStock(@RequestBody List<Request> request){
        return ResponseEntity.ok(inventoryService.checkInStock(request));
    }

}
