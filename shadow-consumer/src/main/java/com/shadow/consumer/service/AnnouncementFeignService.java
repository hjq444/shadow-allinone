package com.shadow.consumer.service;

import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient
public interface AnnouncementFeignService {

    @PostMapping("/announcement/announcementList")
    Boolean saveOrUpdate(AnnouncementUpdateF updateF);
}
