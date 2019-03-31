package com.kuaicto.work.wechat.sdk.core;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.Common;
import com.kuaicto.work.wechat.sdk.model.member.InviteInvalidMember;
import com.kuaicto.work.wechat.sdk.model.member.InviteMember;
import com.kuaicto.work.wechat.sdk.model.member.Member;
import com.kuaicto.work.wechat.sdk.model.member.MemberDelete;
import com.kuaicto.work.wechat.sdk.model.member.MemberList;
import com.kuaicto.work.wechat.sdk.model.member.SimpleMemberList;

/**
 * 成员组件的调用
 *
 * @author Spector
 * @date 2018/6/20 18:10
 */
public class MemberComponent extends AbstractComponents {

    /**
     * 创建用户成员
     */
    private static final String CREATE_MEMBER = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=ACCESS_TOKEN";
    /**
     * 读取成员
     */
    private static final String GET_MEMBER_INFO = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";
    /**
     * 更新成员
     */
    private static final String UPDATE_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/user/update?access_token=ACCESS_TOKEN";

    /**
     * 删除成员
     */
    private static final String DELETE_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/user/delete?access_token=ACCESS_TOKEN&userid=USERID";

    /**
     * 批量删除成员
     */
    private static final String BATCH_DELETE_MEMBER = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token=ACCESS_TOKEN";

    /**
     * 获取部门成员
     */
    private static final String LIST_SIMPLE_DEPARTMENT_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/user/simplelist?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID&fetch_child=FETCH_CHILD";

    /**
     * 获取部门成员详情
     */
    private static final String LIST_DEPARTMENT_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/user/list?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID&fetch_child=FETCH_CHILD";

    /**
     * 批量邀请成员
     */
    private static final String BATCH_INVITE_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/batch/invite?access_token=ACCESS_TOKEN";



    public MemberComponent(WorkWechat workWechat) {
        super(workWechat);
    }

    /**
     * 创建成员
     * @param member
     * @return
     */
    public void createMember(Member member) throws WorkWechatException {
        String url = CREATE_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, member);
    }

    /**
     * 读取成员
     * @param memberId
     * @return
     */
    public Member getMemeber(String memberId) throws WorkWechatException {
        String url = GET_MEMBER_INFO.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("USERID", memberId);
        return httpGet(url, null, Member.class);
    }

    /**
     * 更新成员
     * @param member
     * @return
     */
    public void updateMember(Member member) throws WorkWechatException {
        String url = UPDATE_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, member);
    }

    /**
     * 删除成员
     * @param memberId
     * @return
     */
    public boolean deleteMemeber(String memberId) throws WorkWechatException {
        String url = DELETE_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("USERID", memberId);
        httpGet(url, null, Common.class);
        return true;
    }

    /**
     * 批量删除成员
     * @return
     */
    public void batchDeleteMember(MemberDelete memberDelete) throws WorkWechatException {
        String url = BATCH_DELETE_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, memberDelete);
    }

    /**
     * 获取部门成员
     * @param departmentId
     * @return
     */
    public SimpleMemberList listSimpleDepartmentMember(Long departmentId) throws WorkWechatException {
        String url = LIST_SIMPLE_DEPARTMENT_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("DEPARTMENT_ID", departmentId+"")
                .replaceAll("FETCH_CHILD", "1");
        return httpGet(url, null, SimpleMemberList.class);
    }

    /**
     * 获取部门成员详情列表
     * @param departmentId
     * @return
     */
    public MemberList listDepartmentMember(Long departmentId) throws WorkWechatException {
        String url = LIST_DEPARTMENT_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("DEPARTMENT_ID", departmentId+"")
                .replaceAll("FETCH_CHILD", "1");
        return httpGet(url, null, MemberList.class);
    }

    /**
     * 批量邀请成员
     * @param inviteMember
     * @return
     * @throws WorkWechatException
     */
    public InviteInvalidMember batchInviteMember(InviteMember inviteMember) throws WorkWechatException {
        String url = BATCH_INVITE_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken());
        return httpPost(url, inviteMember, InviteInvalidMember.class);
    }
}
