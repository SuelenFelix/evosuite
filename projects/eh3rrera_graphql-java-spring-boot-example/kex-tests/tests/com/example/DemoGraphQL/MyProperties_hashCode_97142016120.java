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

public class MyProperties_hashCode_97142016120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2380;

    public MyProperties_hashCode_97142016120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2380 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        setField(term2380, term2380.getClass(), "version", null);
        setField(term2380, term2380.getClass(), "artifactId", null);
        setField(term2380, term2380.getClass(), "h2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2380, args);
    }

};


