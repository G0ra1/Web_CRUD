package org.chengshuo.Web_App_01.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.chengshuo.Web_App_01.mapper.ShopMapper;
import org.chengshuo.Web_App_01.pojo.Shop;
import org.chengshuo.Web_App_01.util.SqlSessionFactoryUtil;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService {




    public Map selectAll(int page,int pagesize){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
//        分页开始
        PageHelper.startPage(page,pagesize);
        List<Shop> shops = mapper.selectAll(new Shop());

//        分页信息
        PageInfo<Shop> pageInfo = new PageInfo<Shop>(shops);
        long total = pageInfo.getTotal();   //总条数
        session.close();



        /*
        * 返回多条数据用map封装
        *
        * */
        Map map = new HashMap();
        map.put("data",shops);
        map.put("pagesize",pagesize);
        map.put("page",page);
        map.put("total",total);


        return map;
    }





//    添加
    public  int insert(Shop shop){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
        int i = mapper.insertSelective(shop);
        session.close();
        return i;
    }
//     通过主键查询商品
    public Shop selectByid(int sid){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
        Shop shop = mapper.selectByPrimaryKey(sid);
        session.close();
        return shop;
    }
//    修改
    public int update(Shop shop){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
        int i = mapper.updateByPrimaryKeySelective(shop);
        session.close();
        return i;
    }
//    删除
    public int delete(int sid){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
        int key = mapper.deleteByPrimaryKey(sid);
        session.close();
        return key;
    }

    //更改后统计总数，页码书
    public int count(){
        SqlSession session = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory().openSession(true);
        ShopMapper mapper = session.getMapper(ShopMapper.class);
        int i = mapper.countByExample(null);
        session.close();
        return i;
    }



}
