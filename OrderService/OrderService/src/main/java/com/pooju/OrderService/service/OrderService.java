package com.pooju.OrderService.service;


import com.pooju.OrderService.client.OrderFeign;
import com.pooju.OrderService.dto.ResponseStockDto;
import com.pooju.OrderService.model.OrderedProducts;
import com.pooju.OrderService.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pooju.OrderService.repository.OrderRepo;

import java.util.ArrayList;
import java.util.List;


@Service

public class OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderFeign orderFeignClient;


    public void PlaceOrder(Orders order){

        List<OrderedProducts> orderedProductsList= order.getProductsList();
        List<ResponseStockDto> responseStockDtos = orderFeignClient.getStock(orderedProductsList);
        List<OrderedProducts> availableProducts=new ArrayList<>();
        orderedProductsList.forEach(
                eachProduct -> {

                    boolean found=false;
                    int a=-1;
                    responseStockDtos.forEach(
                            eachAvailableProduct ->{
                                if (eachProduct.getProductId().equals(eachAvailableProduct.getProductID())){
                                    found=true;
                                }

                                if (eachAvailableProduct.isInStock()){
                                    a=1;
                                    availableProducts.add(eachProduct);
                                }else {
                                    a=0;
                                    availableProducts.add(eachProduct);
                                }


                            }
                    );
                    if (!found){
                        a=-1;
                    }

                }
        );




    }
}
