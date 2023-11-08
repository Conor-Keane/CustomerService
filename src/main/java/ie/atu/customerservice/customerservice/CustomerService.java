package ie.atu.customerservice.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@FeignClient(name = "Customer-service", url = "http://localhost:8082")
public class CustomerService {
    private List<CustomerDetails> CustomerLibrary = new ArrayList<>();

    public List<CustomerDetails> getCustomerById() {
        return CustomerLibrary;
    }
}
