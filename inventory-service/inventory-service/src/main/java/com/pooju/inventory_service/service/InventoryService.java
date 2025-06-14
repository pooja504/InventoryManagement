package com.pooju.inventory_service.service;

import com.pooju.inventory_service.dto.Request;
import com.pooju.inventory_service.dto.Response;
import com.pooju.inventory_service.model.Stocks;
import com.pooju.inventory_service.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
     private final InventoryRepo inventoryRepo;


    public InventoryService(InventoryRepo inventoryRepo) {
        this.inventoryRepo = inventoryRepo;
    }

    public List<Response> checkInStock(List<Request> requests){

        List<Response> responseList=new ArrayList<>();
        requests.forEach(
                i->{
                    if (inventoryRepo.existsById(i.getProductId())){
                        long quantity = inventoryRepo.findById(i.getProductId()).get().getQuantity();
                        responseList.add(new Response(i.getProductId(), (i.getQuantity()<=quantity)));
                    }
                }
        );
        return responseList;
    }

}
