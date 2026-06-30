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

public class MyProperties_getArtifactId_19917929722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1691;

    public MyProperties_getArtifactId_19917929722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1691 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties"));
        Object term1716 = newInstance(Class.forName("com.example.DemoGraphQL.MyProperties$H2"));
        setField(term1691, term1691.getClass(), "version", "whBvTVIIlC");
        setField(term1691, term1691.getClass(), "artifactId", "IgRJUzaCwW");
        setField(term1716, term1716.getClass(), "version", "JUmudUmaaV");
        setField(term1691, term1691.getClass(), "h2", term1716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.DemoGraphQL.MyProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtifactId", argTypes, term1691, args);
    }

};


