package main.com.masm.petclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter

public class Owner extends Person {


    private String address;
    private String city;
    private String telephone;

    public Owner() {

    }

    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }
}
