/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.controllers;

import com.tqh.service.CategoryService;
import com.tqh.service.ProductService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
@PropertySource("classpath:configs.properties")
public class HomeController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private Environment env;
    
    @RequestMapping(path = {"/trang-chu/","/"})
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("products", this.productService.getProducts(params));
        model.addAttribute("categories", this.categoryService.getCategories());
        int pageSize = Integer.parseInt(this.env.getProperty("PAGE_SIZE"));
        long count = this.productService.countProduct();
        model.addAttribute("counter", Math.ceil(count *1.0 / pageSize));
        return "index";
    }
}
