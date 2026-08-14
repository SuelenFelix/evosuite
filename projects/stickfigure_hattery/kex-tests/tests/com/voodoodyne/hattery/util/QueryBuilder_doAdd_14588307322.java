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

public class QueryBuilder_doAdd_14588307322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286;

    public QueryBuilder_doAdd_14588307322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286 = newInstance(Class.forName("com.voodoodyne.hattery.util.QueryBuilder"));
        Object term287 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term288 = (byte[]) newByteArray(16);
        setField(term287, term287.getClass(), "value", term288);
        setByteField(term287, term287.getClass(), "coder", (byte) 0);
        setIntField(term287, term287.getClass(), "count", 0);
        setField(term286, term286.getClass(), "bld", term287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.QueryBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "NRdvgJlhkX";
        args[1] = "uuaPigETmJ";
        callMethod(klass, "doAdd", argTypes, term286, args);
    }

};


