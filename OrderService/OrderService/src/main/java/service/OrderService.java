package service;


import model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.OrderRepo;


@Service

public class OrderService {
    @Autowired
    private OrderRepo orderRepo;


    public void PlaceOrder(Orders order){
        orderRepo.save(order);
    }
}
