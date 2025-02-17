/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq.tables;


import com.svnlan.jooq.CloudDisk;
import com.svnlan.jooq.Indexes;
import com.svnlan.jooq.Keys;
import com.svnlan.jooq.tables.records.CommonDesignRecord;

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
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 页面编辑器表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommonDesign extends TableImpl<CommonDesignRecord> {

    private static final long serialVersionUID = -825177237;

    /**
     * The reference instance of <code>cloud_disk.common_design</code>
     */
    public static final CommonDesign COMMON_DESIGN = new CommonDesign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommonDesignRecord> getRecordType() {
        return CommonDesignRecord.class;
    }

    /**
     * The column <code>cloud_disk.common_design.id</code>.
     */
    public final TableField<CommonDesignRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>cloud_disk.common_design.title</code>. 名称
     */
    public final TableField<CommonDesignRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "名称");

    /**
     * The column <code>cloud_disk.common_design.offset</code>. 偏移量，坐标{x,y}
     */
    public final TableField<CommonDesignRecord, String> OFFSET = createField(DSL.name("offset"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "偏移量，坐标{x,y}");

    /**
     * The column <code>cloud_disk.common_design.size</code>. 尺寸大小，长宽{length,height}
     */
    public final TableField<CommonDesignRecord, String> SIZE = createField(DSL.name("size"), org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "尺寸大小，长宽{length,height}");

    /**
     * The column <code>cloud_disk.common_design.pic</code>. 缩略图，文件id
     */
    public final TableField<CommonDesignRecord, Long> PIC = createField(DSL.name("pic"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "缩略图，文件id");

    /**
     * The column <code>cloud_disk.common_design.gmt_create</code>. 创建时间
     */
    public final TableField<CommonDesignRecord, LocalDateTime> GMT_CREATE = createField(DSL.name("gmt_create"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "创建时间");

    /**
     * The column <code>cloud_disk.common_design.gmt_modified</code>. 修改时间
     */
    public final TableField<CommonDesignRecord, LocalDateTime> GMT_MODIFIED = createField(DSL.name("gmt_modified"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "修改时间");

    /**
     * The column <code>cloud_disk.common_design.detail</code>. 页面内容
     */
    public final TableField<CommonDesignRecord, String> DETAIL = createField(DSL.name("detail"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "页面内容");

    /**
     * The column <code>cloud_disk.common_design.design_type</code>. 编辑器类型类型，1主页，2二级页
     */
    public final TableField<CommonDesignRecord, String> DESIGN_TYPE = createField(DSL.name("design_type"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "编辑器类型类型，1主页，2二级页");

    /**
     * The column <code>cloud_disk.common_design.client_type</code>. 客户端类型，1PC，2手机端，3APP，4小程序
     */
    public final TableField<CommonDesignRecord, String> CLIENT_TYPE = createField(DSL.name("client_type"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "客户端类型，1PC，2手机端，3APP，4小程序");

    /**
     * The column <code>cloud_disk.common_design.is_used</code>. 标识是否当前使用中的设置，是或否
     */
    public final TableField<CommonDesignRecord, Integer> IS_USED = createField(DSL.name("is_used"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "标识是否当前使用中的设置，是或否");

    /**
     * The column <code>cloud_disk.common_design.url</code>. 客户端访问路径，网校域名
     */
    public final TableField<CommonDesignRecord, String> URL = createField(DSL.name("url"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "客户端访问路径，网校域名");

    /**
     * The column <code>cloud_disk.common_design.file_url</code>. 文件存放路径
     */
    public final TableField<CommonDesignRecord, String> FILE_URL = createField(DSL.name("file_url"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "文件存放路径");

    /**
     * The column <code>cloud_disk.common_design.fk_common_design_id</code>. 编辑器id，用于二级页面
     */
    public final TableField<CommonDesignRecord, Long> FK_COMMON_DESIGN_ID = createField(DSL.name("fk_common_design_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "编辑器id，用于二级页面");

    /**
     * The column <code>cloud_disk.common_design.foot</code>. 底部
     */
    public final TableField<CommonDesignRecord, String> FOOT = createField(DSL.name("foot"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "底部");

    /**
     * The column <code>cloud_disk.common_design.head</code>. 头部
     */
    public final TableField<CommonDesignRecord, String> HEAD = createField(DSL.name("head"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "头部");

    /**
     * The column <code>cloud_disk.common_design.setting</code>. 样式设置
     */
    public final TableField<CommonDesignRecord, String> SETTING = createField(DSL.name("setting"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "样式设置");

    /**
     * The column <code>cloud_disk.common_design.applet</code>. 小程序的配置信息
     */
    public final TableField<CommonDesignRecord, String> APPLET = createField(DSL.name("applet"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "小程序的配置信息");

    /**
     * The column <code>cloud_disk.common_design.source_design_id</code>. 来源装扮id
     */
    public final TableField<CommonDesignRecord, Long> SOURCE_DESIGN_ID = createField(DSL.name("source_design_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "来源装扮id");

    /**
     * The column <code>cloud_disk.common_design.approval_state</code>. 审核状态，0待审核，1通过，2不通过
     */
    public final TableField<CommonDesignRecord, String> APPROVAL_STATE = createField(DSL.name("approval_state"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.CHAR)), this, "审核状态，0待审核，1通过，2不通过");

    /**
     * The column <code>cloud_disk.common_design.approval_detail</code>. 审核备注
     */
    public final TableField<CommonDesignRecord, String> APPROVAL_DETAIL = createField(DSL.name("approval_detail"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "审核备注");

    /**
     * The column <code>cloud_disk.common_design.gmt_approval</code>. 审核时间
     */
    public final TableField<CommonDesignRecord, LocalDateTime> GMT_APPROVAL = createField(DSL.name("gmt_approval"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "审核时间");

    /**
     * The column <code>cloud_disk.common_design.sort</code>. 排序字段
     */
    public final TableField<CommonDesignRecord, Integer> SORT = createField(DSL.name("sort"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序字段");

    /**
     * The column <code>cloud_disk.common_design.state</code>. 状态
     */
    public final TableField<CommonDesignRecord, String> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.CHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.CHAR)), this, "状态");

    /**
     * The column <code>cloud_disk.common_design.is_paste</code>. 是否复制
     */
    public final TableField<CommonDesignRecord, Integer> IS_PASTE = createField(DSL.name("is_paste"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否复制");

    /**
     * The column <code>cloud_disk.common_design.seo</code>. seo. keyword, description的json
     */
    public final TableField<CommonDesignRecord, String> SEO = createField(DSL.name("seo"), org.jooq.impl.SQLDataType.VARCHAR(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "seo. keyword, description的json");

    /**
     * The column <code>cloud_disk.common_design.mb_design_id</code>. 关联h5编辑器ID
     */
    public final TableField<CommonDesignRecord, Long> MB_DESIGN_ID = createField(DSL.name("mb_design_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "关联h5编辑器ID");

    /**
     * The column <code>cloud_disk.common_design.design_classify_id</code>. 装扮分类id
     */
    public final TableField<CommonDesignRecord, Integer> DESIGN_CLASSIFY_ID = createField(DSL.name("design_classify_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "装扮分类id");

    /**
     * The column <code>cloud_disk.common_design.path_pre</code>. 路径前缀
     */
    public final TableField<CommonDesignRecord, String> PATH_PRE = createField(DSL.name("path_pre"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "路径前缀");

    /**
     * The column <code>cloud_disk.common_design.tenant_id</code>. 租户id
     */
    public final TableField<CommonDesignRecord, Long> TENANT_ID = createField(DSL.name("tenant_id"), org.jooq.impl.SQLDataType.BIGINT, this, "租户id");

    /**
     * Create a <code>cloud_disk.common_design</code> table reference
     */
    public CommonDesign() {
        this(DSL.name("common_design"), null);
    }

    /**
     * Create an aliased <code>cloud_disk.common_design</code> table reference
     */
    public CommonDesign(String alias) {
        this(DSL.name(alias), COMMON_DESIGN);
    }

    /**
     * Create an aliased <code>cloud_disk.common_design</code> table reference
     */
    public CommonDesign(Name alias) {
        this(alias, COMMON_DESIGN);
    }

    private CommonDesign(Name alias, Table<CommonDesignRecord> aliased) {
        this(alias, aliased, null);
    }

    private CommonDesign(Name alias, Table<CommonDesignRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("页面编辑器表"));
    }

    public <O extends Record> CommonDesign(Table<O> child, ForeignKey<O, CommonDesignRecord> key) {
        super(child, key, COMMON_DESIGN);
    }

    @Override
    public Schema getSchema() {
        return CloudDisk.CLOUD_DISK;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMMON_DESIGN_PRIMARY);
    }

    @Override
    public Identity<CommonDesignRecord, Long> getIdentity() {
        return Keys.IDENTITY_COMMON_DESIGN;
    }

    @Override
    public UniqueKey<CommonDesignRecord> getPrimaryKey() {
        return Keys.KEY_COMMON_DESIGN_PRIMARY;
    }

    @Override
    public List<UniqueKey<CommonDesignRecord>> getKeys() {
        return Arrays.<UniqueKey<CommonDesignRecord>>asList(Keys.KEY_COMMON_DESIGN_PRIMARY);
    }

    @Override
    public CommonDesign as(String alias) {
        return new CommonDesign(DSL.name(alias), this);
    }

    @Override
    public CommonDesign as(Name alias) {
        return new CommonDesign(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CommonDesign rename(String name) {
        return new CommonDesign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CommonDesign rename(Name name) {
        return new CommonDesign(name, null);
    }
}
