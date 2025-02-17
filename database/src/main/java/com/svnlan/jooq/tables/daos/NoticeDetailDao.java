/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.daos;


import com.svnlan.jooq.tables.NoticeDetail;
import com.svnlan.jooq.tables.pojos.NoticeDetailModel;
import com.svnlan.jooq.tables.records.NoticeDetailRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.JSON;
import org.jooq.impl.DAOImpl;


/**
 * 通知详情表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NoticeDetailDao extends DAOImpl<NoticeDetailRecord, NoticeDetailModel, Long> {

    /**
     * Create a new NoticeDetailDao without any configuration
     */
    public NoticeDetailDao() {
        super(NoticeDetail.NOTICE_DETAIL, NoticeDetailModel.class);
    }

    /**
     * Create a new NoticeDetailDao with an attached configuration
     */
    public NoticeDetailDao(Configuration configuration) {
        super(NoticeDetail.NOTICE_DETAIL, NoticeDetailModel.class, configuration);
    }

    @Override
    public Long getId(NoticeDetailModel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<NoticeDetailModel> fetchById(Long... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public NoticeDetailModel fetchOneById(Long value) {
        return fetchOne(NoticeDetail.NOTICE_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>notice_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfNoticeId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.NOTICE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notice_id IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByNoticeId(Long... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.NOTICE_ID, values);
    }

    /**
     * Fetch records that have <code>content BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfContent(String lowerInclusive, String upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.CONTENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByContent(String... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.CONTENT, values);
    }

    /**
     * Fetch records that have <code>is_all BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfIsAll(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.IS_ALL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_all IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByIsAll(Integer... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.IS_ALL, values);
    }

    /**
     * Fetch records that have <code>target_user_ids BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfTargetUserIds(JSON lowerInclusive, JSON upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.TARGET_USER_IDS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>target_user_ids IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByTargetUserIds(JSON... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.TARGET_USER_IDS, values);
    }

    /**
     * Fetch records that have <code>target_dept_ids BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfTargetDeptIds(JSON lowerInclusive, JSON upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.TARGET_DEPT_IDS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>target_dept_ids IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByTargetDeptIds(JSON... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.TARGET_DEPT_IDS, values);
    }

    /**
     * Fetch records that have <code>target_role_ids BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfTargetRoleIds(JSON lowerInclusive, JSON upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.TARGET_ROLE_IDS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>target_role_ids IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByTargetRoleIds(JSON... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.TARGET_ROLE_IDS, values);
    }

    /**
     * Fetch records that have <code>notice_detail_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfNoticeDetailId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.NOTICE_DETAIL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notice_detail_id IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByNoticeDetailId(Long... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.NOTICE_DETAIL_ID, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByCreateTime(LocalDateTime... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>modify_time IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByModifyTime(LocalDateTime... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>dr BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfDr(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.DR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>dr IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByDr(Integer... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.DR, values);
    }

    /**
     * Fetch records that have <code>tenant_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<NoticeDetailModel> fetchRangeOfTenantId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(NoticeDetail.NOTICE_DETAIL.TENANT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tenant_id IN (values)</code>
     */
    public List<NoticeDetailModel> fetchByTenantId(Long... values) {
        return fetch(NoticeDetail.NOTICE_DETAIL.TENANT_ID, values);
    }
}
