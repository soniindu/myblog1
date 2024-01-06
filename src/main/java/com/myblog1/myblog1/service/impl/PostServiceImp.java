package com.myblog1.myblog1.service.impl;

import com.myblog1.myblog1.entity.Post;
import com.myblog1.myblog1.payload.PostDto;
import com.myblog1.myblog1.repository.PostRepository;
import com.myblog1.myblog1.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService {

    private PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());


        Post savedPost = postRepository.save(post);

        PostDto dto= new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(dto.getDescription());
        dto.setContent(dto.getContent());



        return dto;
    }
}
