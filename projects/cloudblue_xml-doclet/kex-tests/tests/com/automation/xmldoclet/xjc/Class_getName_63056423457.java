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

public class Class_getName_63056423457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33078;

    public Class_getName_63056423457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33078 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term33078, term33078.getClass(), "comment", null);
        setField(term33078, term33078.getClass(), "tag", null);
        setField(term33078, term33078.getClass(), "generic", null);
        setField(term33078, term33078.getClass(), "clazz", null);
        setField(term33078, term33078.getClass(), "_interface", null);
        setField(term33078, term33078.getClass(), "constructor", null);
        setField(term33078, term33078.getClass(), "method", null);
        setField(term33078, term33078.getClass(), "annotation", null);
        setField(term33078, term33078.getClass(), "field", null);
        setField(term33078, term33078.getClass(), "name", null);
        setField(term33078, term33078.getClass(), "qualified", null);
        setField(term33078, term33078.getClass(), "scope", null);
        setField(term33078, term33078.getClass(), "_abstract", null);
        setField(term33078, term33078.getClass(), "error", null);
        setField(term33078, term33078.getClass(), "exception", null);
        setField(term33078, term33078.getClass(), "externalizable", null);
        setField(term33078, term33078.getClass(), "included", null);
        setField(term33078, term33078.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term33078, args);
    }

};


