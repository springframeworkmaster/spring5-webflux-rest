package com.springframeworkmaster.spring5webfluxrest.controllers;

import com.springframeworkmaster.spring5webfluxrest.domain.Category;
import com.springframeworkmaster.spring5webfluxrest.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @RequestMapping("/api/v1/categories")
    public Flux<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @RequestMapping("/api/v1/categories/{id}")
    public Mono<Category> getById(@PathVariable String id){
        return categoryRepository.findById(id);
    }
}
