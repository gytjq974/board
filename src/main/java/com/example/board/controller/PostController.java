package com.example.board.controller;

import com.example.board.entity.Board;
import com.example.board.entity.Post;
import com.example.board.repository.BoardRepository;
import com.example.board.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Slf4j
@Controller
public class PostController {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    PostRepository postRepository;

    @GetMapping("/post/{id}")
    public String getPostList(@PathVariable Long id, Model model){
        //모든 데이터를 가져옴
        List<Board> boardList = (List<Board>)boardRepository.findAll();
        List<Post> postList = postRepository.findByBoardId(id);

        Post post = postRepository.findById(id).orElse(null);

        //가져온 데이터를 모델에 등록
        model.addAttribute("boardList", boardList);
        model.addAttribute("post", post);

        //보여줄 페이지 설정
        return "Post";
    }
}
