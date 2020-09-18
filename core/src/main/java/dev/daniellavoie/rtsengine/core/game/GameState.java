package dev.daniellavoie.rtsengine.core.game;

import java.util.HashMap;
import java.util.Map;

import dev.daniellavoie.rtsengine.model.Game;
import dev.daniellavoie.rtsengine.model.GamePlayer;
import lombok.Value;

@Value
public class GameState {
	Game game;
	Map<String, GamePlayer> gamePlayersById = new HashMap<>();

	public GameState(Game game) {
		this.game = game;
	}
}
