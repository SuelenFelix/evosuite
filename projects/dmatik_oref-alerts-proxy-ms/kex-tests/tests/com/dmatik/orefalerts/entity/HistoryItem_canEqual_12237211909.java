package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HistoryItem_canEqual_12237211909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2478;
     Object term2516;

    public HistoryItem_canEqual_12237211909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2478 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term2478, term2478.getClass(), "alertDate", "fztQhjqwdP");
        setField(term2478, term2478.getClass(), "title", "eVpkWxjuki");
        setField(term2478, term2478.getClass(), "data", "SJiQaLvSKv");
        setIntField(term2478, term2478.getClass(), "category", 1725571209);
        term2516 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2516;
        callMethod(klass, "canEqual", argTypes, term2478, args);
    }

};


