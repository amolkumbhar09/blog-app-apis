package com.codewithamol.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithamol.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
