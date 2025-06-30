package com.pooju.OrderService.client;

import com.pooju.OrderService.dto.ResponseStockDto;
import com.pooju.OrderService.model.OrderedProducts;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "Order", url = "http://localhost:8082")
public interface OrderFeign {

    @GetMapping("/getstocks")
    public List<ResponseStockDto> getStock(@RequestBody List<OrderedProducts> products);

}
