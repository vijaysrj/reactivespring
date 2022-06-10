package com.example.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ReactiveRepository extends ReactiveMongoRepository<Superhero, String> {

}
