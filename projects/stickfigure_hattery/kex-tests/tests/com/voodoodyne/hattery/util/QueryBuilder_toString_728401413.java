package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class QueryBuilder_toString_728401413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;

    public QueryBuilder_toString_728401413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = newInstance(Class.forName("com.voodoodyne.hattery.util.QueryBuilder"));
        Object term368 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term369 = (byte[]) newByteArray(16);
        setField(term368, term368.getClass(), "value", term369);
        setByteField(term368, term368.getClass(), "coder", (byte) 0);
        setIntField(term368, term368.getClass(), "count", 0);
        setField(term367, term367.getClass(), "bld", term368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.QueryBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term367, args);
    }

};


