package com.kuaicto.work.wechat.sdk.model.member;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * @author Spector
 * @Title: InviteInvalidMember
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1218:04
 */
public class InviteInvalidMember implements Serializable {

    private static final long serialVersionUID = -4363174594632622425L;
    /**
     * 非法成员列表
     */
    @JSONField(name = "invaliduser")
    private List<String> invalidUserNameList;

    /**
     * 非法部门列表
     */
    @JSONField(name = "invalidparty")
    private List<String> invalidDepartmentIdList;

    /**
     * 非法标签列表
     */
    @JSONField(name = "invalidtag")
    private List<String> invalidTagIdList;

    public List<String> getInvalidUserNameList() {
        return invalidUserNameList;
    }

    public void setInvalidUserNameList(List<String> invalidUserNameList) {
        this.invalidUserNameList = invalidUserNameList;
    }

    public List<String> getInvalidDepartmentIdList() {
        return invalidDepartmentIdList;
    }

    public void setInvalidDepartmentIdList(List<String> invalidDepartmentIdList) {
        this.invalidDepartmentIdList = invalidDepartmentIdList;
    }

    public List<String> getInvalidTagIdList() {
        return invalidTagIdList;
    }

    public void setInvalidTagIdList(List<String> invalidTagIdList) {
        this.invalidTagIdList = invalidTagIdList;
    }
}
