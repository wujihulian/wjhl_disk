/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * 评论点赞表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentPraiseModel implements Serializable {

    private static final long serialVersionUID = 631274968;

    protected Long          id;
    protected Long          commentId;
    protected Long          userId;
    protected LocalDateTime createTime;
    protected LocalDateTime modifyTime;
    protected Long          tenantId;

    public CommentPraiseModel() {}

    public CommentPraiseModel(CommentPraiseModel value) {
        this.id = value.id;
        this.commentId = value.commentId;
        this.userId = value.userId;
        this.createTime = value.createTime;
        this.modifyTime = value.modifyTime;
        this.tenantId = value.tenantId;
    }

    public CommentPraiseModel(
        Long          id,
        Long          commentId,
        Long          userId,
        LocalDateTime createTime,
        LocalDateTime modifyTime,
        Long          tenantId
    ) {
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.tenantId = tenantId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommentPraiseModel (");

        sb.append(id);
        sb.append(", ").append(commentId);
        sb.append(", ").append(userId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(tenantId);

        sb.append(")");
        return sb.toString();
    }
}
