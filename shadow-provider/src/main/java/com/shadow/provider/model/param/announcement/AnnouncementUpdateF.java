package com.shadow.provider.model.param.announcement;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
public class AnnouncementUpdateF {
    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("公告标题")
    @NotBlank
    private String announcementTitle;

    @ApiModelProperty("公告内容")
    @NotBlank
    private String announcementContent;

    @ApiModelProperty("公告封面图片")
    @NotBlank
    private String coverUrl;

    @ApiModelProperty("发布对象ids")
    @NotBlank
    private List<String> releaseObjIds;

    @ApiModelProperty("是否置顶 0-否 1-是")
    private Byte isTop;

    @ApiModelProperty("所属批次")
    private String batchNum;

    @ApiModelProperty("副标题")
    private String subtitle;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("上架时间")
    private Date releaseTime;

    @ApiModelProperty("当前用户可管辖的权限范围")
    private List<String> communityIds;
}
