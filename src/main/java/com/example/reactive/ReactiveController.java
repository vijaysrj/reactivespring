package com.example.reactive;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {

	@Autowired
	private ReactiveRepository repo;

	@RequestMapping(value = "/superhero", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Superhero> getSuperHero() {

		
		return repo.findAll().delayElements(Duration.ofSeconds(3));

	}

	@PostMapping("/superhero")
	public Mono<Superhero> addSuperHero(@RequestBody Superhero hero) {

		return repo.save(hero);

	}
}
