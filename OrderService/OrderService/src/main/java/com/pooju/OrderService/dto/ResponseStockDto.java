package com.pooju.OrderService.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStockDto {

    private String productID;
    private boolean isInStock;
}
