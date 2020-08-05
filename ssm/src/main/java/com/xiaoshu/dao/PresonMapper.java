package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Preson;
import com.xiaoshu.entity.PresonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PresonMapper extends BaseMapper<Preson> {

	List<Preson> findList(Preson preson);
    
}