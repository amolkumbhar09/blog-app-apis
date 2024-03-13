package com.codewithamol.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithamol.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
