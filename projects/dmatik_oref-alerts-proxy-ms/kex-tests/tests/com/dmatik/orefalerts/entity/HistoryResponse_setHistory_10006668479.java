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

public class HistoryResponse_setHistory_10006668479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8106;

    public HistoryResponse_setHistory_10006668479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8106 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryResponse"));
        setField(term8106, term8106.getClass(), "history", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHistory", argTypes, term8106, args);
    }

};


