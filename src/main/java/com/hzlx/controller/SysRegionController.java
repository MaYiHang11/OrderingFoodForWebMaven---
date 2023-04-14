package com.hzlx.controller;

import com.hzlx.service.SysRegionService;
import com.hzlx.service.impl.SysRegionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 * 三级联动 servlet
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/11 10:47
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
@WebServlet(urlPatterns = "/sysRegion.do")
public class SysRegionController extends HttpServlet {
    //引入三级联动 service
    private SysRegionService sysRegionService=new SysRegionServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //业务层处理完成之后响应给前端的JSON字符串
        String respStrForJSON=sysRegionService. queryAddress(req);
        //修改响应的编码格式
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        //把service层返回的JSON字符串通过response 写出
        resp.getWriter().write(respStrForJSON);

    }
}
