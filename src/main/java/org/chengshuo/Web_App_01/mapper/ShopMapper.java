package org.chengshuo.Web_App_01.mapper;

import org.apache.ibatis.annotations.Param;
import org.chengshuo.Web_App_01.pojo.Shop;
import org.chengshuo.Web_App_01.pojo.ShopExample;

import java.util.List;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);



    List<Shop> selectAll(Shop shop);
}