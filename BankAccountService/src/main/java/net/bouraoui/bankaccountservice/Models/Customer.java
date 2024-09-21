package net.bouraoui.bankaccountservice.Models;


import lombok.*;

//c'est le même que customer entity dans customer service
@AllArgsConstructor@NoArgsConstructor@Getter@Setter@Builder
public class Customer {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
