package com.example.practice2.domain.service;

import com.example.practice2.domain.persentation.dto.request.BoardRequest;
import com.example.practice2.domain.persentation.dto.response.BoardIdResponse;
import com.example.practice2.domain.persentation.dto.response.BoardResponse;
import com.example.practice2.domain.presistence.Board;
import com.example.practice2.domain.presistence.BoardRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor//일단 이걸로 해놓고 이따 보자
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardIdResponse writeBoard(BoardRequest request) {
        //일단 유저 확인은 나중에

        Board board = boardRepository.save(
                Board.builder()
                        .Title(request.getTitle())
                        .Content(request.getContent())
                        .build()
        );

        return new BoardIdResponse(board.getId());
    }


    public BoardResponse findBoard(int BoardId) {
        Board board = boardRepository.findById(BoardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION)
        return new BoardResponse(board);
    }


    public BoardIdResponse updateBoard(int BoardId, BoardRequest request) {
        Board board = boardRepository.save(
                Board.builder()
                        .Title(request.getTitle())
                        .Content(request.getContent())
                        .build()
        );
        return new BoardIdResponse(board.getId());
    }


    public void deleteBoard(int BoardId) {
        Board board = boardRepository.findById(BoardId)
                .orElseThrow(() -> BoardNotFoundException.EXCEPTION);

        boardRepository.delete(board);
    }
}
