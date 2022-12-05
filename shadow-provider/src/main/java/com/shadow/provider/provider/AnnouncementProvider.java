package com.shadow.provider.provider;

import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;
import com.shadow.provider.service.IAnnouncementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"幸福里公告管理"}, description = "幸福里公告管理")
@RestController
@RequestMapping("/announcement")
public class AnnouncementProvider {

    @Autowired
    private IAnnouncementService announcementService;

    @ApiOperation(value = "分页列表接口", response = Boolean.class)
    @PostMapping("/saveOrUpdate")
    public ResponseEntity<Boolean> saveOrUpdate(@RequestBody AnnouncementUpdateF form) {
        return ResponseEntity.ok(announcementService.saveOrUpdate(form));
    }
}
