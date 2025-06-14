package com.pooju.inventory_service.dto;

import lombok.Data;

@Data
public class Request {

    private String productId;
    private long quantity;
}
