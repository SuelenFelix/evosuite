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
import java.lang.Integer;

public class Result_setCount_124317910815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12346;
     Object term12348;

    public Result_setCount_124317910815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12346 = newInstance(Class.forName("com.stock.spider.entity.Result"));
        setField(term12346, term12346.getClass(), "code", null);
        setField(term12346, term12346.getClass(), "msg", null);
        setIntField(term12346, term12346.getClass(), "count", 0);
        setField(term12346, term12346.getClass(), "data", null);
        term12348 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.entity.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12348;
        callMethod(klass, "setCount", argTypes, term12346, args);
    }

};


