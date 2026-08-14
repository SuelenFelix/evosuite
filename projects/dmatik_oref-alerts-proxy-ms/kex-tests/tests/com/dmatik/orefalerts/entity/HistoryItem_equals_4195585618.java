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

public class HistoryItem_equals_4195585618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2409;
     Object term2447;

    public HistoryItem_equals_4195585618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2409 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term2409, term2409.getClass(), "alertDate", "xBsXSDjXYK");
        setField(term2409, term2409.getClass(), "title", "sEnIVFtZuQ");
        setField(term2409, term2409.getClass(), "data", "ZVecLZMLHF");
        setIntField(term2409, term2409.getClass(), "category", -1339778481);
        term2447 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2447;
        callMethod(klass, "equals", argTypes, term2409, args);
    }

};


