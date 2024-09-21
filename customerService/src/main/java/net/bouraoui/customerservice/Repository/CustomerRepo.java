package net.bouraoui.customerservice.Repository;

import net.bouraoui.customerservice.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
