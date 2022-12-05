package com.shadow.provider.service;

import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;

public interface IAnnouncementService {

    Boolean saveOrUpdate(AnnouncementUpdateF form);
}
