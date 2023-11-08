package ie.atu.customerservice.customerservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Customer-service", url = "http://localhost:8082")
public class CustomerClient {
}
