package com.bobo.rpc.common.utils;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class ReflectionsUtils {

    public static <T> T newInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalStateException();
        }

    }


    /**
     * 获取某个类的共有方法
     * @param clazz
     * @return
     */
    public static Method[] getPublicMethods(Class clazz) {
        Method [] methods = clazz.getDeclaredMethods();

        List<Method> methodList = new ArrayList<>();
        for (Method m : methods) {
            if (Modifier.isPublic(m.getModifiers())) {
                methodList.add(m);
            }
        }
        // List<Method> methodList = Arrays.stream(clazz.getDeclaredMethods()).filter(x -> Modifier.isPublic(x.getModifiers())).collect(Collectors.toList());
        return methodList.toArray(new Method[0]);

    }


    /**
     *
     * @param obj 被调用方法的对象
     * @param method 被调用的方法
     * @param args 方法的参数
     * @return 返回的结果
     */
    public static Object invoke(Object obj, Method method, Object... args) {
        try {
            // 如果需要调用静态方法,则obj传一个Null
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw new IllegalStateException();
        }



    }
}
