package com.pooju.inventory_service.repository;

import com.pooju.inventory_service.model.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Stocks,String> {
}
