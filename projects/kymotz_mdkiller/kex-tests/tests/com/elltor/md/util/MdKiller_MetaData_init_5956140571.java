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
import java.lang.String;
import java.lang.Object;

public class MdKiller_MetaData_init_5956140571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum24;

    public MdKiller_MetaData_init_5956140571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6110 = Class.forName((String) "com.elltor.md.util.MdKiller$MetaData$Type");
        Field term6109 = ((Class) term6110).getDeclaredField((String) "NORMAL");
        ((Field) term6109).setAccessible(true);
        enum24 = ((Field) term6109).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$MetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.elltor.md.util.MdKiller$MetaData$Type");
        Object[] args = new Object[1];
        args[0] = enum24;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


