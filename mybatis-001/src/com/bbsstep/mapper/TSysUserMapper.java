package com.bbsstep.mapper;

import com.bbsstep.po.TSysUser;
import com.bbsstep.po.TSysUserExample;
import java.util.List;


public interface TSysUserMapper {
    int countByExample(TSysUserExample example);

    int deleteByExample(TSysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    List<TSysUser> selectByExample(TSysUserExample example);

    TSysUser selectByPrimaryKey(Long id);

 
    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
}