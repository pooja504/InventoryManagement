package com.pooju.OrderService.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    @OneToMany(cascade=CascadeType.ALL)
    private List<OrderedProducts> productsList;
    private double totalPrice;

}
