package com.svnlan.user.service;

import com.alibaba.fastjson.JSONObject;
import com.svnlan.user.dto.NoticeDTO;

import java.time.LocalDateTime;

/**
* @author lingxu
* @description 针对表【notice_detail】的数据库操作Service
* @createDate 2023-05-16 15:14:04
*/
public interface NoticeDetailService {

    boolean updateByNoticeId(NoticeDTO dto, Long noticeId, LocalDateTime now);

    Integer createNoticeDetail(NoticeDTO dto, Long noticeId, LocalDateTime now);

    JSONObject getByNoticeId(Long id);
}
