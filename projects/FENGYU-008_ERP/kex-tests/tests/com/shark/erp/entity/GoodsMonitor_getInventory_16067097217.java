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

public class GoodsMonitor_getInventory_16067097217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5663;

    public GoodsMonitor_getInventory_16067097217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5663 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5663, term5663.getClass(), "id", 1466373988);
        setField(term5663, term5663.getClass(), "goodsName", "NnpwZBUTvx");
        setIntField(term5663, term5663.getClass(), "timeDiff", -358526505);
        setIntField(term5663, term5663.getClass(), "inventory", 1843268026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInventory", argTypes, term5663, args);
    }

};


