package com.kuaicto.work.wechat.sdk.core;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.Common;
import com.kuaicto.work.wechat.sdk.model.tag.Tag;
import com.kuaicto.work.wechat.sdk.model.tag.TagList;
import com.kuaicto.work.wechat.sdk.model.tag.TagMember;
import com.kuaicto.work.wechat.sdk.model.tag.TagMemberAction;

/**
 * @author Spector
 * @Title: TagComponent
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/6/2018:34
 */
public class TagComponent extends AbstractComponents {
    /**
     * 创建标签
     */
    private static final String CREATE_TAG = "https://qyapi.weixin.qq.com/cgi-bin/tag/create?access_token=ACCESS_TOKEN";

    /**
     * 更新标签名字
     */
    private static final String UPDATE_TAG = "https://qyapi.weixin.qq.com/cgi-bin/tag/update?access_token=ACCESS_TOKEN";

    /**
     * 删除标签
     */
    private static final String DELETE_TAG = "https://qyapi.weixin.qq.com/cgi-bin/tag/delete?access_token=ACCESS_TOKEN&tagid=TAGID";

    /**
     * 获取标签成员
     */
    private static final String GET_TAG_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/tag/get?access_token=ACCESS_TOKEN&tagid=TAGID";

    /**
     * 增加标签成员
     */
    private static final String CREATE_TAG_MEMBER = "https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=ACCESS_TOKEN";

    /**
     * 删除标签成员
     */
    private static final String DELETE_TAG_MEMBER = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/tag/deltagusers?access_token=ACCESS_TOKEN";

    /**
     * 获取标签列表
     */
    private static final String LIST_TAG = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/tag/list?access_token=ACCESS_TOKEN";

    public TagComponent(WorkWechat workWechat) {
        super(workWechat);
    }

    /**
     * 创建标签
     *
     * @param tag
     *  <br/> tagId
     *  <br/> tagName
     * @author Spector
     * @date 2018/6/21 10:59
     */
    public void createTag(Tag tag) throws WorkWechatException {
        String url = CREATE_TAG.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, tag);
    }

    /**
     * 更新标签
     *
     * @author Spector
     * @date 2018/6/21 10:59
     */
    public void updateTag(Tag tag) throws WorkWechatException {
        String url = UPDATE_TAG.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, tag);
    }

    /**
     * 删除标签
     *
     * @author Spector
     * @date 2018/6/21 10:59
     */
    public void deleteTag(Long tagId) throws WorkWechatException {
        String url = DELETE_TAG.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("TAGID", tagId + "");
        httpGet(url, null, Common.class);
    }

    /**
     * 查询标签列表
     *
     * @author Spector
     * @date 2018/6/21 11:15
     */
    public TagList listTag() throws WorkWechatException {
        String url = LIST_TAG.replaceAll("ACCESS_TOKEN", super.accessToken());
        return httpGet(url, null, TagList.class);
    }

    /**
     * 获取标签成员
     * 
     * @author Spector
     * @date 2018/6/21 12:01 
     */
    public TagMember getTagMember(Long tagId) throws WorkWechatException {
        String url = GET_TAG_MEMBER.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("TAGID", tagId + "");
        return httpGet(url, null, TagMember.class);
    }

    /**
     * 增加标签成员
     * 
     * @author Spector
     * @date 2018/6/21 12:03
     */
    public void createTagMember(TagMemberAction tagMember) throws WorkWechatException {
        postTagMember(CREATE_TAG_MEMBER, tagMember);
    }

    /**
     * 删除标签成员
     *
     * @author Spector
     * @date 2018/6/21 12:04
     */
    public void deleteTagMember(TagMemberAction tagMember) throws WorkWechatException {
        postTagMember(DELETE_TAG_MEMBER, tagMember);
    }

    private void postTagMember(String getTagMember, TagMemberAction tagMember) throws WorkWechatException {
        String url = getTagMember.replaceAll("ACCESS_TOKEN", super.accessToken());
        httpPost(url, tagMember);
    }
}
