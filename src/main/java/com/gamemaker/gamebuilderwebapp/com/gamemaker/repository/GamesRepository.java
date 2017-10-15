package com.gamemaker.gamebuilderwebapp.com.gamemaker.repository;

import com.gamemaker.gamebuilderwebapp.com.gamemaker.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Score, Integer>{
}
