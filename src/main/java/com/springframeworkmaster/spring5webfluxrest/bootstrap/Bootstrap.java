package com.springframeworkmaster.spring5webfluxrest.bootstrap;

import com.springframeworkmaster.spring5webfluxrest.domain.Category;
import com.springframeworkmaster.spring5webfluxrest.domain.Vendor;
import com.springframeworkmaster.spring5webfluxrest.repositories.CategoryRepository;
import com.springframeworkmaster.spring5webfluxrest.repositories.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.activation.CommandObject;
import javax.activation.DataHandler;
import java.io.IOException;

@Component
public class Bootstrap implements CommandLineRunner{

    private final CategoryRepository categoryRepository;
    private final VendorRepository vendorRepository;

    public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
        this.categoryRepository = categoryRepository;
        this.vendorRepository = vendorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(categoryRepository.count().block() == 0){

            System.out.println("Loading data on bootstrap");

            categoryRepository.save(Category.builder()
                   .description("Fruits").build());
            categoryRepository.save(Category.builder()
                    .description("Nuts").build());
            categoryRepository.save(Category.builder()
                    .description("Breads").build());
            categoryRepository.save(Category.builder()
                    .description("Meat").build());
            categoryRepository.save(Category.builder()
                    .description("Eggs").build());

            System.out.println("Loaded Categories: " + categoryRepository.count().block());



            vendorRepository.save(Vendor.builder()
                    .firstName("Sai Krishna")
                    .lastName("Kalwakuntla").build());


            vendorRepository.save(Vendor.builder()
                    .firstName("Thirumal")
                    .lastName("Reddy").build());

            vendorRepository.save(Vendor.builder()
                    .firstName("Nithin")
                    .lastName("Reddy").build());

            vendorRepository.save(Vendor.builder()
                    .firstName("Nilam")
                    .lastName("Khadka").build());

            vendorRepository.save(Vendor.builder()
                    .firstName("Sai ")
                    .lastName("Kumar").build());

            vendorRepository.save(Vendor.builder()
                    .firstName("Sarika")
                    .lastName("Kalwakuntla").build());
            System.out.println("Loaded Categories: " + vendorRepository.count().block());
        }
    }
}
