package dev.daniellavoie.rtsengine.core.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import dev.daniellavoie.rtsengine.core.game.GameState;

public class GameRepositoryStateImpl implements GameStateRepository {
	private final Map<String, GameState> gamesById = new HashMap<>();

	@Override
	public Optional<GameState> findById(String id) {
		return Optional.ofNullable(gamesById.get(id));
	}

	@Override
	public GameState save(GameState gameState) {
		return gamesById.put(gameState.getGame().getId(), gameState);
	}
}
