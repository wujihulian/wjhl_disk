/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.records;


import com.svnlan.jooq.tables.CommonInfo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 资讯表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommonInfoRecord extends UpdatableRecordImpl<CommonInfoRecord> {

    private static final long serialVersionUID = 637905207;

    /**
     * Setter for <code>cloud_disk.common_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cloud_disk.common_info.title</code>. 资讯标题
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.title</code>. 资讯标题
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloud_disk.common_info.computer_pic_path</code>. 资讯图片地址，电脑端
     */
    public void setComputerPicPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.computer_pic_path</code>. 资讯图片地址，电脑端
     */
    public String getComputerPicPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloud_disk.common_info.mobile_pic_path</code>. 资讯图片地址，手机端
     */
    public void setMobilePicPath(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.mobile_pic_path</code>. 资讯图片地址，手机端
     */
    public String getMobilePicPath() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cloud_disk.common_info.status</code>. 状态 0草稿，1启用，2删除
     */
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.status</code>. 状态 0草稿，1启用，2删除
     */
    public Integer getStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>cloud_disk.common_info.detail</code>. 资讯内容
     */
    public void setDetail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.detail</code>. 资讯内容
     */
    public String getDetail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cloud_disk.common_info.file_detail</code>. 资讯附件地址，最多5个附件，json格式(文件id，文件名，文件类型，地址)
     */
    public void setFileDetail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.file_detail</code>. 资讯附件地址，最多5个附件，json格式(文件id，文件名，文件类型，地址)
     */
    public String getFileDetail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cloud_disk.common_info.create_user</code>. 创建者id
     */
    public void setCreateUser(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.create_user</code>. 创建者id
     */
    public Long getCreateUser() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>cloud_disk.common_info.modify_user</code>. 最后修改者
     */
    public void setModifyUser(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.modify_user</code>. 最后修改者
     */
    public Long getModifyUser() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>cloud_disk.common_info.user_ip</code>. 编辑资讯的IP地址，json(222.22.22.22,杭州)
     */
    public void setUserIp(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.user_ip</code>. 编辑资讯的IP地址，json(222.22.22.22,杭州)
     */
    public String getUserIp() {
        return (String) get(9);
    }

    /**
     * Setter for <code>cloud_disk.common_info.info_type_id</code>. 资讯类型id
     */
    public void setInfoTypeId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.info_type_id</code>. 资讯类型id
     */
    public Integer getInfoTypeId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>cloud_disk.common_info.sort</code>. 排序
     */
    public void setSort(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.sort</code>. 排序
     */
    public Integer getSort() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>cloud_disk.common_info.introduce</code>. 资讯摘要
     */
    public void setIntroduce(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.introduce</code>. 资讯摘要
     */
    public String getIntroduce() {
        return (String) get(12);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_top</code>. 是否置顶
     */
    public void setIsTop(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_top</code>. 是否置顶
     */
    public Integer getIsTop() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>cloud_disk.common_info.seo</code>. keyword, description json
     */
    public void setSeo(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.seo</code>. keyword, description json
     */
    public String getSeo() {
        return (String) get(14);
    }

    /**
     * Setter for <code>cloud_disk.common_info.info_source</code>. 资讯来源json, name,author,url
     */
    public void setInfoSource(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.info_source</code>. 资讯来源json, name,author,url
     */
    public String getInfoSource() {
        return (String) get(15);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_apply_original</code>. 是否申请原创
     */
    public void setIsApplyOriginal(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_apply_original</code>. 是否申请原创
     */
    public Integer getIsApplyOriginal() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>cloud_disk.common_info.video_id</code>. 短视频id
     */
    public void setVideoId(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.video_id</code>. 短视频id
     */
    public Long getVideoId() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>cloud_disk.common_info.thumb</code>. 缩略图
     */
    public void setThumb(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.thumb</code>. 缩略图
     */
    public String getThumb() {
        return (String) get(18);
    }

    /**
     * Setter for <code>cloud_disk.common_info.preview_url</code>. 视频播放地址
     */
    public void setPreviewUrl(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.preview_url</code>. 视频播放地址
     */
    public String getPreviewUrl() {
        return (String) get(19);
    }

    /**
     * Setter for <code>cloud_disk.common_info.info_type</code>. 0资讯, 1短视频
     */
    public void setInfoType(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.info_type</code>. 0资讯, 1短视频
     */
    public String getInfoType() {
        return (String) get(20);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_vertical</code>. 是否竖版
     */
    public void setIsVertical(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_vertical</code>. 是否竖版
     */
    public Integer getIsVertical() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>cloud_disk.common_info.thumb_vertical</code>. 缩略图竖版
     */
    public void setThumbVertical(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.thumb_vertical</code>. 缩略图竖版
     */
    public String getThumbVertical() {
        return (String) get(22);
    }

    /**
     * Setter for <code>cloud_disk.common_info.computer_pic_path_vertical</code>. 原图横板
     */
    public void setComputerPicPathVertical(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.computer_pic_path_vertical</code>. 原图横板
     */
    public String getComputerPicPathVertical() {
        return (String) get(23);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_video_exists</code>. 是否存在视频
     */
    public void setIsVideoExists(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_video_exists</code>. 是否存在视频
     */
    public Integer getIsVideoExists() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>cloud_disk.common_info.user_agent</code>. ua
     */
    public void setUserAgent(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.user_agent</code>. ua
     */
    public String getUserAgent() {
        return (String) get(25);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_url_info</code>. 是否url链接资讯
     */
    public void setIsUrlInfo(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_url_info</code>. 是否url链接资讯
     */
    public Integer getIsUrlInfo() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>cloud_disk.common_info.info_url</code>. url资讯的地址
     */
    public void setInfoUrl(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.info_url</code>. url资讯的地址
     */
    public String getInfoUrl() {
        return (String) get(27);
    }

    /**
     * Setter for <code>cloud_disk.common_info.attachment_count</code>. 附件数
     */
    public void setAttachmentCount(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.attachment_count</code>. 附件数
     */
    public Integer getAttachmentCount() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>cloud_disk.common_info.show_attachment</code>. 前3个附件图
     */
    public void setShowAttachment(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.show_attachment</code>. 前3个附件图
     */
    public String getShowAttachment() {
        return (String) get(29);
    }

    /**
     * Setter for <code>cloud_disk.common_info.remark</code>. 备注, 审核拒绝原因等
     */
    public void setRemark(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.remark</code>. 备注, 审核拒绝原因等
     */
    public String getRemark() {
        return (String) get(30);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_transport</code>. 是否转载, 1是
     */
    public void setIsTransport(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_transport</code>. 是否转载, 1是
     */
    public Integer getIsTransport() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>cloud_disk.common_info.right_flag</code>. 权限标识：0-私有，1-公开
     */
    public void setRightFlag(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.right_flag</code>. 权限标识：0-私有，1-公开
     */
    public Integer getRightFlag() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>cloud_disk.common_info.source_id</code>. 文件id
     */
    public void setSourceId(Long value) {
        set(33, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.source_id</code>. 文件id
     */
    public Long getSourceId() {
        return (Long) get(33);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_hide</code>. 是否隐藏 0 默认否  1 是
     */
    public void setIsHide(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_hide</code>. 是否隐藏 0 默认否  1 是
     */
    public Integer getIsHide() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>cloud_disk.common_info.is_login</code>. 是否需要登录 0 否 1 是
     */
    public void setIsLogin(Integer value) {
        set(35, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.is_login</code>. 是否需要登录 0 否 1 是
     */
    public Integer getIsLogin() {
        return (Integer) get(35);
    }

    /**
     * Setter for <code>cloud_disk.common_info.actual_view_count</code>. 实际浏览数
     */
    public void setActualViewCount(Integer value) {
        set(36, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.actual_view_count</code>. 实际浏览数
     */
    public Integer getActualViewCount() {
        return (Integer) get(36);
    }

    /**
     * Setter for <code>cloud_disk.common_info.like_count</code>. 点赞数
     */
    public void setLikeCount(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.like_count</code>. 点赞数
     */
    public Integer getLikeCount() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>cloud_disk.common_info.view_count</code>. 浏览数
     */
    public void setViewCount(Integer value) {
        set(38, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.view_count</code>. 浏览数
     */
    public Integer getViewCount() {
        return (Integer) get(38);
    }

    /**
     * Setter for <code>cloud_disk.common_info.name_pinyin</code>. 拼音全称
     */
    public void setNamePinyin(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.name_pinyin</code>. 拼音全称
     */
    public String getNamePinyin() {
        return (String) get(39);
    }

    /**
     * Setter for <code>cloud_disk.common_info.name_pinyin_simple</code>. 拼音首字母
     */
    public void setNamePinyinSimple(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.name_pinyin_simple</code>. 拼音首字母
     */
    public String getNamePinyinSimple() {
        return (String) get(40);
    }

    /**
     * Setter for <code>cloud_disk.common_info.path_pre</code>. 路径前缀
     */
    public void setPathPre(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.path_pre</code>. 路径前缀
     */
    public String getPathPre() {
        return (String) get(41);
    }

    /**
     * Setter for <code>cloud_disk.common_info.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(42, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(42);
    }

    /**
     * Setter for <code>cloud_disk.common_info.modify_time</code>. 最后修改者
     */
    public void setModifyTime(LocalDateTime value) {
        set(43, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.modify_time</code>. 最后修改者
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(43);
    }

    /**
     * Setter for <code>cloud_disk.common_info.gmt_page</code>. 生成页面时间
     */
    public void setGmtPage(LocalDateTime value) {
        set(44, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.gmt_page</code>. 生成页面时间
     */
    public LocalDateTime getGmtPage() {
        return (LocalDateTime) get(44);
    }

    /**
     * Setter for <code>cloud_disk.common_info.tenant_id</code>. 租户id
     */
    public void setTenantId(Long value) {
        set(45, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.tenant_id</code>. 租户id
     */
    public Long getTenantId() {
        return (Long) get(45);
    }

    /**
     * Setter for <code>cloud_disk.common_info.top_time</code>. 置顶时间（数字）
     */
    public void setTopTime(Long value) {
        set(46, value);
    }

    /**
     * Getter for <code>cloud_disk.common_info.top_time</code>. 置顶时间（数字）
     */
    public Long getTopTime() {
        return (Long) get(46);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CommonInfoRecord
     */
    public CommonInfoRecord() {
        super(CommonInfo.COMMON_INFO);
    }

    /**
     * Create a detached, initialised CommonInfoRecord
     */
    public CommonInfoRecord(Long id, String title, String computerPicPath, String mobilePicPath, Integer status, String detail, String fileDetail, Long createUser, Long modifyUser, String userIp, Integer infoTypeId, Integer sort, String introduce, Integer isTop, String seo, String infoSource, Integer isApplyOriginal, Long videoId, String thumb, String previewUrl, String infoType, Integer isVertical, String thumbVertical, String computerPicPathVertical, Integer isVideoExists, String userAgent, Integer isUrlInfo, String infoUrl, Integer attachmentCount, String showAttachment, String remark, Integer isTransport, Integer rightFlag, Long sourceId, Integer isHide, Integer isLogin, Integer actualViewCount, Integer likeCount, Integer viewCount, String namePinyin, String namePinyinSimple, String pathPre, LocalDateTime createTime, LocalDateTime modifyTime, LocalDateTime gmtPage, Long tenantId, Long topTime) {
        super(CommonInfo.COMMON_INFO);

        set(0, id);
        set(1, title);
        set(2, computerPicPath);
        set(3, mobilePicPath);
        set(4, status);
        set(5, detail);
        set(6, fileDetail);
        set(7, createUser);
        set(8, modifyUser);
        set(9, userIp);
        set(10, infoTypeId);
        set(11, sort);
        set(12, introduce);
        set(13, isTop);
        set(14, seo);
        set(15, infoSource);
        set(16, isApplyOriginal);
        set(17, videoId);
        set(18, thumb);
        set(19, previewUrl);
        set(20, infoType);
        set(21, isVertical);
        set(22, thumbVertical);
        set(23, computerPicPathVertical);
        set(24, isVideoExists);
        set(25, userAgent);
        set(26, isUrlInfo);
        set(27, infoUrl);
        set(28, attachmentCount);
        set(29, showAttachment);
        set(30, remark);
        set(31, isTransport);
        set(32, rightFlag);
        set(33, sourceId);
        set(34, isHide);
        set(35, isLogin);
        set(36, actualViewCount);
        set(37, likeCount);
        set(38, viewCount);
        set(39, namePinyin);
        set(40, namePinyinSimple);
        set(41, pathPre);
        set(42, createTime);
        set(43, modifyTime);
        set(44, gmtPage);
        set(45, tenantId);
        set(46, topTime);
    }
}
