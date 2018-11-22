/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.services;

import edu.poly.store.domain.Category;
import edu.poly.store.repositories.CategoryRepository;
import edu.poly.store.repositories.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * /**
 * This class is used to create, update, delete and retrieve category info with business rules
 * @author Nguyen Ngoc Anh - Email: anhnnpmp@gmail.com - Tel: 0905.119948
 */
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService() {
        categoryRepository = new CategoryRepository();
    }
    
    public Category addCategory(Category p) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        Transaction tx = null;
        Category category = null;
        try {
            tx = session.beginTransaction();

            category = categoryRepository.addCategory(p);
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
            throw new Exception(e);
        }finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
        return category;
    }

    public Category updateCategory(Category p) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        Transaction tx = null;
        Category category = null;
        try {
            tx = session.beginTransaction();

            category = categoryRepository.updateCategory(p);
            
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
            throw new Exception(e);
        }finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
        return category;
        
    }

    public List<Category> listCategories() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        try {
            return categoryRepository.listCategories();            
        } finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
    }
    public List<Category> findCategories(String name) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        try {
            return categoryRepository.findCategories(name);            
        } finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
    }

    public Category getCategoryById(int id) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        try {
            return categoryRepository.getCategoryById(id);            
        } finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
        
    }

    public void removeCategory(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        categoryRepository.setSession(session);
        Category category = null;
        try {
            categoryRepository.removeCategory(id);
        } finally{
            try{
                if (session != null)
                    session.close();
            }catch(Exception ex){}
        }
    }
}
