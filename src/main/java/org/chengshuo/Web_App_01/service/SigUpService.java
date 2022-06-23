package org.chengshuo.Web_App_01.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.chengshuo.Web_App_01.mapper.UserMapper;
import org.chengshuo.Web_App_01.pojo.User;
import org.chengshuo.Web_App_01.pojo.UserExample;
import org.chengshuo.Web_App_01.util.SqlSessionFactoryUtil;

import java.util.List;

public class SigUpService {
    public User SigUp(User user){
        SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactoryUtil().getSqlSessionFactory();
        SqlSession session = factory.openSession(true);
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();


        /*
        * 用户名
        *
        * */
        if(user.getUsname() != null) {
            criteria.andUsnameEqualTo(user.getUsname());
            criteria.andUspassEqualTo(user.getUspass());
        }
        /*
        *
        * 邮箱
        *
        * */
        if(user.getUsemail() != null){
            criteria.andUsemailEqualTo(user.getUsemail());
            criteria.andUspassEqualTo(user.getUspass());
        }


        /*
        *
        * 手机
        *
        * */
        if(user.getUsphone() != null){
            criteria.andUsphoneEqualTo(user.getUsphone());
            criteria.andUspassEqualTo(user.getUspass());
        }

        List<User> users = mapper.selectByExample(example);



        /*
        *
        *返回
         */
        session.close();
        if(users.isEmpty()){
            return null;
        }else {
            return users.get(0);
        }
    }
}
