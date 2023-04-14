package com.hzlx.dao;

import com.hzlx.entity.SysRegion;

import java.util.List;

/**
 * Description:
 *
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/11 10:44
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public interface SysRegionDao {
    List<SysRegion> getAddressByParentId(String parentId);
}
