package com.pooju.inventory_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Request {
    @JsonProperty(value = "id")
    private String productId;
    private long quantity;
}
