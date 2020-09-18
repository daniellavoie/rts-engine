package dev.daniellavoie.rtsengine.core.repository;

import java.util.Optional;

import dev.daniellavoie.rtsengine.core.game.GameState;

public interface GameStateRepository {
	Optional<GameState> findById(String guid);
	
	GameState save(GameState gameState);
}
