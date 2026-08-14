package com.amazonaws.datastreamvectorization.datasink.model;

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
import static com.amazonaws.datastreamvectorization.datasink.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class OpenSearchDataSinkConfiguration_init_4277976014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;
     Object term1456;

    public OpenSearchDataSinkConfiguration_init_4277976014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1489 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term1488 = ((Class) term1489).getDeclaredField((String) "PROVISIONED");
        ((Field) term1488).setAccessible(true);
        enum3 = ((Field) term1488).get((Object) null);
        term1456 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = "NRdvgJlhkX";
        args[1] = "uuaPigETmJ";
        args[2] = "MxlszYVzRf";
        args[3] = enum3;
        args[4] = term1456;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


