package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "RoleBuilder")
public class Role {

	@JsonPOJOBuilder(withPrefix = "")
	public static class RoleBuilder {

	}
}
