package pl.altkom.dkah.dogservice.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Dog {

    @Id
    @GeneratedValue(generator = "dogSeq")
    @SequenceGenerator(name = "dogSeq", sequenceName = "dog_seq", allocationSize = 20)
    private Long id;

    private String name;
    private String breed;
    private Long ownerId;
}