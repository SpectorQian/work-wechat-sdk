package com.kuaicto.work.wechat.sdk.model.department;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: Department
 * @ProjectName workwechat-sdk
 * @Description: TODO
 * @date 2018/6/2018:19
 */
public class Department implements Serializable {
    private static final long serialVersionUID = -5518671027490023139L;
    @JSONField(name = "name")
    private String departmentName;

    @JSONField(name = "parentid")
    private Long parentId;

    private Integer order;

    @JSONField(name = "id")
    private Long departmentId;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", parentId=" + parentId +
                ", order=" + order +
                ", departmentId=" + departmentId +
                '}';
    }
}
