package com.pooju.inventory_service.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Stock")
@Data
public class Stocks {

    @Id
    @Column(name = "Product id")
    private String id;
    private long quantity;
}
