package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Class_ClassBuilderImpl_build_5059248165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51394;

    public Class_ClassBuilderImpl_build_5059248165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51394 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class$ClassBuilderImpl"));
        setField(term51394, term51394.getClass(), "modifiers", null);
        setField(term51394, term51394.getClass(), "attributes", null);
        setField(term51394, term51394.getClass(), "methods", null);
        setField(term51394, term51394.getClass(), "id", null);
        setField(term51394, term51394.getClass(), "name", null);
        setField(term51394, term51394.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class$ClassBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term51394, args);
    }

};


