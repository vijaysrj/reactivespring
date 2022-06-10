package com.example.reactive;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Superhero {

	
	@Id
	private String id;
	
	private String name;
	
	private int age;
}
