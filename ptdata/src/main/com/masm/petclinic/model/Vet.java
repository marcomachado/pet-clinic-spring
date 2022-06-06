package main.com.masm.petclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter

public class Vet extends Person {

    public Vet(){}
    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
