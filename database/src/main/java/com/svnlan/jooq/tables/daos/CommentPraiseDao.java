/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.daos;


import com.svnlan.jooq.tables.CommentPraise;
import com.svnlan.jooq.tables.pojos.CommentPraiseModel;
import com.svnlan.jooq.tables.records.CommentPraiseRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class CommentPraiseDao extends DAOImpl<CommentPraiseRecord, CommentPraiseModel, Long> {

    /**
     * Create a new CommentPraiseDao without any configuration
     */
    public CommentPraiseDao() {
        super(CommentPraise.COMMENT_PRAISE, CommentPraiseModel.class);
    }

    /**
     * Create a new CommentPraiseDao with an attached configuration
     */
    public CommentPraiseDao(Configuration configuration) {
        super(CommentPraise.COMMENT_PRAISE, CommentPraiseModel.class, configuration);
    }

    @Override
    public Long getId(CommentPraiseModel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<CommentPraiseModel> fetchById(Long... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public CommentPraiseModel fetchOneById(Long value) {
        return fetchOne(CommentPraise.COMMENT_PRAISE.ID, value);
    }

    /**
     * Fetch records that have <code>comment_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfCommentId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.COMMENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>comment_id IN (values)</code>
     */
    public List<CommentPraiseModel> fetchByCommentId(Long... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.COMMENT_ID, values);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfUserId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<CommentPraiseModel> fetchByUserId(Long... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.USER_ID, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<CommentPraiseModel> fetchByCreateTime(LocalDateTime... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modify_time IN (values)</code>
     */
    public List<CommentPraiseModel> fetchByModifyTime(LocalDateTime... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>tenant_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<CommentPraiseModel> fetchRangeOfTenantId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(CommentPraise.COMMENT_PRAISE.TENANT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tenant_id IN (values)</code>
     */
    public List<CommentPraiseModel> fetchByTenantId(Long... values) {
        return fetch(CommentPraise.COMMENT_PRAISE.TENANT_ID, values);
    }
}
