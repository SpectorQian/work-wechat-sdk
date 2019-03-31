package com.kuaicto.work.wechat.sdk.core;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.media.Image;
import com.kuaicto.work.wechat.sdk.model.media.TempMedia;

import java.io.File;

/**
 * @author Spector
 * @Title: MediaComponent
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1110:23
 */
public class MediaComponent extends AbstractComponents {

    /**
     * 上传临时素材
     */
    private static final String UPLOAD_TEMP_MEDIA = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";

    /**
     * 获取临时素材
     */
    private static final String GET_TEMP_MEDIA = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

    /**
     * 获取高清语音素材
     */
    private static final String GET_TEMP_VOICE = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/media/get/jssdk?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

    /**
     * 上传图片
     */
    private static final String UPLOAD_MEDIA = "https://qyapi.weixin.qq" +
            ".com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";

    public MediaComponent(WorkWechat workWechat) {
        super(workWechat);
    }

    /**
     * 上传临时素材-图片
     *
     * @author Spector
     * @date 2018/6/21 10:26
     */
    public TempMedia uploadTempImage(File file) throws WorkWechatException {
        String url = UPLOAD_TEMP_MEDIA.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("TYPE", Constants.IMAGE_TYPE);

        return httpUpload(url, file, Constants.UPLOAD_TEMP_MEDIA_CONTENT_TYPE, TempMedia.class);
    }

    /**
     * 获取临时素材
     *
     * @author Spector
     * @date 2018/6/21 10:26
     */
    public String getTempMedia(String mediaId) {
        String url = GET_TEMP_MEDIA.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("MEDIA_ID", mediaId);

        return httpDownload(url);
    }

    /**
     * 获取高清临时素材
     *
     * @author Spector
     * @date 2018/6/21 10:26
     */
    public String getTempVoiceMedia(String mediaId) {
        String url = GET_TEMP_VOICE.replaceAll("ACCESS_TOKEN", super.accessToken())
                .replaceAll("MEDIA_ID", mediaId);
        return httpDownload(url);
    }

    public String uploadImage(File imageFile) throws WorkWechatException {
        String url = UPLOAD_MEDIA.replaceAll("ACCESS_TOKEN", super.accessToken());
        return httpUpload(url, imageFile, Constants.UPLOAD_IMAGE_CONTENT_TYPE, Image.class).getUrl();
    }
}
