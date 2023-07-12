package com.example.practice2.domain.persentation;


import com.example.practice2.domain.persentation.dto.request.BoardIdRequest;
import com.example.practice2.domain.persentation.dto.request.BoardRequest;
import com.example.practice2.domain.persentation.dto.response.BoardIdResponse;
import com.example.practice2.domain.persentation.dto.response.BoardResponse;
import com.example.practice2.domain.presistence.BoardRepository;
import com.example.practice2.domain.service.BoardService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @PostMapping("/board")
    public BoardIdResponse writeBoard(@RequestBody BoardRequest request) {
        return boardService.writeBoard(request);
    }

   @GetMapping("/board/{boardId}")
    public BoardResponse findBoard(@PathVariable int BoardId) {
        return boardService.findBoard(BoardId);
   }

   @PatchMapping("/board/{boardId")
    public BoardIdResponse updateBoard(@PathVariable int BoardId, @RequestBody BoardRequest request) {
        return boardService.updateBoard(BoardId, request);
   }

   @DeleteMapping("/board/{boardId}")
    public void deleteBoard(@PathVariable int BoardId) {
        boardService.deleteBoard(BoardId);
   }
}
