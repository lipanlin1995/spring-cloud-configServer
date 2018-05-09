/**
 * 
 *	百联全渠道
 * Copyright (c) 2015-2018 BaiLian Technology co., LTD. All rights reserved.
 */
package com.bailian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * demo
 * @author lipanlin
 * @version 1.0:2018年5月4日 上午11:13:57
 */
@RestController
public class MyController {
    private Logger logger = LoggerFactory.getLogger(MyController.class);
    
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    
    @RequestMapping("/sendMsg")
    public String sendMsg(@RequestBody String msg){
        kafkaTemplate.send("test", msg).addCallback(new ListenableFutureCallback<Object>() {
            @Override
            public void onSuccess(Object result) {
                logger.info("发送消息成功!");
            }
            @Override
            public void onFailure(Throwable e) {
                logger.info("发送消息失败!");
            }
        });
        return "发送成功!";
    }
}
