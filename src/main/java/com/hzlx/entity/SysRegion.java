package com.hzlx.entity;

/**
 * Description:
 *省市区地理表
 * @author: Ma、超级无敌暴龙战神
 * @Date: 2023/4/11 10:39
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File Templates.
 */
public class SysRegion {
    private String id;
    private String name;

    private String shortName;
    private String code;

    private String parentId;
     private Integer level;

    public SysRegion() {
    }

    public SysRegion(String id, String name, String shortName, String code, String parentId, Integer level) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.code = code;
        this.parentId = parentId;
        this.level = level;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 获取
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String toString() {
        return "SysRegion{id = " + id + ", name = " + name + ", shortName = " + shortName + ", code = " + code + ", parentId = " + parentId + ", level = " + level + "}";
    }
}
