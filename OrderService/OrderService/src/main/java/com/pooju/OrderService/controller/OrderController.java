package com.pooju.OrderService.controller;


import com.pooju.OrderService.model.Orders;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pooju.OrderService.service.OrderService;

@RestController
@RequestMapping
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeorder")
    public ResponseEntity<Orders> PlacrOrder(@RequestBody Orders order){

        return ResponseEntity.ok(orderService.PlaceOrder(order));
    }

    @GetMapping
    public String hello(){
        return "Hi i am order service";
    }
}
