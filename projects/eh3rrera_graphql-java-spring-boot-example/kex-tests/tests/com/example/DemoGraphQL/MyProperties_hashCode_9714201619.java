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

public class MyProperties_hashCode_9714201619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2236;

    public MyProperties_hashCode_9714201619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2236 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        Object term2261 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties$H2"));
        setField(term2236, term2236.getClass(), "version", "jiKYgYHqIS");
        setField(term2236, term2236.getClass(), "artifactId", "DfISiziTgG");
        setField(term2261, term2261.getClass(), "version", "XqgfKFvPSD");
        setField(term2236, term2236.getClass(), "h2", term2261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2236, args);
    }

};


