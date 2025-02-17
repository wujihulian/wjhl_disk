/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.daos;


import com.svnlan.jooq.tables.Comment;
import com.svnlan.jooq.tables.pojos.CommentModel;
import com.svnlan.jooq.tables.records.CommentRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 通用评论表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentDao extends DAOImpl<CommentRecord, CommentModel, Long> {

    /**
     * Create a new CommentDao without any configuration
     */
    public CommentDao() {
        super(Comment.COMMENT, CommentModel.class);
    }

    /**
     * Create a new CommentDao with an attached configuration
     */
    public CommentDao(Configuration configuration) {
        super(Comment.COMMENT, CommentModel.class, configuration);
    }

    @Override
    public Long getId(CommentModel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Comment.COMMENT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<CommentModel> fetchById(Long... values) {
        return fetch(Comment.COMMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public CommentModel fetchOneById(Long value) {
        return fetchOne(Comment.COMMENT.ID, value);
    }

    /**
     * Fetch records that have <code>pid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfPid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Comment.COMMENT.PID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pid IN (values)</code>
     */
    public List<CommentModel> fetchByPid(Long... values) {
        return fetch(Comment.COMMENT.PID, values);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfUserId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Comment.COMMENT.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<CommentModel> fetchByUserId(Long... values) {
        return fetch(Comment.COMMENT.USER_ID, values);
    }

    /**
     * Fetch records that have <code>target_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfTargetType(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.TARGET_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>target_type IN (values)</code>
     */
    public List<CommentModel> fetchByTargetType(Integer... values) {
        return fetch(Comment.COMMENT.TARGET_TYPE, values);
    }

    /**
     * Fetch records that have <code>target_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfTargetId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Comment.COMMENT.TARGET_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>target_id IN (values)</code>
     */
    public List<CommentModel> fetchByTargetId(Long... values) {
        return fetch(Comment.COMMENT.TARGET_ID, values);
    }

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(Comment.COMMENT.CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<CommentModel> fetchByContent(String... values) {
        return fetch(Comment.COMMENT.CONTENT, values);
    }

    /**
     * Fetch records that have <code>praise_count BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfPraiseCount(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.PRAISE_COUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>praise_count IN (values)</code>
     */
    public List<CommentModel> fetchByPraiseCount(Integer... values) {
        return fetch(Comment.COMMENT.PRAISE_COUNT, values);
    }

    /**
     * Fetch records that have <code>comment_count BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfCommentCount(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.COMMENT_COUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>comment_count IN (values)</code>
     */
    public List<CommentModel> fetchByCommentCount(Integer... values) {
        return fetch(Comment.COMMENT.COMMENT_COUNT, values);
    }

    /**
     * Fetch records that have <code>status BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfStatus(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Comment.COMMENT.STATUS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<CommentModel> fetchByStatus(Integer... values) {
        return fetch(Comment.COMMENT.STATUS, values);
    }

    /**
     * Fetch records that have <code>modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Comment.COMMENT.MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modify_time IN (values)</code>
     */
    public List<CommentModel> fetchByModifyTime(LocalDateTime... values) {
        return fetch(Comment.COMMENT.MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Comment.COMMENT.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<CommentModel> fetchByCreateTime(LocalDateTime... values) {
        return fetch(Comment.COMMENT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>tenant_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentModel> fetchRangeOfTenantId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Comment.COMMENT.TENANT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tenant_id IN (values)</code>
     */
    public List<CommentModel> fetchByTenantId(Long... values) {
        return fetch(Comment.COMMENT.TENANT_ID, values);
    }
}
