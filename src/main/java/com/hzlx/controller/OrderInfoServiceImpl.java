package com.hzlx.controller;

import com.google.gson.Gson;
import com.hzlx.dao.OrderInfoDao;
import com.hzlx.dao.impl.OrderInfoDaoImpl;
import com.hzlx.entity.BusinessInfo;
import com.hzlx.entity.OrderInfo;
import com.hzlx.entity.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Description:
 *
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/10 11:53
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public class OrderInfoServiceImpl implements OrderInfoService {
    private OrderInfoDao orderInfoDao = new OrderInfoDaoImpl();

    @Override
    public String takeOrder(HttpServletRequest req) {
        Integer orderId = Integer.parseInt(req.getParameter("orderId"));
        RespBean respBean;
        //从session中获取登录商家的信息
        BusinessInfo businessInfo =(BusinessInfo) req.getSession().getAttribute("businessInfo");
        //调用dao方法修改订单状态
        int rows = orderInfoDao.updateOrderForStatus(orderId, businessInfo.getId(), 2);
        if (rows > 0) {
            respBean = RespBean.success();
        } else {
            respBean = RespBean.error(10010, "修改订单状态失败");
        }
        Gson gson = new Gson();
        return gson.toJson(respBean);
    }

    @Override
    public String goOrder(HttpServletRequest req, HttpServletResponse resp) {
        OrderInfo orderInfo=(OrderInfo) req.getSession().getAttribute("businessInfo");
        String addOrder = orderInfoDao.addOrder(orderInfo.getId());
        Date creatTime=orderInfo.getCreateTime();

        req.setAttribute("addOrder",addOrder);
        req.setAttribute("creatTime",creatTime);
        return "pages/business/order.jsp";
    }
}
