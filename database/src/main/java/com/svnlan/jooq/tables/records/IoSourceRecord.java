/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.records;


import com.svnlan.jooq.tables.IoSource;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文档数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IoSourceRecord extends UpdatableRecordImpl<IoSourceRecord> {

    private static final long serialVersionUID = -1946599192;

    /**
     * Setter for <code>cloud_disk.io_source.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cloud_disk.io_source.source_hash</code>. id的hash
     */
    public void setSourceHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.source_hash</code>. id的hash
     */
    public String getSourceHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cloud_disk.io_source.type</code>. 文档类型 1 文档 2 图片 3 音乐 4 视频 5 压缩包 6 其他
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.type</code>. 文档类型 1 文档 2 图片 3 音乐 4 视频 5 压缩包 6 其他
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>cloud_disk.io_source.target_type</code>. 文档所属类型 (0-sys,1-user,2-group)
     */
    public void setTargetType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.target_type</code>. 文档所属类型 (0-sys,1-user,2-group)
     */
    public Integer getTargetType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>cloud_disk.io_source.target_id</code>. 拥有者对象id
     */
    public void setTargetId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.target_id</code>. 拥有者对象id
     */
    public Long getTargetId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>cloud_disk.io_source.create_user</code>. 创建者id
     */
    public void setCreateUser(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.create_user</code>. 创建者id
     */
    public Long getCreateUser() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>cloud_disk.io_source.modify_user</code>. 最后修改者
     */
    public void setModifyUser(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.modify_user</code>. 最后修改者
     */
    public Long getModifyUser() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>cloud_disk.io_source.is_folder</code>. 是否为文件夹(0否,1是)
     */
    public void setIsFolder(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.is_folder</code>. 是否为文件夹(0否,1是)
     */
    public Integer getIsFolder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>cloud_disk.io_source.name</code>. 文件名
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.name</code>. 文件名
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>cloud_disk.io_source.file_type</code>. 文件扩展名，文件夹则为空
     */
    public void setFileType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.file_type</code>. 文件扩展名，文件夹则为空
     */
    public String getFileType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>cloud_disk.io_source.parent_id</code>. 父级资源id，为0则为部门或用户根文件夹，添加用户部门时自动新建
     */
    public void setParentId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.parent_id</code>. 父级资源id，为0则为部门或用户根文件夹，添加用户部门时自动新建
     */
    public Long getParentId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>cloud_disk.io_source.parent_level</code>. 父路径id; 例如:  ,2,5,10,
     */
    public void setParentLevel(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.parent_level</code>. 父路径id; 例如:  ,2,5,10,
     */
    public String getParentLevel() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cloud_disk.io_source.file_id</code>. 对应存储资源id,文件夹则该处为0
     */
    public void setFileId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.file_id</code>. 对应存储资源id,文件夹则该处为0
     */
    public Long getFileId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cloud_disk.io_source.is_delete</code>. 是否删除(0-正常 1-已删除)
     */
    public void setIsDelete(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.is_delete</code>. 是否删除(0-正常 1-已删除)
     */
    public Integer getIsDelete() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>cloud_disk.io_source.size</code>. 占用空间大小
     */
    public void setSize(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.size</code>. 占用空间大小
     */
    public Long getSize() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>cloud_disk.io_source.sort</code>. 排序/置顶
     */
    public void setSort(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.sort</code>. 排序/置顶
     */
    public Integer getSort() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>cloud_disk.io_source.can_share</code>. 是否可以分享 1 正常 0 禁止分享
     */
    public void setCanShare(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.can_share</code>. 是否可以分享 1 正常 0 禁止分享
     */
    public Integer getCanShare() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>cloud_disk.io_source.convert_size</code>. 转码文件占用空间大小
     */
    public void setConvertSize(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.convert_size</code>. 转码文件占用空间大小
     */
    public Long getConvertSize() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>cloud_disk.io_source.thumb_size</code>. 缩略图占用空间
     */
    public void setThumbSize(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.thumb_size</code>. 缩略图占用空间
     */
    public Long getThumbSize() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>cloud_disk.io_source.storage_id</code>. 磁盘ID
     */
    public void setStorageId(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.storage_id</code>. 磁盘ID
     */
    public Integer getStorageId() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>cloud_disk.io_source.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>cloud_disk.io_source.modify_time</code>. 最后修改时间
     */
    public void setModifyTime(LocalDateTime value) {
        set(21, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.modify_time</code>. 最后修改时间
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(21);
    }

    /**
     * Setter for <code>cloud_disk.io_source.view_time</code>. 最后访问时间
     */
    public void setViewTime(LocalDateTime value) {
        set(22, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.view_time</code>. 最后访问时间
     */
    public LocalDateTime getViewTime() {
        return (LocalDateTime) get(22);
    }

    /**
     * Setter for <code>cloud_disk.io_source.tenant_id</code>. 租户id
     */
    public void setTenantId(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.tenant_id</code>. 租户id
     */
    public Long getTenantId() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>cloud_disk.io_source.name_pinyin</code>. 拼音全称
     */
    public void setNamePinyin(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.name_pinyin</code>. 拼音全称
     */
    public String getNamePinyin() {
        return (String) get(24);
    }

    /**
     * Setter for <code>cloud_disk.io_source.name_pinyin_simple</code>. 拼音首字母
     */
    public void setNamePinyinSimple(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.name_pinyin_simple</code>. 拼音首字母
     */
    public String getNamePinyinSimple() {
        return (String) get(25);
    }

    /**
     * Setter for <code>cloud_disk.io_source.description</code>. 描述说明
     */
    public void setDescription(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>cloud_disk.io_source.description</code>. 描述说明
     */
    public String getDescription() {
        return (String) get(26);
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
     * Create a detached IoSourceRecord
     */
    public IoSourceRecord() {
        super(IoSource.IO_SOURCE);
    }

    /**
     * Create a detached, initialised IoSourceRecord
     */
    public IoSourceRecord(Long id, String sourceHash, Integer type, Integer targetType, Long targetId, Long createUser, Long modifyUser, Integer isFolder, String name, String fileType, Long parentId, String parentLevel, Long fileId, Integer isDelete, Long size, Integer sort, Integer canShare, Long convertSize, Long thumbSize, Integer storageId, LocalDateTime createTime, LocalDateTime modifyTime, LocalDateTime viewTime, Long tenantId, String namePinyin, String namePinyinSimple, String description) {
        super(IoSource.IO_SOURCE);

        set(0, id);
        set(1, sourceHash);
        set(2, type);
        set(3, targetType);
        set(4, targetId);
        set(5, createUser);
        set(6, modifyUser);
        set(7, isFolder);
        set(8, name);
        set(9, fileType);
        set(10, parentId);
        set(11, parentLevel);
        set(12, fileId);
        set(13, isDelete);
        set(14, size);
        set(15, sort);
        set(16, canShare);
        set(17, convertSize);
        set(18, thumbSize);
        set(19, storageId);
        set(20, createTime);
        set(21, modifyTime);
        set(22, viewTime);
        set(23, tenantId);
        set(24, namePinyin);
        set(25, namePinyinSimple);
        set(26, description);
    }
}
