/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables;


import com.svnlan.jooq.CloudDisk;
import com.svnlan.jooq.Indexes;
import com.svnlan.jooq.Keys;
import com.svnlan.jooq.tables.records.SystemOptionRecord;

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
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 系统配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemOption extends TableImpl<SystemOptionRecord> {

    private static final long serialVersionUID = -1439631780;

    /**
     * The reference instance of <code>cloud_disk.system_option</code>
     */
    public static final SystemOption SYSTEM_OPTION = new SystemOption();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemOptionRecord> getRecordType() {
        return SystemOptionRecord.class;
    }

    /**
     * The column <code>cloud_disk.system_option.id</code>.
     */
    public final TableField<SystemOptionRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>cloud_disk.system_option.type</code>. 配置类型
     */
    public final TableField<SystemOptionRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "配置类型");

    /**
     * The column <code>cloud_disk.system_option.key_string</code>.
     */
    public final TableField<SystemOptionRecord, String> KEY_STRING = createField(DSL.name("key_string"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>cloud_disk.system_option.value_text</code>.
     */
    public final TableField<SystemOptionRecord, String> VALUE_TEXT = createField(DSL.name("value_text"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>cloud_disk.system_option.create_time</code>. 创建时间
     */
    public final TableField<SystemOptionRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "创建时间");

    /**
     * The column <code>cloud_disk.system_option.modify_time</code>. 最后更新时间
     */
    public final TableField<SystemOptionRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "最后更新时间");

    /**
     * The column <code>cloud_disk.system_option.tenant_id</code>. 租户id
     */
    public final TableField<SystemOptionRecord, Long> TENANT_ID = createField(DSL.name("tenant_id"), org.jooq.impl.SQLDataType.BIGINT, this, "租户id");

    /**
     * Create a <code>cloud_disk.system_option</code> table reference
     */
    public SystemOption() {
        this(DSL.name("system_option"), null);
    }

    /**
     * Create an aliased <code>cloud_disk.system_option</code> table reference
     */
    public SystemOption(String alias) {
        this(DSL.name(alias), SYSTEM_OPTION);
    }

    /**
     * Create an aliased <code>cloud_disk.system_option</code> table reference
     */
    public SystemOption(Name alias) {
        this(alias, SYSTEM_OPTION);
    }

    private SystemOption(Name alias, Table<SystemOptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemOption(Name alias, Table<SystemOptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("系统配置表"));
    }

    public <O extends Record> SystemOption(Table<O> child, ForeignKey<O, SystemOptionRecord> key) {
        super(child, key, SYSTEM_OPTION);
    }

    @Override
    public Schema getSchema() {
        return CloudDisk.CLOUD_DISK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYSTEM_OPTION_PRIMARY, Indexes.SYSTEM_OPTION_TENANT_ID_KEY_TYPE);
    }

    @Override
    public Identity<SystemOptionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SYSTEM_OPTION;
    }

    @Override
    public UniqueKey<SystemOptionRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_OPTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemOptionRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemOptionRecord>>asList(Keys.KEY_SYSTEM_OPTION_PRIMARY, Keys.KEY_SYSTEM_OPTION_TENANT_ID_KEY_TYPE);
    }

    @Override
    public SystemOption as(String alias) {
        return new SystemOption(DSL.name(alias), this);
    }

    @Override
    public SystemOption as(Name alias) {
        return new SystemOption(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemOption rename(String name) {
        return new SystemOption(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemOption rename(Name name) {
        return new SystemOption(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
