package main.com.masm.petclinic.model;

import lombok.*;

import javax.persistence.Column;

/**
 * Created by jt on 7/13/18.
 */

@Setter
@Getter

public class PetType extends BaseEntity {

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Column(name = "name")
    private String name;


    @Override
    public String toString() {
        return name;
    }
}
