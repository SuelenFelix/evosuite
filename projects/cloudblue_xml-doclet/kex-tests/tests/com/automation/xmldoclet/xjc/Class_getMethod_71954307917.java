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

public class Class_getMethod_71954307917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20304;

    public Class_getMethod_71954307917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20304 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term20304, term20304.getClass(), "comment", null);
        setField(term20304, term20304.getClass(), "tag", null);
        setField(term20304, term20304.getClass(), "generic", null);
        setField(term20304, term20304.getClass(), "clazz", null);
        setField(term20304, term20304.getClass(), "_interface", null);
        setField(term20304, term20304.getClass(), "constructor", null);
        setField(term20304, term20304.getClass(), "method", null);
        setField(term20304, term20304.getClass(), "annotation", null);
        setField(term20304, term20304.getClass(), "field", null);
        setField(term20304, term20304.getClass(), "name", null);
        setField(term20304, term20304.getClass(), "qualified", null);
        setField(term20304, term20304.getClass(), "scope", null);
        setField(term20304, term20304.getClass(), "_abstract", null);
        setField(term20304, term20304.getClass(), "error", null);
        setField(term20304, term20304.getClass(), "exception", null);
        setField(term20304, term20304.getClass(), "externalizable", null);
        setField(term20304, term20304.getClass(), "included", null);
        setField(term20304, term20304.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term20304, args);
    }

};


