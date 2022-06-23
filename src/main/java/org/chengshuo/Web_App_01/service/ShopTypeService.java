package org.chengshuo.Web_App_01.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.chengshuo.Web_App_01.mapper.ShoptypeMapper;
import org.chengshuo.Web_App_01.pojo.Shoptype;
import org.chengshuo.Web_App_01.util.SqlSessionFactoryUtil;

import java.util.List;

public class ShopTypeService {
    public List<Shoptype> showAll(){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        ShoptypeMapper mapper = session.getMapper(ShoptypeMapper.class);
        List<Shoptype> list = mapper.selectByExample(null);
        session.close();
        return list;
    }


}
