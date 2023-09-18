package com.demo.springbootdemoapi.repositorys;

import com.demo.springbootdemoapi.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, String> {
}
