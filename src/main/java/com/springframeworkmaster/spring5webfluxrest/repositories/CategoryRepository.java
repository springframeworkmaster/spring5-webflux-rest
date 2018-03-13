package com.springframeworkmaster.spring5webfluxrest.repositories;

import com.springframeworkmaster.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}
