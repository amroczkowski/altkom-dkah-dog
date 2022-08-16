package pl.altkom.dkah.dogservice.controller.model;

import lombok.Getter;

@Getter
public class UpdateDogRequest {

    private String name;
    private String breed;
    private Long ownerId;
}
