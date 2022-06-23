package org.chengshuo.Web_App_01.mapper;

import org.apache.ibatis.annotations.Param;
import org.chengshuo.Web_App_01.pojo.Shopcar;
import org.chengshuo.Web_App_01.pojo.ShopcarExample;

import java.util.List;

public interface ShopcarMapper {
    int countByExample(ShopcarExample example);

    int deleteByExample(ShopcarExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    List<Shopcar> selectByExample(ShopcarExample example);

    Shopcar selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    int updateByExample(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);
}