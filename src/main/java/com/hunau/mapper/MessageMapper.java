package com.hunau.mapper;

import com.hunau.entity.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MI on 2019/3/4.
 */
@Repository
public interface MessageMapper {
    @Select("SELECT * FROM stu_message")
    public List<Message> select();

    @Insert("INSERT INTO stu_message(name, time, text) VALUES( #{name}, #{time}, #{ text} )")
    public int insert(String name, String time, String text);
}
