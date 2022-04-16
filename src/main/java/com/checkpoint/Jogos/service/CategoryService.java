package com.checkpoint.Jogos.service;


import com.checkpoint.Jogos.dto.CategoryDto;
import com.checkpoint.Jogos.model.Category;
import com.checkpoint.Jogos.model.Product;
import com.checkpoint.Jogos.repository.CategoryRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> listAll() {
        return categoryRepository.findAll();
    }

    public Category find(Integer id) {
        return categoryRepository.findById(id).get();
    }

    public CategoryDto save(CategoryDto categoryDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto, category);
        category = categoryRepository.save(category);
        return new CategoryDto(category);
    }

    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category update(String name, Integer id) {
        Category category = categoryRepository.findById(id).get();
        category.setName(name);
        return categoryRepository.save(category);
    }







}
