package com.siili.wall.Domain;

import javax.persistence.*;

@Entity(name="Board")
@Table(name="board")
public class Board {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long boardid;
    private String boardname;

    public Board(){}

    public Board(String boardname){
        super();
        this.boardname = boardname;
    }

    // GETTERS
    public Long getBoardid() {
        return boardid;
    }

    public String getBoardname() {
        return boardname;
    }

    // SETTERS
    public void setBoardid(Long boardid) {
        this.boardid = boardid;
    }

    public void setBoardname(String boardname) {
        this.boardname = boardname;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardid=" + boardid +
                ", boardname='" + boardname + '\'' +
                '}';
    }
}