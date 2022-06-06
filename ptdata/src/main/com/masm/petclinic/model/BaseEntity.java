package main.com.masm.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by jt on 7/18/18.
 */
@Getter
@Setter

public class BaseEntity implements Serializable {


    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
