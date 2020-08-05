package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.PresonMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Preson;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class PresonService {
	@Autowired
	PresonMapper presonMapper;

	public PageInfo<Preson> findList(Preson preson, Integer pageNum, Integer pageSize, String ordername, String order) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Preson> list=presonMapper.findList(preson);
		return new PageInfo<>(list);
	}

	public void deletePreson(Integer id) {
		// TODO Auto-generated method stub
		presonMapper.deleteByPrimaryKey(id);
	}


}
