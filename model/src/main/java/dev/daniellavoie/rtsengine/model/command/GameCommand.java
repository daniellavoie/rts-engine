package dev.daniellavoie.rtsengine.model.command;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "GameCommandBuilder")
public class GameCommand {
	String playerId;
	GameCommandType type;

	@JsonPOJOBuilder(withPrefix = "")
	public static class GameCommandBuilder {

	}
}
