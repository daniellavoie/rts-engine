package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "TerritoryBuilder")
public class Territory {

	@JsonPOJOBuilder(withPrefix = "")
	public static class TerritoryBuilder {

	}
}
