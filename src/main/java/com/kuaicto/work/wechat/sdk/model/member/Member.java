package com.kuaicto.work.wechat.sdk.model.member;

import com.alibaba.fastjson.annotation.JSONField;
import com.kuaicto.work.wechat.sdk.serialize.ActivationStatusDeserializer;
import com.kuaicto.work.wechat.sdk.serialize.ActivationStatusSerializer;
import com.kuaicto.work.wechat.sdk.serialize.BooleanTypeDeSerializer;
import com.kuaicto.work.wechat.sdk.serialize.BooleanTypeSerializer;
import com.kuaicto.work.wechat.sdk.serialize.GenderTypeDeSerializer;
import com.kuaicto.work.wechat.sdk.serialize.GenderTypeSerializer;

import java.io.Serializable;
import java.util.List;

public class Member implements Serializable {
    /**
     * 成员UserID。对应管理端的帐号，企业内必须唯一
     */
    @JSONField(name = "userid")
    private String memberId;

    /**
     * 成员名称。长度为1~64个字符
     * 对应用户昵称
     */
    @JSONField(name = "name")
    private String fullName;

    /**
     * 英文名
     */
    @JSONField(name = "english_name")
    private String userName;

    @JSONField(name = "mobile")
    private String cellphone;

    /**
     * 成员所属部门id列表,不超过20个
     */
    @JSONField(name = "department")
    private List<Long> departmentList;

    /**
     * 部门内的排序值，默认为0，成员次序以创建时间从小到大排列。
     */
    @JSONField(name = "order")
    private List<Integer> orders;

    /**
     * 职位信息。长度为0~128个字符
     */
    private String position;

    /**
     * 性别
     */
    @JSONField(deserializeUsing = GenderTypeDeSerializer.class, serializeUsing = GenderTypeSerializer.class)
    private String gender;

    private String email;

    @JSONField(name = "telephone")
    private String tel;

    /**
     * 头像Media
     */
    @JSONField(name = "avatar_mediaid")
    private String photoMediaid;

    /**
     * 头像
     */
    @JSONField(name = "avatar")
    private String photo;

    /**
     * 标示是否为上级
     */
    @JSONField(name = "isleader", deserializeUsing = BooleanTypeDeSerializer.class, serializeUsing =
            BooleanTypeSerializer.class)
    private Boolean isLeader;

    /**
     * 是否邀请该成员使用企业微信（将通过微信服务通知或短信或邮件下发邀请，每天自动下发一次，最多持续3个工作日），默认值为true。
     */
    @JSONField(name = "to_invite", deserializeUsing = BooleanTypeDeSerializer.class, serializeUsing =
            BooleanTypeSerializer.class)
    private Boolean toInvite;

    @JSONField(name = "status", deserializeUsing = ActivationStatusDeserializer.class, serializeUsing =
            ActivationStatusSerializer.class)
    private String activationStatus;

    /**
     * 成员启用状态。1表示启用的成员，0表示被禁用。
     */
    @JSONField(deserializeUsing = BooleanTypeDeSerializer.class, serializeUsing = BooleanTypeSerializer.class)
    private Boolean enable;

    /**
     * 员工个人二维码，扫描可添加为外部联系人；第三方仅通讯录应用可获取
     */
    @JSONField(name = "qr_code")
    private String qrCode;

    /**
     * 成员对外属性，字段详情见对外属性；第三方仅通讯录应用可获取
     */
    @JSONField(name = "external_profile")
    private String externalProfile;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<Long> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Long> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public void setOrders(List<Integer> orders) {
        this.orders = orders;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPhotoMediaid() {
        return photoMediaid;
    }

    public void setPhotoMediaid(String photoMediaid) {
        this.photoMediaid = photoMediaid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getLeader() {
        return isLeader;
    }

    public void setLeader(Boolean leader) {
        isLeader = leader;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getToInvite() {
        return toInvite;
    }

    public void setToInvite(Boolean toInvite) {
        this.toInvite = toInvite;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getExternalProfile() {
        return externalProfile;
    }

    public void setExternalProfile(String externalProfile) {
        this.externalProfile = externalProfile;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", departmentList=" + departmentList +
                ", orders=" + orders +
                ", position='" + position + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", photo='" + photo + '\'' +
                ", isLeader=" + isLeader +
                ", toInvite=" + toInvite +
                ", activationStatus=" + activationStatus +
                ", enable=" + enable +
                ", qrCode='" + qrCode + '\'' +
                ", externalProfile='" + externalProfile + '\'' +
                '}';
    }
}
