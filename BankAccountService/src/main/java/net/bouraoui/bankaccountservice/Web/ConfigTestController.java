package net.bouraoui.bankaccountservice.Web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigTestController {

    @Value("${global.params.p1}")
    private int p1;
    @Value("${global.params.p2}")
    private int p2;
    @Value("${customer.params.a}")
    private int a;
    @Value("${customer.params.b}")
    private int b;

    @GetMapping("/testconfig")
    public Map<String,Integer> test() {
        return Map.of("p1", p1, "p2", p2,"a", a, "b", b);
    }
}
