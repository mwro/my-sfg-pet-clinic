package guru.springframework.mysfgpetclinic.bootstrap;

import guru.springframework.mysfgpetclinic.model.Owner;
import guru.springframework.mysfgpetclinic.model.Vet;
import guru.springframework.mysfgpetclinic.services.OwnerService;
import guru.springframework.mysfgpetclinic.services.VetService;
import guru.springframework.mysfgpetclinic.services.map.OwnerMapService;
import guru.springframework.mysfgpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner michael = new Owner();
        michael.setId(1L);
        michael.setFirstName("Michael");
        michael.setLastName("Weston");

        ownerService.save(michael);

        Owner fiona = new Owner();
        fiona.setId(2L);
        fiona.setFirstName("Fiona");
        fiona.setLastName("Glenanne");

        ownerService.save(fiona);

        System.out.println("Loaded owners");

        Vet sam = new Vet();
        sam.setId(1L);
        sam.setFirstName("Sam");
        sam.setLastName("Axe");

        vetService.save(sam);

        Vet jessie = new Vet();
        jessie.setId(2L);
        jessie.setFirstName("Jessie");
        jessie.setLastName("Parker");

        vetService.save(jessie);

        System.out.println("Loaded vets");
    }
}
