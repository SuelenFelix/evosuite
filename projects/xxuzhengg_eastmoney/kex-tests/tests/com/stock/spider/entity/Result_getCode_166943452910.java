package com.stock.spider.entity;

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
import static com.stock.spider.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Result_getCode_166943452910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12336;

    public Result_getCode_166943452910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12336 = newInstance(Class.forName("com.stock.spider.entity.Result"));
        setField(term12336, term12336.getClass(), "code", null);
        setField(term12336, term12336.getClass(), "msg", null);
        setIntField(term12336, term12336.getClass(), "count", 0);
        setField(term12336, term12336.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term12336, args);
    }

};


