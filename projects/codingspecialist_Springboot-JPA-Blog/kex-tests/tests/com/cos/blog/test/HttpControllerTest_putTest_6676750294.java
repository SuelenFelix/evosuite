package com.cos.blog.test;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.cos.blog.test.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpControllerTest_putTest_6676750294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term141;

    public HttpControllerTest_putTest_6676750294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("com.cos.blog.test.HttpControllerTest"));
        term141 = newInstance(Class.forName("com.cos.blog.test.Member"));
        setIntField(term141, term141.getClass(), "id", 1484323161);
        setField(term141, term141.getClass(), "username", "SzjVpOQTyS");
        setField(term141, term141.getClass(), "password", "MjGYSRKTNF");
        setField(term141, term141.getClass(), "email", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.HttpControllerTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.test.Member");
        Object[] args = new Object[1];
        args[0] = term141;
        callMethod(klass, "putTest", argTypes, term140, args);
    }

};


