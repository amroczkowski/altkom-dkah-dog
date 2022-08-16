package pl.altkom.dkah.dogservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.altkom.dkah.dogservice.repository.model.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

    List<Dog> findByOwnerId(final Long ownerId);
}
