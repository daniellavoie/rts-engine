package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "GameBuilder")
public class Game {
	String id;
	int maxPlayers;
	
	@JsonPOJOBuilder(withPrefix = "")
    public static class GameBuilder {

    }
}
