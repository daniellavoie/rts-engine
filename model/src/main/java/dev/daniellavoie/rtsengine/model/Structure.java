package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "StructureBuilder")
public class Structure {

	@JsonPOJOBuilder(withPrefix = "")
	public static class StructureBuilder {

	}
}
