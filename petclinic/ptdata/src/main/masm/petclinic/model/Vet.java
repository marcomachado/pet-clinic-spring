package main.masm.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter

public class Vet extends Person {

    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
