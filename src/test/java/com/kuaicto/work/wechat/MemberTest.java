package com.kuaicto.work.wechat;

import com.kuaicto.work.wechat.sdk.enums.EnumActivationStatus;
import com.kuaicto.work.wechat.sdk.enums.EnumGenderType;
import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.member.InviteInvalidMember;
import com.kuaicto.work.wechat.sdk.model.member.InviteMember;
import com.kuaicto.work.wechat.sdk.model.member.Member;
import com.kuaicto.work.wechat.sdk.model.member.MemberDelete;
import com.kuaicto.work.wechat.sdk.model.member.MemberList;
import com.kuaicto.work.wechat.sdk.model.member.SimpleMember;
import com.kuaicto.work.wechat.sdk.model.member.SimpleMemberList;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Spector
 * @Title: MemberTest
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/21 12:55
 */
public class MemberTest extends WorkWechatTest {

    @Test
    public void listSimpleMembers() throws WorkWechatException {
        SimpleMemberList memberList = builder().getMembers().listSimpleDepartmentMember(11L);
        for (SimpleMember member : memberList.getUserlist()) {
            System.out.println(member);
        }
    }

    @Test
    public void listMembers() throws WorkWechatException {
        MemberList memberList = builder().getMembers().listDepartmentMember(22L);
        for (Member member : memberList.getMemberList()) {
            System.out.println(member);
        }
    }

    @Test
    public void createMember() throws WorkWechatException {
        Member member = new Member();
        member.setCellphone("13000010001");
        member.setMemberId("qianduoduo");
        member.setUserName("Spector");
        member.setFullName("钱多多-测试");
        member.setDepartmentList(Arrays.asList(10007L, 10008L));
        member.setOrders(Arrays.asList(0, 0));
        member.setTel("0123-97657");
        member.setGender(EnumGenderType.MALE.getCode());
        member.setPhoto("http://p.qlogo.cn/bizmail/twaxvWXxbdsjkRVrurzIvbmIHmWDE3icLnNjYKSRCCEZaSVME03Bv2w/0");
        member.setLeader(false);
        member.setEnable(true);
        member.setToInvite(false);
        builder().getMembers().createMember(member);
    }

    @Test
    public void getMemeber() throws WorkWechatException {
        Member member = builder().getMembers().getMemeber("qianduoduo");
        System.out.println(member);
    }

    @Test
    public void updateMember() throws WorkWechatException {
        Member member = new Member();
//        member.setCellphone("13000010001");
        member.setMemberId("qianduoduo");
        member.setFullName("钱多多-测试");
        member.setEnable(true);
//        member.setName("test");
//        member.setDepartmentList(Arrays.asList(22L, 21L));
        member.setGender(EnumGenderType.MALE.name());
        member.setActivationStatus(EnumActivationStatus.INACTIVE.name());
//        member.setPhoto("http://p.qlogo.cn/bizmail/twaxvWXxbdsjkRVrurzIvbmIHmWDE3icLnNjYKSRCCEZaSVME03Bv2w/0");
        builder().getMembers().updateMember(member);
    }

    @Test
    public void deleteMember() throws WorkWechatException {
        builder().getMembers().deleteMemeber("qianduoduo");
    }

    @Test
    public void batchDeleteMember() throws WorkWechatException {
        MemberDelete memberDelete = new MemberDelete();
        memberDelete.setMemberIdList(Arrays.asList("Spector", "Spector1"));
        builder().getMembers().batchDeleteMember(memberDelete);
    }

    @Test
    public void batchInviteMemmber() throws WorkWechatException {
        InviteMember inviteMember = new InviteMember();
        inviteMember.setMemberIdList(Collections.singletonList("ddddd"));
        inviteMember.setDepartmentIdList(Collections.singletonList(9524L));
        inviteMember.setTagIdList(Arrays.asList(9452L, 9453L));
        InviteInvalidMember inviteInvalidMember = builder().getMembers().batchInviteMember(inviteMember);
        System.out.println(inviteInvalidMember);
    }

}
