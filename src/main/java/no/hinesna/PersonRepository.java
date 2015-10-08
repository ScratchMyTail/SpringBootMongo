package no.hinesna;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by christerhansen on 06.10.15.
 */
public interface PersonRepository extends MongoRepository<Person, String>{
    public List<Person> findAll();
    public Person save(Person person);
}
