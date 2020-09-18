package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "NationBuilder")
public class Nation {

	@JsonPOJOBuilder(withPrefix = "")
	public static class NationBuilder {

	}
}
