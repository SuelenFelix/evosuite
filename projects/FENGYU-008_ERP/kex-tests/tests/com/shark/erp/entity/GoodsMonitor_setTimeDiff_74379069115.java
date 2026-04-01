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
import java.lang.Integer;

public class GoodsMonitor_setTimeDiff_74379069115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5739;
     Object term5743;

    public GoodsMonitor_setTimeDiff_74379069115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5739 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5739, term5739.getClass(), "id", 0);
        setField(term5739, term5739.getClass(), "goodsName", null);
        setIntField(term5739, term5739.getClass(), "timeDiff", 0);
        setIntField(term5739, term5739.getClass(), "inventory", 0);
        term5743 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5743;
        callMethod(klass, "setTimeDiff", argTypes, term5739, args);
    }

};


