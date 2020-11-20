//package com.raohui.springbootrabbitmq.rabbit;
//
//import org.springframework.amqp.core.AcknowledgeMode;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MessageListenerConfig {
//
//    @Autowired
//    private CachingConnectionFactory cachingConnectionFactory;
//
//    @Autowired
//    private MyAckReceiver myAckReceiver;
//
//    @Bean
//    public SimpleMessageListenerContainer simpleMessageListenerContainer(){
//        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(cachingConnectionFactory);
//        //当前消费者数量
//        container.setConcurrentConsumers(1);
//        //最大消费者数量
//        container.setMaxConcurrentConsumers(1);
//        // 开启手动确认模式
//        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
//        // 监听队列名称
//        container.setQueueNames("");
//        // 消息监听
//        container.setMessageListener(myAckReceiver);
//        return container;
//    }
//}
