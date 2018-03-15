package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private PersonRepository repository;

	@Test
	public void contextLoads() {
		repository.save(Person.builder().firstName("Terry").lastName("Martin").build());

		List<Person> allPeople = repository.findAll();
		assertThat(allPeople.size()).isEqualTo(1);
	}

}
