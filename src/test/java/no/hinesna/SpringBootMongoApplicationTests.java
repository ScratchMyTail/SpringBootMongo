package no.hinesna;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootMongoApplication.class)
@WebAppConfiguration
public class SpringBootMongoApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void getAllPersons(){
		System.out.println(personRepository.findAll().size());
	}

	@Test
	public void testSave(){
		Person person = new Person();
		person.setFornavn("christer");
		person.setEtternavn("hansa");

		personRepository.save(person);
	}
}
