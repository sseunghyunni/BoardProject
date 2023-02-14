package com.example.board.Service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.Cast;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardRepository repository;

    public Optional<Board> getname(){
        int i = 2;
        return repository.findById(i);
    }
}
