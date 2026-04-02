package com.shark.erp.entity;

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
import static com.shark.erp.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GoodsMonitor_setGoodsName_1497498594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5561;

    public GoodsMonitor_setGoodsName_1497498594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5561 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5561, term5561.getClass(), "id", -851097944);
        setField(term5561, term5561.getClass(), "goodsName", "FwPbDZcHmB");
        setIntField(term5561, term5561.getClass(), "timeDiff", 803925431);
        setIntField(term5561, term5561.getClass(), "inventory", 76929641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hOncybyCAH";
        callMethod(klass, "setGoodsName", argTypes, term5561, args);
    }

};


