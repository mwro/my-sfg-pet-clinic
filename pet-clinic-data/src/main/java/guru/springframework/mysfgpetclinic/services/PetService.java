package guru.springframework.mysfgpetclinic.services;

import guru.springframework.mysfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
