package com.bencaojc.mapper;

import com.bencaojc.pojo.FeiyuClue;
import com.bencaojc.pojo.FeiyuClueExample;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface FeiyuClueMapper {

    int insert(FeiyuClue record);


    @Select("SELECT COUNT(1) FROM feiyu_clue WHERE clue_id =#{clueId}")
    int selectCountByClueId(String clueId);
}