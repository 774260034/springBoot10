package cn.dao;

import cn.domain.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface NewsDao {
    @Select("select * from news")
    @Results({
            @Result(property = "id",column = "id",javaType = int.class),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content")
    })
    List<News> findAll();
    News findById(int id);
    @Insert("insert into news(cate_id,title,content) values (#{cateId},#{title},#{content})")
    int add(News news);
   @Update("")
    int update(News news);
    int delById(int id);
}
