/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables;


import com.svnlan.jooq.CloudDisk;
import com.svnlan.jooq.Indexes;
import com.svnlan.jooq.Keys;
import com.svnlan.jooq.tables.records.IoFileContentsRecord;

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
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 文件id
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IoFileContents extends TableImpl<IoFileContentsRecord> {

    private static final long serialVersionUID = -692275817;

    /**
     * The reference instance of <code>cloud_disk.io_file_contents</code>
     */
    public static final IoFileContents IO_FILE_CONTENTS = new IoFileContents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IoFileContentsRecord> getRecordType() {
        return IoFileContentsRecord.class;
    }

    /**
     * The column <code>cloud_disk.io_file_contents.file_id</code>.
     */
    public final TableField<IoFileContentsRecord, Long> FILE_ID = createField(DSL.name("file_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>cloud_disk.io_file_contents.content</code>. 文本文件内容,最大16M
     */
    public final TableField<IoFileContentsRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "文本文件内容,最大16M");

    /**
     * The column <code>cloud_disk.io_file_contents.create_time</code>. 创建时间
     */
    public final TableField<IoFileContentsRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "创建时间");

    /**
     * The column <code>cloud_disk.io_file_contents.tenant_id</code>. 租户id
     */
    public final TableField<IoFileContentsRecord, Long> TENANT_ID = createField(DSL.name("tenant_id"), org.jooq.impl.SQLDataType.BIGINT, this, "租户id");

    /**
     * Create a <code>cloud_disk.io_file_contents</code> table reference
     */
    public IoFileContents() {
        this(DSL.name("io_file_contents"), null);
    }

    /**
     * Create an aliased <code>cloud_disk.io_file_contents</code> table reference
     */
    public IoFileContents(String alias) {
        this(DSL.name(alias), IO_FILE_CONTENTS);
    }

    /**
     * Create an aliased <code>cloud_disk.io_file_contents</code> table reference
     */
    public IoFileContents(Name alias) {
        this(alias, IO_FILE_CONTENTS);
    }

    private IoFileContents(Name alias, Table<IoFileContentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private IoFileContents(Name alias, Table<IoFileContentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("文件id"));
    }

    public <O extends Record> IoFileContents(Table<O> child, ForeignKey<O, IoFileContentsRecord> key) {
        super(child, key, IO_FILE_CONTENTS);
    }

    @Override
    public Schema getSchema() {
        return CloudDisk.CLOUD_DISK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IO_FILE_CONTENTS_PRIMARY);
    }

    @Override
    public Identity<IoFileContentsRecord, Long> getIdentity() {
        return Keys.IDENTITY_IO_FILE_CONTENTS;
    }

    @Override
    public UniqueKey<IoFileContentsRecord> getPrimaryKey() {
        return Keys.KEY_IO_FILE_CONTENTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<IoFileContentsRecord>> getKeys() {
        return Arrays.<UniqueKey<IoFileContentsRecord>>asList(Keys.KEY_IO_FILE_CONTENTS_PRIMARY);
    }

    @Override
    public IoFileContents as(String alias) {
        return new IoFileContents(DSL.name(alias), this);
    }

    @Override
    public IoFileContents as(Name alias) {
        return new IoFileContents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoFileContents rename(String name) {
        return new IoFileContents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoFileContents rename(Name name) {
        return new IoFileContents(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, LocalDateTime, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
