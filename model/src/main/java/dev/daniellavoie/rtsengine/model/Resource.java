package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "ResourceBuilder")
public class Resource {
	ResourceType type;
	int amount;
	
	@JsonPOJOBuilder(withPrefix = "")
    public static class ResourceBuilder {

    }
}
