package com.elltor.md.util;

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
import static com.elltor.md.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MdKiller_Section_parseOrderListSection_44653775413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45120;

    public MdKiller_Section_parseOrderListSection_44653775413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45120 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Section"));
        setIntField(term45120, term45120.getClass(), "depth", 0);
        setField(term45120, term45120.getClass(), "type", null);
        setField(term45120, term45120.getClass(), "data", null);
        setField(term45120, term45120.getClass(), "parent", null);
        setField(term45120, term45120.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$Section");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseOrderListSection", argTypes, term45120, args);
    }

};


