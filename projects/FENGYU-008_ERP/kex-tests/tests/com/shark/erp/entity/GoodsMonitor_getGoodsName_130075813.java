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

public class GoodsMonitor_getGoodsName_130075813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5535;

    public GoodsMonitor_getGoodsName_130075813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5535 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5535, term5535.getClass(), "id", -1015274146);
        setField(term5535, term5535.getClass(), "goodsName", "RMsXuyzKJV");
        setIntField(term5535, term5535.getClass(), "timeDiff", -49052672);
        setIntField(term5535, term5535.getClass(), "inventory", 339372704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsName", argTypes, term5535, args);
    }

};


