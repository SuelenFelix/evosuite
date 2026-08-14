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
import java.lang.Integer;

public class HistoryItem_setCategory_154483440921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2765;
     Object term2767;

    public HistoryItem_setCategory_154483440921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2765 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term2765, term2765.getClass(), "alertDate", null);
        setField(term2765, term2765.getClass(), "title", null);
        setField(term2765, term2765.getClass(), "data", null);
        setIntField(term2765, term2765.getClass(), "category", 0);
        term2767 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2767;
        callMethod(klass, "setCategory", argTypes, term2765, args);
    }

};


