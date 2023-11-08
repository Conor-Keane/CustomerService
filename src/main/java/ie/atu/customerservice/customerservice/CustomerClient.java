package ie.atu.customerservice.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Customer-service", url = "http://localhost:8082")
public class CustomerClient {
    @GetMapping("/customerId")
    CustomerDetails getCustomerById(@PathVariable("customerId") int customerId);

}
