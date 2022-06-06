package main.com.masm.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * Created by jt on 7/13/18.
 */
@Getter
@Setter

public class Person extends BaseEntity {
    public Person(){}
    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
