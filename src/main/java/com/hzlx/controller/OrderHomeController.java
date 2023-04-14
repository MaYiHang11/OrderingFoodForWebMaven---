package com.hzlx.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/13 15:54
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(urlPatterns = "order.do")
public class OrderHomeController  extends HttpServlet {
    private  OrderInfoService service =new OrderInfoServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url =service.goOrder(req,resp);
        req.getRequestDispatcher(url).forward(req,resp);
    }
}
