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

public class HttpControllerTest_getTest_5993516662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public HttpControllerTest_getTest_5993516662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.cos.blog.test.HttpControllerTest"));
        term3 = newInstance(Class.forName("com.cos.blog.test.Member"));
        setIntField(term3, term3.getClass(), "id", 568599855);
        setField(term3, term3.getClass(), "username", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "password", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "email", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.HttpControllerTest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.test.Member");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "getTest", argTypes, term2, args);
    }

};


