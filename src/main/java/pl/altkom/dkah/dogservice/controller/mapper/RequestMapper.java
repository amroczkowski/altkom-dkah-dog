package pl.altkom.dkah.dogservice.controller.mapper;

import pl.altkom.dkah.dogservice.controller.model.CreateDogRequest;
import pl.altkom.dkah.dogservice.controller.model.UpdateDogRequest;
import pl.altkom.dkah.dogservice.repository.model.Dog;

public class RequestMapper {

    public static Dog bind(final CreateDogRequest request) {
        final Dog dog = new Dog();
        dog.setName(request.getName());
        dog.setBreed(request.getBreed());
        dog.setOwnerId(request.getOwnerId());
        return dog;
    }

    public static Dog bind(final UpdateDogRequest request, final Dog destination) {
        destination.setName(request.getName());
        destination.setBreed(request.getBreed());
        destination.setOwnerId(request.getOwnerId());
        return destination;
    }
}
