package com.kuaicto.work.wechat.sdk.model.media;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author Spector
 * @Title: TempMedia
 * @ProjectName work-wechat-sdk
 * @Description: 上传临时素材
 * @date 2018/7/1112:02
 */
public class TempMedia implements Serializable {

    /**
     * 媒体文件上传后获取的唯一标识，3天内有效
     */
    private String mediaId;

    /**
     * 媒体文件上传时间戳
     */
    @JSONField(name = "created_at")
    private Long createTime;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TempMedia{" +
                "mediaId='" + mediaId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
