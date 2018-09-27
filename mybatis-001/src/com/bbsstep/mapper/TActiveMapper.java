package com.bbsstep.mapper;

import com.bbsstep.po.TActive;
import com.bbsstep.po.TActiveExample;
import java.util.List;

public interface TActiveMapper {
    int countByExample(TActiveExample example);

    int deleteByExample(TActiveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TActive record);

    int insertSelective(TActive record);

    List<TActive> selectByExampleWithBLOBs(TActiveExample example);

    List<TActive> selectByExample(TActiveExample example);

    TActive selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TActive record);

    int updateByPrimaryKeyWithBLOBs(TActive record);

    int updateByPrimaryKey(TActive record);
}