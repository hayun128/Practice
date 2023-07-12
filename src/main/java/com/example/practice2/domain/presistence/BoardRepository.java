package com.example.practice2.domain.presistence;

import com.example.practice2.domain.presistence.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
