package com.yagu.dao;

import com.yagu.model.Postable;
import com.yagu.model.PostableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostableMapper {
    int countByExample(PostableExample example);

    int deleteByExample(PostableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Postable record);

    int insertSelective(Postable record);

    List<Postable> selectByExample(PostableExample example);

    Postable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Postable record, @Param("example") PostableExample example);

    int updateByExample(@Param("record") Postable record, @Param("example") PostableExample example);

    int updateByPrimaryKeySelective(Postable record);

    int updateByPrimaryKey(Postable record);
}