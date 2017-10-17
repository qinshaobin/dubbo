package com.bin.dubbox.api.common;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.bin.dubbox.api.request.AccBalanceQueryRequest;
import com.bin.dubbox.api.request.UserQueryRequest;
import com.bin.dubbox.api.response.AccBalanceQueryResponse;
import com.bin.dubbox.api.response.UserQueryResponse;
import com.bin.dubbox.api.entity.User;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @Author shaobin.qin
 * @Date 2017/3/28
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    @Override
    public Collection<Class> getSerializableClasses() {
        //要让Kryo和FST完全发挥出高性能，最好将那些需要被序列化的类注册到dubbo系统中
        //然后在XML配置中添加：<dubbo:protocol name="dubbo" serialization="kryo" optimizer="com.bin.dubbox.api.common.SerializationOptimizerImpl"/>
        List<Class> serializableClasses = Lists.newArrayList();
        serializableClasses.add(AccBalanceQueryRequest.class);
        serializableClasses.add(AccBalanceQueryResponse.class);
        serializableClasses.add(User.class);
        serializableClasses.add(UserQueryRequest.class);
        serializableClasses.add(UserQueryResponse.class);

        return serializableClasses;
    }
}
