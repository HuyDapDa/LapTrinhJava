/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tqh.service;

import com.tqh.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface ProductService {
       List<Product> getProducts(Map<String, String> params);
       Long countProduct();
}
