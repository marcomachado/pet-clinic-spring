package main.com.masm.petclinic.bootstrap;

import main.com.masm.petclinic.model.Owner;
import main.com.masm.petclinic.model.Vet;
import main.com.masm.petclinic.services.OwnerService;
import main.com.masm.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInit(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Creating init data!!!!");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("read");
        owner2.setAddress("123asd");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }
}
