package com.example.board.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.board.entity.Board;

public interface BoardRepository extends CrudRepository<Board,Integer> {
}
