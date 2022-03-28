/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAO;
import entity.Homestay;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LNV
 */
@WebServlet(name = "addControl", urlPatterns = {"/add"})
public class addControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        String locationID = request.getParameter("locationID");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String desciption = request.getParameter("desciption");
        String maxPeople = request.getParameter("maxPeople");
        String img = request.getParameter("img");
        String addDate = request.getParameter("addDate");

        DAO dao = new DAO();
//        Homestay homestay = dao.checkHomestayExist(id);
//        if (homestay == null) {
            dao.insertHomestay(id, locationID, name, price, desciption, maxPeople, img, addDate);
            response.sendRedirect("manager");
//        }else{
//            request.setAttribute("message", "ID đã tồn tại");
//            request.getRequestDispatcher("Create.jsp").forward(request, response);
//        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Create.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
