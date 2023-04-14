package com.hzlx.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *  接单的Controller
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/10 11:30
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(urlPatterns = "/takeOrder.do")
public class TakeOrderController extends HttpServlet {
    private OrderInfoService orderInfoSerive =new  OrderInfoServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Type","text/html;charset=UTF-8");

        resp.getWriter().write(orderInfoSerive.takeOrder(req));
    }
}
