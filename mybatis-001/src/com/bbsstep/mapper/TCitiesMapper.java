package com.bbsstep.mapper;

import com.bbsstep.po.TCities;
import com.bbsstep.po.TCitiesExample;
import java.util.List;

public interface TCitiesMapper {
    int countByExample(TCitiesExample example);

    int deleteByExample(TCitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCities record);

    int insertSelective(TCities record);

    List<TCities> selectByExample(TCitiesExample example);

    TCities selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(TCities record);

    int updateByPrimaryKey(TCities record);
}