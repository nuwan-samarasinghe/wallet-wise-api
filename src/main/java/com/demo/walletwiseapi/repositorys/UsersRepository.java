package com.demo.walletwiseapi.repositorys;

import com.demo.walletwiseapi.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, String> {
}
