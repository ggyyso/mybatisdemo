package com.example.mapper;

import com.example.model.TestStudent;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Jason Wong
 * @title: UserMapper
 * @projectName mybatisdemo
 * @description: TODO
 * @date 2020/8/5 9:15
 */
public interface UserMapper {
    @Select("select * from TestStudent")
    List<TestStudent> getAllUsers();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "u"),
            @Result(property = "address", column = "a")
    })
    @Select("select username as u,address as a,id as id from TestStudent where id=#{id}")
    TestStudent getUserById(Long id);

    @Select("select * from TestStudent where username like concat('%',#{name},'%')")
    List<TestStudent> getUsersByName(String name);

    @Insert({"insert into TestStudent(username,address) values(#{username},#{address})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Integer.class)
    Integer addUser(TestStudent TestStudent);

    @Update("update TestStudent set username=#{username},address=#{address} where id=#{id}")
    Integer updateUserById(TestStudent TestStudent);

    @Delete("delete from TestStudent where id=#{id}")
    Integer deleteUserById(Integer id);
}
