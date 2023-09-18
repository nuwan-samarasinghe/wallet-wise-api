package com.demo.walletwiseapi.repositorys;

import com.demo.walletwiseapi.models.Auth;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepository extends CrudRepository<Auth, String> {
}
