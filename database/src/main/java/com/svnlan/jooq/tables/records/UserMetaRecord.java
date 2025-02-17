/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables.records;


import com.svnlan.jooq.tables.UserMeta;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户数据扩展表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMetaRecord extends UpdatableRecordImpl<UserMetaRecord> implements Record7<Long, Long, String, String, LocalDateTime, LocalDateTime, Long> {

    private static final long serialVersionUID = -1667393112;

    /**
     * Setter for <code>cloud_disk.user_meta.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.user_id</code>. 用户id
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.user_id</code>. 用户id
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.key_string</code>. 存储key
     */
    public void setKeyString(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.key_string</code>. 存储key
     */
    public String getKeyString() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.value_text</code>. 对应值
     */
    public void setValueText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.value_text</code>. 对应值
     */
    public String getValueText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.modify_time</code>. 最后修改时间
     */
    public void setModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.modify_time</code>. 最后修改时间
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>cloud_disk.user_meta.tenant_id</code>. 租户id
     */
    public void setTenantId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>cloud_disk.user_meta.tenant_id</code>. 租户id
     */
    public Long getTenantId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, String, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, String, LocalDateTime, LocalDateTime, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UserMeta.USER_META.ID;
    }

    @Override
    public Field<Long> field2() {
        return UserMeta.USER_META.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return UserMeta.USER_META.KEY_STRING;
    }

    @Override
    public Field<String> field4() {
        return UserMeta.USER_META.VALUE_TEXT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return UserMeta.USER_META.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return UserMeta.USER_META.MODIFY_TIME;
    }

    @Override
    public Field<Long> field7() {
        return UserMeta.USER_META.TENANT_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getKeyString();
    }

    @Override
    public String component4() {
        return getValueText();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component6() {
        return getModifyTime();
    }

    @Override
    public Long component7() {
        return getTenantId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getKeyString();
    }

    @Override
    public String value4() {
        return getValueText();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getModifyTime();
    }

    @Override
    public Long value7() {
        return getTenantId();
    }

    @Override
    public UserMetaRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UserMetaRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserMetaRecord value3(String value) {
        setKeyString(value);
        return this;
    }

    @Override
    public UserMetaRecord value4(String value) {
        setValueText(value);
        return this;
    }

    @Override
    public UserMetaRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserMetaRecord value6(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public UserMetaRecord value7(Long value) {
        setTenantId(value);
        return this;
    }

    @Override
    public UserMetaRecord values(Long value1, Long value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserMetaRecord
     */
    public UserMetaRecord() {
        super(UserMeta.USER_META);
    }

    /**
     * Create a detached, initialised UserMetaRecord
     */
    public UserMetaRecord(Long id, Long userId, String keyString, String valueText, LocalDateTime createTime, LocalDateTime modifyTime, Long tenantId) {
        super(UserMeta.USER_META);

        set(0, id);
        set(1, userId);
        set(2, keyString);
        set(3, valueText);
        set(4, createTime);
        set(5, modifyTime);
        set(6, tenantId);
    }
}
