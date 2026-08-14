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

public class QueryBuilder_add_233968871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term259;

    public QueryBuilder_add_233968871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226 = newInstance(Class.forName("com.voodoodyne.hattery.util.QueryBuilder"));
        Object term227 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term228 = (byte[]) newByteArray(16);
        setField(term227, term227.getClass(), "value", term228);
        setByteField(term227, term227.getClass(), "coder", (byte) 0);
        setIntField(term227, term227.getClass(), "count", 0);
        setField(term226, term226.getClass(), "bld", term227);
        term259 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.QueryBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "RMFIsYGgne";
        args[1] = term259;
        callMethod(klass, "add", argTypes, term226, args);
    }

};


