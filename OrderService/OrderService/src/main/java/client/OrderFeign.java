package client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Order", url = "http://localhost:8082")
public interface OrderFeign {


}
