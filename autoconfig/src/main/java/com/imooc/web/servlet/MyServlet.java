//package com.imooc.web.servlet;
//
//import java.io.IOException;
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @ClassName: MyServlet
// * @Package: com.imooc.web.servlet
// * @Description:
// * @Date: 2021/12/13 13:46
// * @Author: sunzheng@beiming.com
// */
//@WebServlet(urlPatterns = "/my/servlet", asyncSupported = true)
//public class MyServlet extends HttpServlet {
//
//  @Override
//  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//      throws ServletException, IOException {
//
//    AsyncContext asyncContext = req.startAsync();
//    asyncContext.start(() -> {
//      try {
//        resp.getWriter().println("<span style=\"color:red\">Hello world</span>");
//        asyncContext.complete();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    });
//
//  }
//}
