package com.example.board.Controller;

import com.example.board.Service.BoardServiceImpl;
import com.example.board.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.board.Service.BoardService;

import java.util.Optional;

@Controller
public class BoardController {
    @Autowired
    BoardService service;

    @GetMapping("b")
    public void getname(){
        Optional<Board> boardOpt = service.getname();
        if(boardOpt.isPresent()){
            System.out.println(boardOpt.get());
        }else{
            System.out.println("데이터 없음");
        }
    }
}
