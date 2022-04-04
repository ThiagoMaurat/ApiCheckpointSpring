package com.checkpoint.Jogos.service;

import com.checkpoint.Jogos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product> listAll();
    Product find(Integer id);
    Product save(Product produto);
    void delete(Integer id);

    /*@Query("SELECT p FROM Product p WHERE p.category = ?1")*/
    List<Product> findByCategory(String categoria);

    @Query("UPDATE product p SET p.categoria = ?1, p.descricao = ?2, p.imagem = ?3, p.preco = ?4 WHERE p.sistema = ?5, p.id = ?6, p.titulo = ?7")
    Product update(String categoria, String descricao, ArrayList<String> imagem, Double preco, String sistema, Integer id, String titulo);
}


