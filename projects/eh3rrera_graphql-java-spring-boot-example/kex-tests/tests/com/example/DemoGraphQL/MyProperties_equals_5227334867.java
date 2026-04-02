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
import java.lang.Object;

public class MyProperties_equals_5227334867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2098;
     Object term2136;

    public MyProperties_equals_5227334867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2098 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        Object term2123 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties$H2"));
        setField(term2098, term2098.getClass(), "version", "PkWMRdJcBb");
        setField(term2098, term2098.getClass(), "artifactId", "jSpAteRute");
        setField(term2123, term2123.getClass(), "version", "swZVeJAxjt");
        setField(term2098, term2098.getClass(), "h2", term2123);
        term2136 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2136;
        callMethod(klass, "equals", argTypes, term2098, args);
    }

};


