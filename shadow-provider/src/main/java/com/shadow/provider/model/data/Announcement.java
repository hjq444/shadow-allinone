package com.shadow.provider.model.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("sc_happiness_announcement")
public class Announcement extends Model<Announcement> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属分公司id
     */
    @TableField("region_id")
    private String regionId;

    /**
     * 所属园区id
     */
    @TableField("community_id")
    private String communityId;

    /**
     * 公告标题
     */
    @TableField("announcement_title")
    private String announcementTitle;

    /**
     * 公告内容
     */
    @TableField("announcement_content")
    private String announcementContent;

    /**
     * 公告封面图片
     */
    @TableField("cover_url")
    private String coverUrl;

    /**
     * 公告状态：0下架 1上架
     */
    @TableField("announcement_status")
    private Integer announcementStatus;

    /**
     * 是否置顶：0-否 1-是
     */
    @TableField("is_top")
    private Integer isTop;

    /**
     * 发布人
     */
    @TableField("release_user")
    private String releaseUser;

    /**
     * 发布时间
     */
    @TableField("release_time")
    private Date releaseTime;

    /**
     * 发布人所属组织
     */
    @TableField("release_org")
    private String releaseOrg;

    /**
     * 是否全体 0-否 1-是
     */
    @TableField("over_all")
    private Integer overAll;

    /**
     * 录入用户
     */
    @TableField("inuser")
    private String inuser;

    /**
     * 录入时间
     */
    @TableField("intime")
    private Date intime;

    /**
     * 更新人
     */
    @TableField("update_user")
    private String updateUser;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 是否删除 0-未删除，1-已删除
     */
    @TableField("is_deleted")
    private Integer isDeleted;

    /**
     * 所属批次
     */
    @TableField("batch_num")
    private String batchNum;

    /**
     * 副标题
     */
    @TableField("subtitle")
    private String subtitle;

    /**
     * 浏览量
     */
    @TableField("browse_count")
    private Integer browseCount;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
