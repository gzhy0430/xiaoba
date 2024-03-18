package com.xiaoba.fb.job;

import com.xiaoba.fb.job.dao.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@EnableScheduling
@Component
@Slf4j
public class TestJob {


    @Autowired
    TestMapper testMapper;
    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        log.info(">>>>>>>>>" + testMapper.test());
    }
}
