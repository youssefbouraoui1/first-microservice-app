package net.bouraoui.bankaccountservice.Controllers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import net.bouraoui.bankaccountservice.Clients.CustomerRestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts/")
@AllArgsConstructor
public class AccountController {

    private CustomerRestClient customerRestClient;

    @GetMapping("hello")
    public String getAccount() {
        return "This is the account";
    }
}
