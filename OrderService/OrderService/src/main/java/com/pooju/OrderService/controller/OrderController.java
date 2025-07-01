package com.pooju.OrderService.controller;


import com.pooju.OrderService.model.Orders;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pooju.OrderService.service.OrderService;

@RestController
@RequestMapping("/Orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/placeorder")
    public ResponseEntity<Orders> PlacrOrder(@RequestBody Orders order){

        return ResponseEntity.ok(orderService.PlaceOrder(order));
    }
}
