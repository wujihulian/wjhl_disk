/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables;


import com.svnlan.jooq.CloudDisk;
import com.svnlan.jooq.Indexes;
import com.svnlan.jooq.Keys;
import com.svnlan.jooq.tables.records.CommonScheduleRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 定时任务表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommonSchedule extends TableImpl<CommonScheduleRecord> {

    private static final long serialVersionUID = 133319307;

    /**
     * The reference instance of <code>cloud_disk.common_schedule</code>
     */
    public static final CommonSchedule COMMON_SCHEDULE = new CommonSchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommonScheduleRecord> getRecordType() {
        return CommonScheduleRecord.class;
    }

    /**
     * The column <code>cloud_disk.common_schedule.id</code>.
     */
    public final TableField<CommonScheduleRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>cloud_disk.common_schedule.schedule_name</code>. 定时任务名称
     */
    public final TableField<CommonScheduleRecord, String> SCHEDULE_NAME = createField(DSL.name("schedule_name"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "定时任务名称");

    /**
     * The column <code>cloud_disk.common_schedule.gmt_modified</code>. 任务重置时间
     */
    public final TableField<CommonScheduleRecord, LocalDateTime> GMT_MODIFIED = createField(DSL.name("gmt_modified"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "任务重置时间");

    /**
     * The column <code>cloud_disk.common_schedule.frequency</code>. 执行频率(秒)
     */
    public final TableField<CommonScheduleRecord, Integer> FREQUENCY = createField(DSL.name("frequency"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "执行频率(秒)");

    /**
     * The column <code>cloud_disk.common_schedule.api_url</code>. 手动执行接口地址
     */
    public final TableField<CommonScheduleRecord, String> API_URL = createField(DSL.name("api_url"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "手动执行接口地址");

    /**
     * The column <code>cloud_disk.common_schedule.tenant_id</code>. 租户id
     */
    public final TableField<CommonScheduleRecord, Long> TENANT_ID = createField(DSL.name("tenant_id"), org.jooq.impl.SQLDataType.BIGINT, this, "租户id");

    /**
     * Create a <code>cloud_disk.common_schedule</code> table reference
     */
    public CommonSchedule() {
        this(DSL.name("common_schedule"), null);
    }

    /**
     * Create an aliased <code>cloud_disk.common_schedule</code> table reference
     */
    public CommonSchedule(String alias) {
        this(DSL.name(alias), COMMON_SCHEDULE);
    }

    /**
     * Create an aliased <code>cloud_disk.common_schedule</code> table reference
     */
    public CommonSchedule(Name alias) {
        this(alias, COMMON_SCHEDULE);
    }

    private CommonSchedule(Name alias, Table<CommonScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommonSchedule(Name alias, Table<CommonScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("定时任务表"));
    }

    public <O extends Record> CommonSchedule(Table<O> child, ForeignKey<O, CommonScheduleRecord> key) {
        super(child, key, COMMON_SCHEDULE);
    }

    @Override
    public Schema getSchema() {
        return CloudDisk.CLOUD_DISK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMON_SCHEDULE_PRIMARY);
    }

    @Override
    public UniqueKey<CommonScheduleRecord> getPrimaryKey() {
        return Keys.KEY_COMMON_SCHEDULE_PRIMARY;
    }

    @Override
    public List<UniqueKey<CommonScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<CommonScheduleRecord>>asList(Keys.KEY_COMMON_SCHEDULE_PRIMARY);
    }

    @Override
    public CommonSchedule as(String alias) {
        return new CommonSchedule(DSL.name(alias), this);
    }

    @Override
    public CommonSchedule as(Name alias) {
        return new CommonSchedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommonSchedule rename(String name) {
        return new CommonSchedule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommonSchedule rename(Name name) {
        return new CommonSchedule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, LocalDateTime, Integer, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
