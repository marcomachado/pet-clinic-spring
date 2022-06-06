package main.masm.petclinic.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }
}
