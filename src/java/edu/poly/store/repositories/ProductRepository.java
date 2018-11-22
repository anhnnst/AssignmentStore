/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.repositories;

import edu.poly.store.domain.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * This class is used to create, update, delete and retrieve product records
 * @author Nguyen Ngoc Anh - Email: anhnnpmp@gmail.com - Tel: 0905.119948
 */
public class ProductRepository {
    public Integer addProduct(Product product) throws Exception{
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer productId = null;
        try {
            tx = session.beginTransaction();
            productId = (Integer) session.save(product);
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
        
        return productId;
    }
    public Integer editProduct(Product product) throws Exception{
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer productId = null;
        try {
            tx = session.beginTransaction();
            productId = (Integer) session.merge(product);
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
        
        return productId;
    }
//    
//    public List<Product> deleteProduct(int id) throws Exception{
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//        try {
//            tx = session.beginTransaction();
//            session.
//            tx.commit();
//        } catch (Exception e) {
//            if (tx != null)
//                tx.rollback();
//            throw new Exception(e);
//        }finally{
//            try{
//                if (session != null)
//                    session.close();
//            }catch(Exception ex){}
//        }
//        
//        return list;
//    }
    public List<Product> findProducts(String name) throws Exception{
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer productId = null;
        List<Product> list = null;
        try {
            tx = session.beginTransaction();
            String querySt = "select pro from Product pro where pro.name like :name";
            Query query = session.createQuery(querySt).setString("name", "%"+name+"%");
            list = query.list();
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
        
        return list;
    }
    
}
