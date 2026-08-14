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

public class Class_setIncluded_111813234850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31900;

    public Class_setIncluded_111813234850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31900 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term31900, term31900.getClass(), "comment", null);
        setField(term31900, term31900.getClass(), "tag", null);
        setField(term31900, term31900.getClass(), "generic", null);
        setField(term31900, term31900.getClass(), "clazz", null);
        setField(term31900, term31900.getClass(), "_interface", null);
        setField(term31900, term31900.getClass(), "constructor", null);
        setField(term31900, term31900.getClass(), "method", null);
        setField(term31900, term31900.getClass(), "annotation", null);
        setField(term31900, term31900.getClass(), "field", null);
        setField(term31900, term31900.getClass(), "name", null);
        setField(term31900, term31900.getClass(), "qualified", null);
        setField(term31900, term31900.getClass(), "scope", null);
        setField(term31900, term31900.getClass(), "_abstract", null);
        setField(term31900, term31900.getClass(), "error", null);
        setField(term31900, term31900.getClass(), "exception", null);
        setField(term31900, term31900.getClass(), "externalizable", null);
        setField(term31900, term31900.getClass(), "included", null);
        setField(term31900, term31900.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIncluded", argTypes, term31900, args);
    }

};


