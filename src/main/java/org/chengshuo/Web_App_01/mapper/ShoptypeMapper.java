package org.chengshuo.Web_App_01.mapper;

import org.apache.ibatis.annotations.Param;
import org.chengshuo.Web_App_01.pojo.Shoptype;
import org.chengshuo.Web_App_01.pojo.ShoptypeExample;

import java.util.List;

public interface ShoptypeMapper {
    int countByExample(ShoptypeExample example);

    int deleteByExample(ShoptypeExample example);

    int deleteByPrimaryKey(Integer stid);

    int insert(Shoptype record);

    int insertSelective(Shoptype record);

    List<Shoptype> selectByExample(ShoptypeExample example);

    Shoptype selectByPrimaryKey(Integer stid);

    int updateByExampleSelective(@Param("record") Shoptype record, @Param("example") ShoptypeExample example);

    int updateByExample(@Param("record") Shoptype record, @Param("example") ShoptypeExample example);

    int updateByPrimaryKeySelective(Shoptype record);

    int updateByPrimaryKey(Shoptype record);
}