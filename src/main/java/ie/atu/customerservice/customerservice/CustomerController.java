package ie.atu.customerservice.customerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer/{customerId}")
    public CustomerDetails getCustomerById(@PathVariable int customerId){
        return customerService.getCustomerById(customerId);
    }

}
