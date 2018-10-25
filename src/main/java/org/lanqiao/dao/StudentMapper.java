package org.lanqiao.dao;

import org.lanqiao.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询:根据cid获取学生信息
    public List<Student> findStuByCid();
}
