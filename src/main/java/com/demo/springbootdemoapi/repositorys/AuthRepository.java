package com.demo.springbootdemoapi.repositorys;

import com.demo.springbootdemoapi.models.Auth;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepository extends CrudRepository<Auth, String> {
}
