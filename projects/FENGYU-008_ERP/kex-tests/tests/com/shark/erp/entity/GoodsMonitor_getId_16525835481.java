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

public class GoodsMonitor_getId_16525835481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5481;

    public GoodsMonitor_getId_16525835481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5481 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5481, term5481.getClass(), "id", -1464172784);
        setField(term5481, term5481.getClass(), "goodsName", "tlzpzIjMib");
        setIntField(term5481, term5481.getClass(), "timeDiff", 32185364);
        setIntField(term5481, term5481.getClass(), "inventory", 1768204942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5481, args);
    }

};


