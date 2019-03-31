package com.kuaicto.work.wechat;

import com.kuaicto.work.wechat.sdk.exception.WorkWechatException;
import com.kuaicto.work.wechat.sdk.model.media.Image;
import com.kuaicto.work.wechat.sdk.model.media.TempMedia;
import org.junit.Test;

import java.io.File;

/**
 * @author Spector
 * @Title: MediaTest
 * @ProjectName work-wechat-sdk
 * @Description: TODO
 * @date 2018/7/1113:25
 */
public class MediaTest extends WorkWechatTest {

    /**
     * 上传临时素材
     * @throws WorkWechatException
     */
    @Test
    public void uploadTempImage() throws WorkWechatException {
        TempMedia tempMedia = builder().getMedias().uploadTempImage(new File("d:/lee.jpg"));
        System.out.println(tempMedia);
    }

    /**
     * 获取高清素材
     */
    @Test
    public void getTempMedia() {
        String tempImage = builder().getMedias().getTempMedia("30OA28d489YgijqxwZh4kx92aYtgj1GPuFrO2uu2bfW8ziJ0cXgBjkzEQ-cNwhgNZ");
        System.out.println(tempImage);
    }

    /**
     * 获取语音高清素材
     */
    @Test
    public void getTempVoiceMedia() {
        String tempImage = builder().getMedias().getTempVoiceMedia("30OA28d489YgijqxwZh4kx92aYtgj1GPuFrO2uu2bfW8ziJ0cXgBjkzEQ-cNwhgNZ");
        System.out.println(tempImage);
    }

    /**
     * 上传图片
     * @throws WorkWechatException
     */
    @Test
    public void uploadImage() throws WorkWechatException {
        String imageUrl = builder().getMedias().uploadImage(new File("d:/lee.jpg"));
        System.out.println(imageUrl);
    }
}
