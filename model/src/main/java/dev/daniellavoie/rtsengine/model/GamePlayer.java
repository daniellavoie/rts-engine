package dev.daniellavoie.rtsengine.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "GamePlayerBuilder")
public class GamePlayer {
	Player player;
	
	@JsonPOJOBuilder(withPrefix = "")
    public static class GamePlayerBuilder {

    }
}
