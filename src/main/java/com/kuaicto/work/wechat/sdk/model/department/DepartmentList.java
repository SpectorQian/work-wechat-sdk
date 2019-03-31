package com.kuaicto.work.wechat.sdk.model.department;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: DepartmentList
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2018:32
 */
public class DepartmentList implements Serializable {
    @JSONField(name = "department")
    private List<Department> departments;

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
