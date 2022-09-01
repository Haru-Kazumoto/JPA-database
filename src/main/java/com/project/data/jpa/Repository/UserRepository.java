package com.project.data.jpa.Repository;

import com.project.data.jpa.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
