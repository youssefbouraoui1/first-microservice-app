package net.bouraoui.customerservice.Controllers;


import lombok.AllArgsConstructor;
import net.bouraoui.customerservice.Entities.Customer;
import net.bouraoui.customerservice.Repository.CustomerRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers/")
@AllArgsConstructor
public class CustomerController {

    private CustomerRepo customerRepo;

    @GetMapping("{id}")
    Customer findById(@PathVariable Long id) {
        return customerRepo.findById(id).get();
    }
}
