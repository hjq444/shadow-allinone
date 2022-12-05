package com.shadow.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shadow.provider.model.data.Announcement;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnnouncementMapper extends BaseMapper<Announcement>  {

}
