package org.chengshuo.Web_App_01.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {

    private SqlSessionFactory sqlSessionFactory;
    private SqlSessionFactoryUtil() {
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(SqlSessionFactoryUtil.class.getClassLoader().getResourceAsStream("MybatisConfig.xml"));
    }
    private static SqlSessionFactoryUtil sqlSessionFactoryUtil;
    public static SqlSessionFactoryUtil getSqlSessionFactoryUtil(){
        if (sqlSessionFactoryUtil==null){
            sqlSessionFactoryUtil=new SqlSessionFactoryUtil();
        }
        return  sqlSessionFactoryUtil;
    }
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
