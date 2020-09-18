package dev.daniellavoie.rtsengine.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerdesTest {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().findAndRegisterModules();

	@Test
	public void assertSerdes() throws JsonProcessingException {
		var resource = Resource.builder().type(ResourceType.WOOD).amount(100).build();
		var json = OBJECT_MAPPER.writeValueAsString(resource);

		var deserializedResource = OBJECT_MAPPER.readValue(json, Resource.class);

		Assertions.assertEquals(resource.getType(), deserializedResource.getType());
		Assertions.assertEquals(resource.getAmount(), deserializedResource.getAmount());
	}
}
