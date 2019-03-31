package com.kuaicto.work.wechat.sdk.core;

public final class WorkWechat {
    /**
     * 企业ID
     */
    private String corpId;

    /**
     * 应用的凭证密钥
     */
    private String corpSecret;

    /**
     * 企业微信access_token
     */
    private String accessToken;

    public WorkWechat(String accessToken) {
        this.accessToken = accessToken;
    }

    public WorkWechat(String corpId, String corpSecret) {
        this.corpId = corpId;
        this.corpSecret = corpSecret;
    }

    protected String getCorpId() {
        return corpId;
    }

    protected String getCorpSecret() {
        return corpSecret;
    }

    protected String getAccessToken() {
        return accessToken;
    }

    private MemberComponent members;

    private DepartmentComponent departments;

    private TagComponent tags;

    private AccessTokenComponent accessTokens;

    private MediaComponent medias;

    public MemberComponent getMembers() {
        members = new MemberComponent(this);
        return members;
    }

    public DepartmentComponent getDepartments() {
        departments = new DepartmentComponent(this);
        return departments;
    }

    public TagComponent getTags() {
        tags = new TagComponent(this);
        return tags;
    }

    public AccessTokenComponent getAccessTokens(){
        accessTokens = new AccessTokenComponent(this);
        return accessTokens;
    }

    public MediaComponent getMedias() {
        medias = new MediaComponent(this);
        return medias;
    }
}
