package com.wkk.server.service.dao;

import com.wkk.server.service.domain.StudentsDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentsDO record);

    int insertSelective(StudentsDO record);

    StudentsDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsDO record);

    int updateByPrimaryKey(StudentsDO record);

    @Select("select * from students")
    List<StudentsDO> selectStudentSelective(StudentsDO students);
}