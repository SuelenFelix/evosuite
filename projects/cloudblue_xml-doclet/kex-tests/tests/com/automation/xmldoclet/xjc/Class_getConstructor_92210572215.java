package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Class_getConstructor_92210572215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19477;

    public Class_getConstructor_92210572215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19477 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term19477, term19477.getClass(), "comment", null);
        setField(term19477, term19477.getClass(), "tag", null);
        setField(term19477, term19477.getClass(), "generic", null);
        setField(term19477, term19477.getClass(), "clazz", null);
        setField(term19477, term19477.getClass(), "_interface", null);
        setField(term19477, term19477.getClass(), "constructor", null);
        setField(term19477, term19477.getClass(), "method", null);
        setField(term19477, term19477.getClass(), "annotation", null);
        setField(term19477, term19477.getClass(), "field", null);
        setField(term19477, term19477.getClass(), "name", null);
        setField(term19477, term19477.getClass(), "qualified", null);
        setField(term19477, term19477.getClass(), "scope", null);
        setField(term19477, term19477.getClass(), "_abstract", null);
        setField(term19477, term19477.getClass(), "error", null);
        setField(term19477, term19477.getClass(), "exception", null);
        setField(term19477, term19477.getClass(), "externalizable", null);
        setField(term19477, term19477.getClass(), "included", null);
        setField(term19477, term19477.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstructor", argTypes, term19477, args);
    }

};


