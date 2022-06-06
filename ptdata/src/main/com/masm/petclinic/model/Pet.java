package main.com.masm.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by jt on 7/13/18.
 */
@Setter
@Getter

public class Pet extends BaseEntity{

    private String name;


    private PetType petType;


    private Owner owner;


    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }
}
