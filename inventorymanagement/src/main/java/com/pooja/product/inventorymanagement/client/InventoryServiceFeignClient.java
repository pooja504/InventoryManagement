package com.pooja.product.inventorymanagement.client;


import com.pooja.product.inventorymanagement.dto.Stocks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "inventoryClient", url = "http://localhost:8082/inventory")
public interface InventoryServiceFeignClient {

    @PostMapping("/addstocks")
    public void addProductToInventory(@RequestBody List<Stocks> stocks);

}
