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

public class GoodsMonitor_setTimeDiff_7437906916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5635;
     Object term5651;

    public GoodsMonitor_setTimeDiff_7437906916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5635 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5635, term5635.getClass(), "id", -1404350380);
        setField(term5635, term5635.getClass(), "goodsName", "izPpKDErnQ");
        setIntField(term5635, term5635.getClass(), "timeDiff", -2013924238);
        setIntField(term5635, term5635.getClass(), "inventory", 579006268);
        term5651 = new Integer(-1694747156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5651;
        callMethod(klass, "setTimeDiff", argTypes, term5635, args);
    }

};


