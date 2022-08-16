package pl.altkom.dkah.dogservice.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class CreateDogRequest {

    @NotNull
    private String name;
    @NotNull
    private String breed;
    @NotNull
    private Long ownerId;
}
