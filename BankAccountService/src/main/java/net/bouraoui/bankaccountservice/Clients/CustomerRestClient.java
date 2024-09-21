package net.bouraoui.bankaccountservice.Clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import net.bouraoui.bankaccountservice.Models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMERSERVICE")
public interface CustomerRestClient {

    @GetMapping("/api/customers/{id}")
    //le nom du circuit est utile pour la config
    @CircuitBreaker(name = "customerService",fallbackMethod = "getDefaultCustomer")
    Customer findCustomerById(@PathVariable long id);

    default Customer getDefaultCustomer(Long id, Exception exception) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("NotAvailable");
        customer.setLastName("NotAvailable");
        customer.setEmail("NotAvailable");

        return customer;
    }
}
