package com.codewithamol.blog.services;

import java.util.List;

import com.codewithamol.blog.payloads.PostDto;
import com.codewithamol.blog.payloads.PostResponse;

public interface PostService {
    
    // Create
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
    
    // Update
    PostDto updatePost(PostDto postDto, Integer postId);
    
    // Delete
    void deletePost(Integer postId);
    
    // Get all posts
    PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
    
    // Get single post
    PostDto getPostById(Integer postId);
    
    // Get all posts by category
    List<PostDto> getPostByCategory(Integer categoryId);
    
    // Get all posts by user
    List<PostDto> getPostByUser(Integer userId);
    
    // Search all posts
    List<PostDto> searchPost(String keyword);
}
