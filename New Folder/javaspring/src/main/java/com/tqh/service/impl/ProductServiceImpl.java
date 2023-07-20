/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.service.impl;

import com.tqh.pojo.Product;
import com.tqh.repository.ProductRepository;
import com.tqh.service.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.productRepo.getProducts(params);
    }

    @Override
    public Long countProduct() {
        return this.productRepo.countProducts();
    }
}
