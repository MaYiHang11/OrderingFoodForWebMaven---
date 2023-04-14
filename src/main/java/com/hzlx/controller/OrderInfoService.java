package com.hzlx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 *
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/10 11:52
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public interface OrderInfoService {
    String takeOrder(HttpServletRequest req);

    String goOrder(HttpServletRequest req, HttpServletResponse resp);
}
