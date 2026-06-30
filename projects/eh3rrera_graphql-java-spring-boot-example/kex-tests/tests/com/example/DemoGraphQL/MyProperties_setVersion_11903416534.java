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

public class MyProperties_setVersion_11903416534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;

    public MyProperties_setVersion_11903416534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1827 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        Object term1852 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties$H2"));
        setField(term1827, term1827.getClass(), "version", "oVgzLbrsFr");
        setField(term1827, term1827.getClass(), "artifactId", "vQVyKLdtaz");
        setField(term1852, term1852.getClass(), "version", "OWKQODBLzb");
        setField(term1827, term1827.getClass(), "h2", term1852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setVersion", argTypes, term1827, args);
    }

};


