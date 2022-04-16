package com.checkpoint.Jogos.service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.checkpoint.Jogos.dto.CategoryDto;
import com.checkpoint.Jogos.dto.ProductDto;
import com.checkpoint.Jogos.dto.ProductResponseDto;
import com.checkpoint.Jogos.model.Category;
import com.checkpoint.Jogos.model.Product;
import com.checkpoint.Jogos.repository.CategoryRepository;
import com.checkpoint.Jogos.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Product> listAll() {
        return repository.findAll();
    }

    public Product find(Integer id) {
        return repository.findById(id).get();
    }




    public ProductResponseDto save(ProductDto productDto) {
         Product product = new Product();
         BeanUtils.copyProperties(productDto, product);
         Optional<Category> category = categoryRepository.findById(productDto.getCategory());
         product.setCategory(category.get());

         return new ProductResponseDto(repository.save(product));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public List<Product> findByCategory(String category) {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public Product update(Category category, String description, ArrayList<String> images , Double price, String operatingSystem, Integer id, String title) {
        Product product = repository.findById(id).get();
        product.setCategory(category);
        product.setDescription(description);
        product.setImages(images);
        product.setPrice(price);
        product.setOperatingSystem(operatingSystem);
        product.setTitle(title);
        return repository.save(product);
    }


}
