package com.shadow.consumer.provider;

import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;
import com.shadow.consumer.service.AnnouncementFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/happiness/announcement")
@Api(tags = {"幸福里-幸福公告"}, description = "幸福公告相关api")
public class AnnouncementController {

    @Autowired
    private AnnouncementFeignService announcementService;

    @ApiOperation(value = "公告管理新增或保存", notes = "公告管理新增或保存", response = Boolean.class)
    @PostMapping("/saveOrUpdate")
    public Boolean saveOrUpdate(@RequestBody AnnouncementUpdateF updateF) {
        return announcementService.saveOrUpdate(updateF);
    }
}
