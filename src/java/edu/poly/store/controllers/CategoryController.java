/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.controllers;

import edu.poly.store.domain.Category;
import edu.poly.store.services.CategoryService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Category Controller class
 * @author Nguyen Ngoc Anh - Email: anhnnpmp@gmail.com - Tel: 0905.119948
 */
@WebServlet(name = "CategoryController", urlPatterns = {"/CategoryController"})
public class CategoryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        CategoryService categoryService = new CategoryService();
        if (action == null) {
            gotoListPage(request, categoryService, response);
            return;
        }
        if (action.equals("add-form")) {
            showAddPage(request, response);
            return;
        }
        if (action.equals("add")) {
            addAndShowListPage(request, categoryService, response);
            return;
        }
        if (action.equals("edit-form")) {
            showEditPage(request, categoryService, response);
            return;
        }
        if (action.equals("update")) {
            updateAndShowListPage(request, categoryService, response);
        }
        if (action.equals("delete")) {
            deleteAndShowListPage(request, categoryService, response);
        }
        if (action.equals("search")) {
            searchAndShowSearchPage(request, categoryService, response);
        }
    }

    private void searchAndShowSearchPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            
            String name = request.getParameter("name");
            System.out.println("Name; ------ "+ name);
            if (name == null )
                request.setAttribute("categories", categoryService.listCategories());
            else
                request.setAttribute("categories", categoryService.findCategories(name));
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/search.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteAndShowListPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            String id = request.getParameter("categoryId");
            categoryService.removeCategory(Integer.parseInt(id));
            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/list.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateAndShowListPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            Category category = new Category();

            String name = request.getParameter("name");
            String id = request.getParameter("categoryId");
            category.setCategoryId(Integer.parseInt(id));
            category.setName(name);

            categoryService.updateCategory(category);

            request.setAttribute("categories", categoryService.listCategories());

            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/list.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showEditPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            String id = request.getParameter("categoryId");
            request.setAttribute("category", categoryService.getCategoryById(Integer.parseInt(id)));
            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/edit.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAndShowListPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            Category category = new Category();
            String name = request.getParameter("name");
            //category.setCategoryId(0);
            category.setName(name);
            categoryService.addCategory(category);
            request.setAttribute("categories", categoryService.listCategories());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/list.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showAddPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/add.jsp");
        dispatcher.forward(request, response);
    }

    private void gotoListPage(HttpServletRequest request, CategoryService categoryService, HttpServletResponse response) {
        try {
            request.setAttribute("categories", categoryService.listCategories());
            RequestDispatcher dispatcher = request.getRequestDispatcher("Categories/list.jsp");
            dispatcher.forward(request, response);
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
