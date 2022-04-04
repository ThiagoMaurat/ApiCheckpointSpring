package com.checkpoint.Jogos.service;

import com.checkpoint.Jogos.model.Product;
import com.checkpoint.Jogos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> listAll() {
        return repository.findAll();
    }

    @Override
    public Product find(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Product save(Product produto) {
        return repository.save(produto);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Product> findByCategory(String categoria) {
        List<Product> produtos = new ArrayList<>();
        repository.findAll().forEach(produtos::add);
        List<Product> produtosFiltrados = new ArrayList<>();
        for (Product produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }

    @Override
    public Product update(String categoria, String descricao, ArrayList<String> imagem , Double preco, String sistema, Integer id, String titulo) {
        Product produto = repository.findById(id).get();
        produto.setCategoria(categoria);
        produto.setDescricao(descricao);
        produto.setImagem(imagem);
        produto.setPreco(preco);
        produto.setSistema(sistema);
        produto.setTitulo(titulo);
        return repository.save(produto);
    }


}
