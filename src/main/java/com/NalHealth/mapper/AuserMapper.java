package com.NalHealth.mapper;

import com.NalHealth.entity.Auser;
import java.util.List;

public interface AuserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Auser record);

    Auser selectByPrimaryKey(Integer uid);

    List<Auser> selectAll();

    int updateByPrimaryKey(Auser record);
}