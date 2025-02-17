/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * 租户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTenantModel implements Serializable {

    private static final long serialVersionUID = 667089726;

    protected Long          id;
    protected String        tenantName;
    protected String        secondLevelDomain;
    protected Long          userId;
    protected Integer       status;
    protected LocalDateTime startTime;
    protected LocalDateTime expireTime;
    protected Long          sizeUse;
    protected Long          groupCount;
    protected Long          userCount;
    protected String        remark;
    protected LocalDateTime createTime;
    protected LocalDateTime modifyTime;
    protected Integer       dr;
    protected Integer       isSystem;

    public TTenantModel() {}

    public TTenantModel(TTenantModel value) {
        this.id = value.id;
        this.tenantName = value.tenantName;
        this.secondLevelDomain = value.secondLevelDomain;
        this.userId = value.userId;
        this.status = value.status;
        this.startTime = value.startTime;
        this.expireTime = value.expireTime;
        this.sizeUse = value.sizeUse;
        this.groupCount = value.groupCount;
        this.userCount = value.userCount;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.dr = value.dr;
        this.isSystem = value.isSystem;
    }

    public TTenantModel(
        Long          id,
        String        tenantName,
        String        secondLevelDomain,
        Long          userId,
        Integer       status,
        LocalDateTime startTime,
        LocalDateTime expireTime,
        Long          sizeUse,
        Long          groupCount,
        Long          userCount,
        String        remark,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Integer       dr,
        Integer       isSystem
    ) {
        this.id = id;
        this.tenantName = tenantName;
        this.secondLevelDomain = secondLevelDomain;
        this.userId = userId;
        this.status = status;
        this.startTime = startTime;
        this.expireTime = expireTime;
        this.sizeUse = sizeUse;
        this.groupCount = groupCount;
        this.userCount = userCount;
        this.remark = remark;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.dr = dr;
        this.isSystem = isSystem;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getSecondLevelDomain() {
        return this.secondLevelDomain;
    }

    public void setSecondLevelDomain(String secondLevelDomain) {
        this.secondLevelDomain = secondLevelDomain;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public Long getSizeUse() {
        return this.sizeUse;
    }

    public void setSizeUse(Long sizeUse) {
        this.sizeUse = sizeUse;
    }

    public Long getGroupCount() {
        return this.groupCount;
    }

    public void setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
    }

    public Long getUserCount() {
        return this.userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Integer getIsSystem() {
        return this.isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TTenantModel (");

        sb.append(id);
        sb.append(", ").append(tenantName);
        sb.append(", ").append(secondLevelDomain);
        sb.append(", ").append(userId);
        sb.append(", ").append(status);
        sb.append(", ").append(startTime);
        sb.append(", ").append(expireTime);
        sb.append(", ").append(sizeUse);
        sb.append(", ").append(groupCount);
        sb.append(", ").append(userCount);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(dr);
        sb.append(", ").append(isSystem);

        sb.append(")");
        return sb.toString();
    }
}
