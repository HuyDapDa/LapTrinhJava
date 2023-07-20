/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.service.impl;

import com.tqh.pojo.Category;
import com.tqh.repository.CategoryRepository;
import com.tqh.service.CategoryService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Admin
 */
@Service
public class CategoryServiceImpl implements CategoryService{
        @Autowired
    private CategoryRepository cateRepo;
    @Override
    public List<Category> getCategories() {
        return this.cateRepo.getCategories();
    }
}
