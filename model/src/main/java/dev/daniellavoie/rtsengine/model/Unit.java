package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "UnitBuilder")
public class Unit {

	@JsonPOJOBuilder(withPrefix = "")
	public static class UnitBuilder {

	}
}
