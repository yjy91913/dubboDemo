package com.ziroom.service.impl;

import com.ziroom.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by yjy on 2017/11/15.
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String hello(String name) {

        String s = null;
        return name;
    }
}
