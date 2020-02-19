package com.zhang.rpc.server;

import com.bobo.rpc.ServiceDescriptor;
import com.bobo.rpc.common.utils.ReflectionsUtils;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class ServiceManager {

    private Map<ServiceDescriptor, ServiceInstance> services;

    public ServiceManager() {
        this.services = new ConcurrentHashMap<>();
    }


    public <T> void register(Class interfaceClass,  T bean) {
        Method[] methods = ReflectionsUtils.getPublicMethods(interfaceClass);
        for (Method method: methods) {
            ServiceInstance sis = new ServiceInstance(bean, method);
        }

    }
}
