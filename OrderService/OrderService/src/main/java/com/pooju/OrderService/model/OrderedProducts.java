package com.pooju.OrderService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tableId;
    @JsonProperty(value = "id")
    private String productId;
    private int quantity;
}
