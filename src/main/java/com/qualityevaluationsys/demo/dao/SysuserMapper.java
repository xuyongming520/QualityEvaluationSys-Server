package com.qualityevaluationsys.demo.dao;

import com.qualityevaluationsys.demo.domain.Sysuser;
import com.qualityevaluationsys.demo.domain.SysuserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysuserMapper {
    int countByExample(SysuserExample example);

    int deleteByExample(SysuserExample example);

    int deleteByPrimaryKey(Integer uno);

    int insert(Sysuser record);

    int insertSelective(Sysuser record);

    List<Sysuser> selectByExample(SysuserExample example);

    Sysuser selectByPrimaryKey(Integer uno);

    int updateByExampleSelective(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByExample(@Param("record") Sysuser record, @Param("example") SysuserExample example);

    int updateByPrimaryKeySelective(Sysuser record);

    int updateByPrimaryKey(Sysuser record);
}