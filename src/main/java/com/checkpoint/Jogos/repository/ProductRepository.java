package com.checkpoint.Jogos.repository;

import com.checkpoint.Jogos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends JpaRepository<Product, Integer> {
}
