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

public class Class_isSerializable_90249502754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31660;

    public Class_isSerializable_90249502754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31660 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term31660, term31660.getClass(), "comment", null);
        setField(term31660, term31660.getClass(), "tag", null);
        setField(term31660, term31660.getClass(), "generic", null);
        setField(term31660, term31660.getClass(), "clazz", null);
        setField(term31660, term31660.getClass(), "_interface", null);
        setField(term31660, term31660.getClass(), "constructor", null);
        setField(term31660, term31660.getClass(), "method", null);
        setField(term31660, term31660.getClass(), "annotation", null);
        setField(term31660, term31660.getClass(), "field", null);
        setField(term31660, term31660.getClass(), "name", null);
        setField(term31660, term31660.getClass(), "qualified", null);
        setField(term31660, term31660.getClass(), "scope", null);
        setField(term31660, term31660.getClass(), "_abstract", null);
        setField(term31660, term31660.getClass(), "error", null);
        setField(term31660, term31660.getClass(), "exception", null);
        setField(term31660, term31660.getClass(), "externalizable", null);
        setField(term31660, term31660.getClass(), "included", null);
        setField(term31660, term31660.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSerializable", argTypes, term31660, args);
    }

};


