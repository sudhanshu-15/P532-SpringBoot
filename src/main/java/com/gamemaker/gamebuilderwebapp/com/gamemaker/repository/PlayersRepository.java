package com.gamemaker.gamebuilderwebapp.com.gamemaker.repository;

import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Player, Integer> {
}
