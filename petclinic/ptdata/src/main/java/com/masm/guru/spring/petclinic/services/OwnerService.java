package com.masm.guru.spring.petclinic.services;

import com.masm.guru.spring.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);

}
