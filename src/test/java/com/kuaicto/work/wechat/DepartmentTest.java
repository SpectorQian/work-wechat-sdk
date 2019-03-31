package com.kuaicto.work.wechat;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.department.Department;
import com.kuaicto.work.wechat.sdk.model.department.DepartmentList;
import org.junit.Test;

/**
 * @author Spector
 * @Title: DepartmentTest
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/21 17:28
 */
public class DepartmentTest extends WorkWechatTest {

    @Test
    public void createDepartment() throws WorkWechatException {
        Department department = new Department();
        department.setDepartmentName("test");
        department.setParentId(1L);
//        department.setOrder(1);
        builder().getDepartments().createDepartment(department);
    }

    @Test
    public void updateDepartment() throws WorkWechatException {
        Department department = new Department();
        department.setDepartmentName("联盟");
        department.setParentId(1L);
        department.setOrder(1);
        department.setDepartmentId(83L);
        builder().getDepartments().updateDepartment(department);
    }

    @Test
    public void getDepartment() throws WorkWechatException {
        DepartmentList departmentList = builder().getDepartments().listDepartment(null);
        for (Department department : departmentList.getDepartments()) {
            System.out.println(department);
        }
    }

    @Test
    public void deleteDepartment() throws WorkWechatException {
        builder().getDepartments().deleteDepartment(84L);
    }
}
