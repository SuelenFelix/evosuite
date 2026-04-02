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

public class Class_isError_1173894638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26499;

    public Class_isError_1173894638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26499 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term26499, term26499.getClass(), "comment", null);
        setField(term26499, term26499.getClass(), "tag", null);
        setField(term26499, term26499.getClass(), "generic", null);
        setField(term26499, term26499.getClass(), "clazz", null);
        setField(term26499, term26499.getClass(), "_interface", null);
        setField(term26499, term26499.getClass(), "constructor", null);
        setField(term26499, term26499.getClass(), "method", null);
        setField(term26499, term26499.getClass(), "annotation", null);
        setField(term26499, term26499.getClass(), "field", null);
        setField(term26499, term26499.getClass(), "name", null);
        setField(term26499, term26499.getClass(), "qualified", null);
        setField(term26499, term26499.getClass(), "scope", null);
        setField(term26499, term26499.getClass(), "_abstract", null);
        setField(term26499, term26499.getClass(), "error", null);
        setField(term26499, term26499.getClass(), "exception", null);
        setField(term26499, term26499.getClass(), "externalizable", null);
        setField(term26499, term26499.getClass(), "included", null);
        setField(term26499, term26499.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isError", argTypes, term26499, args);
    }

};


