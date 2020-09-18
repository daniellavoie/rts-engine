package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "PlayerBuilder")
public class Player {
	
	@JsonPOJOBuilder(withPrefix = "")
    public static class PlayerBuilder {

    }
}
