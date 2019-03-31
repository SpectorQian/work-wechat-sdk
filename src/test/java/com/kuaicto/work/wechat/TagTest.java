package com.kuaicto.work.wechat;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.tag.Tag;
import com.kuaicto.work.wechat.sdk.model.tag.TagList;
import com.kuaicto.work.wechat.sdk.model.tag.TagMember;
import com.kuaicto.work.wechat.sdk.model.tag.TagMemberAction;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Spector
 * @Title: TagTest
 * @ProjectName work-wechat-sdk
 * @Description: 标签测试
 * @date 2018/6/21 11:05
 */
public class TagTest extends WorkWechatTest {

    @Test
    public void createTag() throws WorkWechatException {
        Tag tag = new Tag();
        tag.setTagId(4L);
        tag.setTagName("hello");
        builder().getTags().createTag(tag);
    }

    @Test
    public void updateTag() throws WorkWechatException {
        Tag tag = new Tag();
        tag.setTagId(4L);
        tag.setTagName("world");
        builder().getTags().updateTag(tag);
    }

    @Test
    public void deleteTag() throws WorkWechatException {
        builder().getTags().deleteTag(4L);
    }

    @Test
    public void listTag() throws WorkWechatException {
        TagList tagList = builder().getTags().listTag();
        for (Tag tag : tagList.getTaglist()) {
            System.out.println(tag);
        }
    }

    @Test
    public void getTagMember() throws WorkWechatException {
        TagMember tegMember = builder().getTags().getTagMember(3L);
        System.out.println(tegMember);
    }

    @Test
    public void createTagMember() throws WorkWechatException {
        TagMemberAction tagMember = new TagMemberAction();
        tagMember.setTagId(4L);
        tagMember.setMemberIdList(Arrays.asList("GuoXia", "ZhangBiLing"));
        builder().getTags().createTagMember(tagMember);
    }

    @Test
    public void deleteTagMember() throws WorkWechatException {
        TagMemberAction tagMember = new TagMemberAction();
        tagMember.setTagId(4L);
        tagMember.setMemberIdList(Arrays.asList("GuoXia", "ZhangBiLing"));
        builder().getTags().deleteTagMember(tagMember);
    }

}
