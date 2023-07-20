/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.repository.Impl;

import com.tqh.pojo.Category;
import com.tqh.repository.CategoryRepository;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Category> getCategories() {
        Session session = this.factory.getObject().getCurrentSession();
        Query q = session.createQuery("FROM Category");
        return q.getResultList();
    }
}
