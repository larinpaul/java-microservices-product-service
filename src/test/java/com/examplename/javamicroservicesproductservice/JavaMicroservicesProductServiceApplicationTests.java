package com.examplename.javamicroservicesproductservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class JavaMicroservicesProductServiceApplicationTests {

	// The test will start the MongoDB Container, by downloading mongo:4.4.2 image
	// And then it will add it to the spring.data.mongodb.uri dynamically
	// at the time of creating the test


	@Container
	MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo.4.4.2");

	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
	}

	@Test
	void contextLoads() {
	}



}
