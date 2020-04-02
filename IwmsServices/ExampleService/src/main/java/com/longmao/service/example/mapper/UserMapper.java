package com.longmao.service.example.mapper;

import com.longmao.serviceApi.example.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    public User getUserByName(String username);

    @Select("select * from user")
    public List<User> findAll();

    @Delete("delete from department where id=#{id}")
    public int deleteUserById(Integer id);

    @Select("select * from user where id=#{id}")
    @Results({
            @Result(property = "department", column = "deptId", one = @One(select = "com.longmao.service.example.mapper.DepartmentMapper.getDeptById"))
    })
    public User findByIdWithDept(Integer id);
    @Select("select * from user where id=#{id}")
    public User findById(Integer id);


    @Select("select * from user where username=#{username}")
    public List<User> findByName(String username);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user(username,deptId) values(#{username},#{deptId})" )
    public int insertUser(User user);

    @Update("update user set username=#{username} where id=#{id}")
    public int updateUser(User user);
}
