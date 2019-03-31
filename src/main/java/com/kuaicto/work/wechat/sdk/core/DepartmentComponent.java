package com.kuaicto.work.wechat.sdk.core;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.Common;
import com.kuaicto.work.wechat.sdk.model.department.Department;
import com.kuaicto.work.wechat.sdk.model.department.DepartmentList;

/**
 * @author Spector
 * @Title: DepartmentComponent
 * @ProjectName work-wechat-sdk
 * @Description: 成员组件
 * @date 2018/6/2018:11
 */
public class DepartmentComponent extends AbstractComponents {

    /**
     * 创建部门
     */
    private static final String CREATE_DEPARTMENT = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/department/create?access_token=ACCESS_TOKEN";

    /**
     * 更新部门
     */
    private static final String UPDATE_DEPARTMENT = "https://qyapi.weixin.qq.com/cgi-bin/department/update?access_token=ACCESS_TOKEN";

    /**
     * 删除部门
     */
    private static final String DELETE_DEPARTMENT = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/department/delete?access_token=ACCESS_TOKEN&id=ID";

    /**
     * 获取部门列表
     */
    private static final String LIST_DEPARTMENT = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/department/list?access_token=ACCESS_TOKEN&id=ID";


    public DepartmentComponent(WorkWechat workWechat) {
        super(workWechat);
    }

    /**
     * 创建部门
     *
     * @author Spector
     * @date 2018/6/21 10:26
     */
    public void createDepartment(Department department) throws WorkWechatException {
        String url = CREATE_DEPARTMENT.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, department);
    }

    /**
     * 更新部门
     *
     * @author Spector
     * @date 2018/6/20 18:25
     */
    public void updateDepartment(Department department) throws WorkWechatException {
        String url = UPDATE_DEPARTMENT.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, department);
    }

    /**
     * 删除部门
     *
     * @author Spector
     * @date 2018/6/20 18:25
     */
    public boolean deleteDepartment(Long departmentId) throws WorkWechatException {
        String url = DELETE_DEPARTMENT.replaceAll("ACCESS_TOKEN", super.accessToken());
        if(departmentId != null){
            url = url.replaceAll("ID", departmentId+"");
        }

        httpGet(url, null, Common.class);
        return true;
    }

    /**
     * 部门列表
     *
     * @author Spector
     * @date 2018/6/20 18:33
     */
    public DepartmentList listDepartment(Long departmentId) throws WorkWechatException {
        String url = LIST_DEPARTMENT.replaceAll("ACCESS_TOKEN", super.accessToken());
        if(departmentId != null){
            url = url.replaceAll("ID", departmentId+"");
        }

        return httpGet(url, null, DepartmentList.class);
    }
}
