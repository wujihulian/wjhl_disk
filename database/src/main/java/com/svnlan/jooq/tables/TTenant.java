/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables;


import com.svnlan.jooq.CloudDisk;
import com.svnlan.jooq.Indexes;
import com.svnlan.jooq.Keys;
import com.svnlan.jooq.tables.records.TTenantRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TTenant extends TableImpl<TTenantRecord> {

    private static final long serialVersionUID = -1999600155;

    /**
     * The reference instance of <code>cloud_disk.t_tenant</code>
     */
    public static final TTenant T_TENANT = new TTenant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TTenantRecord> getRecordType() {
        return TTenantRecord.class;
    }

    /**
     * The column <code>cloud_disk.t_tenant.id</code>.
     */
    public final TableField<TTenantRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>cloud_disk.t_tenant.tenant_name</code>. 名称
     */
    public final TableField<TTenantRecord, String> TENANT_NAME = createField(DSL.name("tenant_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "名称");

    /**
     * The column <code>cloud_disk.t_tenant.second_level_domain</code>. 二级域名
     */
    public final TableField<TTenantRecord, String> SECOND_LEVEL_DOMAIN = createField(DSL.name("second_level_domain"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "二级域名");

    /**
     * The column <code>cloud_disk.t_tenant.user_id</code>. 超级管理员，用户id
     */
    public final TableField<TTenantRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "超级管理员，用户id");

    /**
     * The column <code>cloud_disk.t_tenant.status</code>. 状态，0停用，1启用，2删除
     */
    public final TableField<TTenantRecord, Integer> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态，0停用，1启用，2删除");

    /**
     * The column <code>cloud_disk.t_tenant.start_time</code>. 生效时间
     */
    public final TableField<TTenantRecord, LocalDateTime> START_TIME = createField(DSL.name("start_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "生效时间");

    /**
     * The column <code>cloud_disk.t_tenant.expire_time</code>. 失效时间
     */
    public final TableField<TTenantRecord, LocalDateTime> EXPIRE_TIME = createField(DSL.name("expire_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "失效时间");

    /**
     * The column <code>cloud_disk.t_tenant.size_use</code>. 已使用大小(byte)
     */
    public final TableField<TTenantRecord, Long> SIZE_USE = createField(DSL.name("size_use"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "已使用大小(byte)");

    /**
     * The column <code>cloud_disk.t_tenant.group_count</code>. 组织数
     */
    public final TableField<TTenantRecord, Long> GROUP_COUNT = createField(DSL.name("group_count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "组织数");

    /**
     * The column <code>cloud_disk.t_tenant.user_count</code>. 用户数
     */
    public final TableField<TTenantRecord, Long> USER_COUNT = createField(DSL.name("user_count"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "用户数");

    /**
     * The column <code>cloud_disk.t_tenant.remark</code>. 备注
     */
    public final TableField<TTenantRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "备注");

    /**
     * The column <code>cloud_disk.t_tenant.create_time</code>. 创建时间
     */
    public final TableField<TTenantRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "创建时间");

    /**
     * The column <code>cloud_disk.t_tenant.modify_time</code>. 最后修改
     */
    public final TableField<TTenantRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "最后修改");

    /**
     * The column <code>cloud_disk.t_tenant.dr</code>. 逻辑删除 0 未删除 1 已删除
     */
    public final TableField<TTenantRecord, Integer> DR = createField(DSL.name("dr"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "逻辑删除 0 未删除 1 已删除");

    /**
     * The column <code>cloud_disk.t_tenant.is_system</code>. 是否是系统租户  0 否 1 是
     */
    public final TableField<TTenantRecord, Integer> IS_SYSTEM = createField(DSL.name("is_system"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否是系统租户  0 否 1 是");

    /**
     * Create a <code>cloud_disk.t_tenant</code> table reference
     */
    public TTenant() {
        this(DSL.name("t_tenant"), null);
    }

    /**
     * Create an aliased <code>cloud_disk.t_tenant</code> table reference
     */
    public TTenant(String alias) {
        this(DSL.name(alias), T_TENANT);
    }

    /**
     * Create an aliased <code>cloud_disk.t_tenant</code> table reference
     */
    public TTenant(Name alias) {
        this(alias, T_TENANT);
    }

    private TTenant(Name alias, Table<TTenantRecord> aliased) {
        this(alias, aliased, null);
    }

    private TTenant(Name alias, Table<TTenantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("租户表"));
    }

    public <O extends Record> TTenant(Table<O> child, ForeignKey<O, TTenantRecord> key) {
        super(child, key, T_TENANT);
    }

    @Override
    public Schema getSchema() {
        return CloudDisk.CLOUD_DISK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_TENANT_PRIMARY);
    }

    @Override
    public Identity<TTenantRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_TENANT;
    }

    @Override
    public UniqueKey<TTenantRecord> getPrimaryKey() {
        return Keys.KEY_T_TENANT_PRIMARY;
    }

    @Override
    public List<UniqueKey<TTenantRecord>> getKeys() {
        return Arrays.<UniqueKey<TTenantRecord>>asList(Keys.KEY_T_TENANT_PRIMARY);
    }

    @Override
    public TTenant as(String alias) {
        return new TTenant(DSL.name(alias), this);
    }

    @Override
    public TTenant as(Name alias) {
        return new TTenant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TTenant rename(String name) {
        return new TTenant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TTenant rename(Name name) {
        return new TTenant(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, String, String, Long, Integer, LocalDateTime, LocalDateTime, Long, Long, Long, String, LocalDateTime, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
