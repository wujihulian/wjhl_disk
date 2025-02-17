/*
 * This file is generated by jOOQ.
 */
package com.svnlan.jooq;


import com.svnlan.jooq.tables.Comment;
import com.svnlan.jooq.tables.CommentMeta;
import com.svnlan.jooq.tables.CommentPraise;
import com.svnlan.jooq.tables.CommonConvert;
import com.svnlan.jooq.tables.CommonDesign;
import com.svnlan.jooq.tables.CommonDesignClassify;
import com.svnlan.jooq.tables.CommonInfo;
import com.svnlan.jooq.tables.CommonInfoType;
import com.svnlan.jooq.tables.CommonLabel;
import com.svnlan.jooq.tables.CommonSchedule;
import com.svnlan.jooq.tables.Databasechangelog;
import com.svnlan.jooq.tables.Databasechangeloglock;
import com.svnlan.jooq.tables.GroupMeta;
import com.svnlan.jooq.tables.GroupSource;
import com.svnlan.jooq.tables.Groups;
import com.svnlan.jooq.tables.IoFile;
import com.svnlan.jooq.tables.IoFileContents;
import com.svnlan.jooq.tables.IoFileMeta;
import com.svnlan.jooq.tables.IoSource;
import com.svnlan.jooq.tables.IoSourceAuth;
import com.svnlan.jooq.tables.IoSourceEvent;
import com.svnlan.jooq.tables.IoSourceHistory;
import com.svnlan.jooq.tables.IoSourceMeta;
import com.svnlan.jooq.tables.IoSourceRecycle;
import com.svnlan.jooq.tables.LogSchedule;
import com.svnlan.jooq.tables.Notice;
import com.svnlan.jooq.tables.NoticeDetail;
import com.svnlan.jooq.tables.NoticeUser;
import com.svnlan.jooq.tables.Role;
import com.svnlan.jooq.tables.Share;
import com.svnlan.jooq.tables.ShareReport;
import com.svnlan.jooq.tables.ShareTo;
import com.svnlan.jooq.tables.SystemLog;
import com.svnlan.jooq.tables.SystemOption;
import com.svnlan.jooq.tables.SystemSession;
import com.svnlan.jooq.tables.TTenant;
import com.svnlan.jooq.tables.UserCommonInfo;
import com.svnlan.jooq.tables.UserFav;
import com.svnlan.jooq.tables.UserGroup;
import com.svnlan.jooq.tables.UserMeta;
import com.svnlan.jooq.tables.UserOption;
import com.svnlan.jooq.tables.Users;
import com.svnlan.jooq.tables.VisitCountRecord;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in cloud_disk
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 通用评论表
     */
    public static final Comment COMMENT = Comment.COMMENT;

    /**
     * 评论表扩展字段
     */
    public static final CommentMeta COMMENT_META = CommentMeta.COMMENT_META;

    /**
     * 评论点赞表
     */
    public static final CommentPraise COMMENT_PRAISE = CommentPraise.COMMENT_PRAISE;

    /**
     * 转码表
     */
    public static final CommonConvert COMMON_CONVERT = CommonConvert.COMMON_CONVERT;

    /**
     * 页面编辑器表
     */
    public static final CommonDesign COMMON_DESIGN = CommonDesign.COMMON_DESIGN;

    /**
     * 装扮目录分类表
     */
    public static final CommonDesignClassify COMMON_DESIGN_CLASSIFY = CommonDesignClassify.COMMON_DESIGN_CLASSIFY;

    /**
     * 资讯表
     */
    public static final CommonInfo COMMON_INFO = CommonInfo.COMMON_INFO;

    /**
     * 资讯类型表
     */
    public static final CommonInfoType COMMON_INFO_TYPE = CommonInfoType.COMMON_INFO_TYPE;

    /**
     * 标签表
     */
    public static final CommonLabel COMMON_LABEL = CommonLabel.COMMON_LABEL;

    /**
     * 定时任务表
     */
    public static final CommonSchedule COMMON_SCHEDULE = CommonSchedule.COMMON_SCHEDULE;

    /**
     * The table <code>cloud_disk.databasechangelog</code>.
     */
    public static final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>cloud_disk.databasechangeloglock</code>.
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * 用户数据扩展表
     */
    public static final GroupMeta GROUP_META = GroupMeta.GROUP_META;

    /**
     * 群组、文件关系表
     */
    public static final GroupSource GROUP_SOURCE = GroupSource.GROUP_SOURCE;

    /**
     * 群组表
     */
    public static final Groups GROUPS = Groups.GROUPS;

    /**
     * 文档存储表
     */
    public static final IoFile IO_FILE = IoFile.IO_FILE;

    /**
     * 文件id
     */
    public static final IoFileContents IO_FILE_CONTENTS = IoFileContents.IO_FILE_CONTENTS;

    /**
     * 文件扩展表
     */
    public static final IoFileMeta IO_FILE_META = IoFileMeta.IO_FILE_META;

    /**
     * 文档数据表
     */
    public static final IoSource IO_SOURCE = IoSource.IO_SOURCE;

    /**
     * 文档权限表
     */
    public static final IoSourceAuth IO_SOURCE_AUTH = IoSourceAuth.IO_SOURCE_AUTH;

    /**
     * 文档事件表
     */
    public static final IoSourceEvent IO_SOURCE_EVENT = IoSourceEvent.IO_SOURCE_EVENT;

    /**
     * 文档历史记录表
     */
    public static final IoSourceHistory IO_SOURCE_HISTORY = IoSourceHistory.IO_SOURCE_HISTORY;

    /**
     * 文档扩展表
     */
    public static final IoSourceMeta IO_SOURCE_META = IoSourceMeta.IO_SOURCE_META;

    /**
     * 文档回收站
     */
    public static final IoSourceRecycle IO_SOURCE_RECYCLE = IoSourceRecycle.IO_SOURCE_RECYCLE;

    /**
     * 任务执行记录表
     */
    public static final LogSchedule LOG_SCHEDULE = LogSchedule.LOG_SCHEDULE;

    /**
     * 通知表
     */
    public static final Notice NOTICE = Notice.NOTICE;

    /**
     * 通知详情表
     */
    public static final NoticeDetail NOTICE_DETAIL = NoticeDetail.NOTICE_DETAIL;

    /**
     * 通知用户关联表
     */
    public static final NoticeUser NOTICE_USER = NoticeUser.NOTICE_USER;

    /**
     * 角色表
     */
    public static final Role ROLE = Role.ROLE;

    /**
     * 分享数据表
     */
    public static final Share SHARE = Share.SHARE;

    /**
     * 分享举报表
     */
    public static final ShareReport SHARE_REPORT = ShareReport.SHARE_REPORT;

    /**
     * 分享给指定用户(协作)
     */
    public static final ShareTo SHARE_TO = ShareTo.SHARE_TO;

    /**
     * 系统日志表
     */
    public static final SystemLog SYSTEM_LOG = SystemLog.SYSTEM_LOG;

    /**
     * 系统配置表
     */
    public static final SystemOption SYSTEM_OPTION = SystemOption.SYSTEM_OPTION;

    /**
     * session
     */
    public static final SystemSession SYSTEM_SESSION = SystemSession.SYSTEM_SESSION;

    /**
     * 租户表
     */
    public static final TTenant T_TENANT = TTenant.T_TENANT;

    /**
     * 用户资讯表
     */
    public static final UserCommonInfo USER_COMMON_INFO = UserCommonInfo.USER_COMMON_INFO;

    /**
     * 用户文档标签表
     */
    public static final UserFav USER_FAV = UserFav.USER_FAV;

    /**
     * 用户群组关联表(一对多)
     */
    public static final UserGroup USER_GROUP = UserGroup.USER_GROUP;

    /**
     * 用户数据扩展表
     */
    public static final UserMeta USER_META = UserMeta.USER_META;

    /**
     * 用户数据配置表
     */
    public static final UserOption USER_OPTION = UserOption.USER_OPTION;

    /**
     * 用户表
     */
    public static final Users USERS = Users.USERS;

    /**
     * 访问次数记录表
     */
    public static final VisitCountRecord VISIT_COUNT_RECORD = VisitCountRecord.VISIT_COUNT_RECORD;
}
