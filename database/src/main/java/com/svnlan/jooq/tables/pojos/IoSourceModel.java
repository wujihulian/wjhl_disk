/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public class IoSourceModel implements Serializable {

    private static final long serialVersionUID = 2016322909;

    protected Long          id;
    protected String        sourceHash;
    protected Integer       type;
    protected Integer       targetType;
    protected Long          targetId;
    protected Long          createUser;
    protected Long          modifyUser;
    protected Integer       isFolder;
    protected String        name;
    protected String        fileType;
    protected Long          parentId;
    protected String        parentLevel;
    protected Long          fileId;
    protected Integer       isDelete;
    protected Long          size;
    protected Integer       sort;
    protected Integer       canShare;
    protected Long          convertSize;
    protected Long          thumbSize;
    protected Integer       storageId;
    protected LocalDateTime createTime;
    protected LocalDateTime modifyTime;
    protected LocalDateTime viewTime;
    protected Long          tenantId;
    protected String        namePinyin;
    protected String        namePinyinSimple;
    protected String        description;

    public IoSourceModel() {}

    public IoSourceModel(IoSourceModel value) {
        this.id = value.id;
        this.sourceHash = value.sourceHash;
        this.type = value.type;
        this.targetType = value.targetType;
        this.targetId = value.targetId;
        this.createUser = value.createUser;
        this.modifyUser = value.modifyUser;
        this.isFolder = value.isFolder;
        this.name = value.name;
        this.fileType = value.fileType;
        this.parentId = value.parentId;
        this.parentLevel = value.parentLevel;
        this.fileId = value.fileId;
        this.isDelete = value.isDelete;
        this.size = value.size;
        this.sort = value.sort;
        this.canShare = value.canShare;
        this.convertSize = value.convertSize;
        this.thumbSize = value.thumbSize;
        this.storageId = value.storageId;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.viewTime = value.viewTime;
        this.tenantId = value.tenantId;
        this.namePinyin = value.namePinyin;
        this.namePinyinSimple = value.namePinyinSimple;
        this.description = value.description;
    }

    public IoSourceModel(
        Long          id,
        String        sourceHash,
        Integer       type,
        Integer       targetType,
        Long          targetId,
        Long          createUser,
        Long          modifyUser,
        Integer       isFolder,
        String        name,
        String        fileType,
        Long          parentId,
        String        parentLevel,
        Long          fileId,
        Integer       isDelete,
        Long          size,
        Integer       sort,
        Integer       canShare,
        Long          convertSize,
        Long          thumbSize,
        Integer       storageId,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        LocalDateTime viewTime,
        Long          tenantId,
        String        namePinyin,
        String        namePinyinSimple,
        String        description
    ) {
        this.id = id;
        this.sourceHash = sourceHash;
        this.type = type;
        this.targetType = targetType;
        this.targetId = targetId;
        this.createUser = createUser;
        this.modifyUser = modifyUser;
        this.isFolder = isFolder;
        this.name = name;
        this.fileType = fileType;
        this.parentId = parentId;
        this.parentLevel = parentLevel;
        this.fileId = fileId;
        this.isDelete = isDelete;
        this.size = size;
        this.sort = sort;
        this.canShare = canShare;
        this.convertSize = convertSize;
        this.thumbSize = thumbSize;
        this.storageId = storageId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.viewTime = viewTime;
        this.tenantId = tenantId;
        this.namePinyin = namePinyin;
        this.namePinyinSimple = namePinyinSimple;
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceHash() {
        return this.sourceHash;
    }

    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTargetType() {
        return this.targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Long getTargetId() {
        return this.targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getModifyUser() {
        return this.modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Integer getIsFolder() {
        return this.isFolder;
    }

    public void setIsFolder(Integer isFolder) {
        this.isFolder = isFolder;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentLevel() {
        return this.parentLevel;
    }

    public void setParentLevel(String parentLevel) {
        this.parentLevel = parentLevel;
    }

    public Long getFileId() {
        return this.fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getCanShare() {
        return this.canShare;
    }

    public void setCanShare(Integer canShare) {
        this.canShare = canShare;
    }

    public Long getConvertSize() {
        return this.convertSize;
    }

    public void setConvertSize(Long convertSize) {
        this.convertSize = convertSize;
    }

    public Long getThumbSize() {
        return this.thumbSize;
    }

    public void setThumbSize(Long thumbSize) {
        this.thumbSize = thumbSize;
    }

    public Integer getStorageId() {
        return this.storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public LocalDateTime getViewTime() {
        return this.viewTime;
    }

    public void setViewTime(LocalDateTime viewTime) {
        this.viewTime = viewTime;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getNamePinyinSimple() {
        return this.namePinyinSimple;
    }

    public void setNamePinyinSimple(String namePinyinSimple) {
        this.namePinyinSimple = namePinyinSimple;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IoSourceModel (");

        sb.append(id);
        sb.append(", ").append(sourceHash);
        sb.append(", ").append(type);
        sb.append(", ").append(targetType);
        sb.append(", ").append(targetId);
        sb.append(", ").append(createUser);
        sb.append(", ").append(modifyUser);
        sb.append(", ").append(isFolder);
        sb.append(", ").append(name);
        sb.append(", ").append(fileType);
        sb.append(", ").append(parentId);
        sb.append(", ").append(parentLevel);
        sb.append(", ").append(fileId);
        sb.append(", ").append(isDelete);
        sb.append(", ").append(size);
        sb.append(", ").append(sort);
        sb.append(", ").append(canShare);
        sb.append(", ").append(convertSize);
        sb.append(", ").append(thumbSize);
        sb.append(", ").append(storageId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(viewTime);
        sb.append(", ").append(tenantId);
        sb.append(", ").append(namePinyin);
        sb.append(", ").append(namePinyinSimple);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
