package org.lanqaio.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.lanqiao.dao.ClasMapper;
import org.lanqiao.pojo.Clas;
import org.lanqiao.utils.mybatisUtils;

public class Test {
    SqlSession sqlSession;
    ClasMapper clasMapper;
    @Before
    public void init(){
        sqlSession = mybatisUtils.getSqlSession("mybatis-config.xml");
        clasMapper = sqlSession.getMapper(ClasMapper.class);
    }

    @org.junit.Test
    //多表链接查询
    public  void findClsByCidTest(){
        Clas clas =clasMapper.findCidByCid(1);
        System.out.println(clas);
    }

}
