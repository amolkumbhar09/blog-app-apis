package com.codewithamol.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codewithamol.blog.entities.Category;
import com.codewithamol.blog.entities.Post;
import com.codewithamol.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

	@Query("select p from Post p where p.post_title like :key")
	List<Post> searchByTitle(@Param("key") String title);

}
