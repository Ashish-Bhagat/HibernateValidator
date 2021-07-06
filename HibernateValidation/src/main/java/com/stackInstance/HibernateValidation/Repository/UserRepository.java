package com.stackInstance.HibernateValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackInstance.HibernateValidation.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
