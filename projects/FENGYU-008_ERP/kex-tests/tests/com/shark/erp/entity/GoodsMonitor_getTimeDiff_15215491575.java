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

public class GoodsMonitor_getTimeDiff_15215491575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5609;

    public GoodsMonitor_getTimeDiff_15215491575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5609 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5609, term5609.getClass(), "id", -2003192918);
        setField(term5609, term5609.getClass(), "goodsName", "QduALnDSVo");
        setIntField(term5609, term5609.getClass(), "timeDiff", -1362856620);
        setIntField(term5609, term5609.getClass(), "inventory", -1835839814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeDiff", argTypes, term5609, args);
    }

};


