package com.shadow.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shadow.api.utils.bean.BeanCastUtil;
import com.shadow.provider.dao.AnnouncementMapper;
import com.shadow.provider.model.data.Announcement;
import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;
import com.shadow.provider.service.IAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement> implements IAnnouncementService {

    @Autowired
    private AnnouncementMapper announcementMapper;

    @Override
    public Boolean saveOrUpdate(AnnouncementUpdateF form) {
        Announcement announcement = BeanCastUtil.castBean(form, Announcement.class);
        announcementMapper.insert(announcement);
        return true;
    }
}
