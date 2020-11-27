package com.bdqn.servlet;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Student;
import com.bdqn.service.impl.StudentBiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HomeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String opt=request.getParameter("opt");
        System.out.println(opt);
        String result=null;
        if (opt != null) {
            if(opt.equals("all")){
                System.out.println("in all");
                List<Student> list=new StudentBiz().getAll();
                System.out.println(list.size());
                result= JSON.toJSONString(list);
            }
        }


        PrintWriter out=response.getWriter();
        out.print(result);
        out.flush();
        out.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
