package com.project.back.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.back.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
