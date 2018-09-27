package com.bbsstep.mapper;

import com.bbsstep.po.TUser;
import com.bbsstep.po.TUserExample;
import java.util.List;


public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExampleWithBLOBs(TUserExample example);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Long id);

   
    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKeyWithBLOBs(TUser record);

    int updateByPrimaryKey(TUser record);
}