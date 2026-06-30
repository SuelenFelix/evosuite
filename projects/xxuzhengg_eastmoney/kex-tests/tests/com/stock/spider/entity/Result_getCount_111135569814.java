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

public class Result_getCount_111135569814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12344;

    public Result_getCount_111135569814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12344 = newInstance(Class.forName("com.stock.spider.entity.Result"));
        setField(term12344, term12344.getClass(), "code", null);
        setField(term12344, term12344.getClass(), "msg", null);
        setIntField(term12344, term12344.getClass(), "count", 0);
        setField(term12344, term12344.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term12344, args);
    }

};


