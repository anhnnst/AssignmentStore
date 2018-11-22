/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.repositories;

import edu.poly.store.domain.Category;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * This class is used to create, update, delete and retrieve category records
 * @author Nguyen Ngoc Anh - Email: anhnnpmp@gmail.com - Tel: 0905.119948
 */
public class CategoryRepository {

    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    
    public Category addCategory(Category p) {
        System.out.println("Name: " + p.getName());
        session.persist(p);

        return p;
    }

    public Category updateCategory(Category p) {
        session.update(p);
        return p;
    }

    public List<Category> listCategories() {
        List<Category> personsList = session.createQuery("from Category").list();

        return personsList;
    }
    public List<Category> findCategories(String name) {
        Query query = session.createQuery("from Category cate where cate.name like :name");
        query.setParameter("name","%"+ name +"%");

        System.out.println("Query Tring: "+query.getQueryString());
        return query.list();
    }

    public Category getCategoryById(int id) {
        Category p = (Category) session.load(Category.class, id);
        return p;
    }

    public void removeCategory(int id) {
        Category p = (Category) session.load(Category.class, id);
        if (null != p) {
            session.delete(p);
        }
    }
}
