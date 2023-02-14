package com.example.board.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    private int num;
    private String title;
    private String content;
    private String id;
    private java.sql.Date post_date;
    private int visit_count;

}
