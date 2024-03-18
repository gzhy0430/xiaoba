package com.xiaoba.fb.job.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface TestMapper {

    Map test();

}
