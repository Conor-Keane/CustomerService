package ie.atu.customerservice.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerClient customerClient;
    private List<CustomerDetails> CustomerLibrary = new ArrayList<>();

    public CustomerService(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    public CustomerDetails getCustomerById(int customerId {
        return customerClient.getCustomerById(customerId);
    }

}
