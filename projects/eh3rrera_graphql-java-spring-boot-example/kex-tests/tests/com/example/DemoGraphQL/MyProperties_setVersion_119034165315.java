package com.example.DemoGraphQL;

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
import static com.example.DemoGraphQL.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MyProperties_setVersion_119034165315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2375;

    public MyProperties_setVersion_119034165315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2375 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        setField(term2375, term2375.getClass(), "version", null);
        setField(term2375, term2375.getClass(), "artifactId", null);
        setField(term2375, term2375.getClass(), "h2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVersion", argTypes, term2375, args);
    }

};


