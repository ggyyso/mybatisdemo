package com.example.mapper;

import com.example.model.TestStudent;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestStudent record);

    int insertSelective(TestStudent record);

    TestStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestStudent record);

    int updateByPrimaryKey(TestStudent record);

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from test_student")
    List<TestStudent> selectAll();
}