package com.bobo.rpc.common.utils;

import com.sun.xml.internal.ws.api.model.MEP;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class ReflectionsUtilsTest {

    @Test
    public void newInstance() {
        TestClass t = ReflectionsUtils.newInstance(TestClass.class);
        assertNotNull(t);

    }

    @Test
    public void getPublicMethods() {
        Method[] publicMethods = ReflectionsUtils.getPublicMethods(TestClass.class);

        assertEquals(2, publicMethods.length);

        // String name = publicMethods[0].getName();
        Arrays.stream(publicMethods).forEach(System.out::println);
        // assertEquals("b",name);
    }

    @Test
    public void invoke() {
        Method[] methods = ReflectionsUtils.getPublicMethods(TestClass.class);
        Method b = methods[0];
        TestClass t = new TestClass();
        Object result = ReflectionsUtils.invoke(t, b);
        assertEquals("b", result);
    }
}
