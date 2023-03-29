package com.seohee.springboot.web;

import com.seohee.springboot.service.posts.PostsService;
import com.seohee.springboot.web.dto.PostsResponseDto;
import com.seohee.springboot.web.dto.PostsSaveRequestDto;
import com.seohee.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    //2주차 과제
    @DeleteMapping("/api/v1/posts/{id}")
    public void deleteById(@PathVariable Long id) {
        postsService.deleteById(id);
    }
}
