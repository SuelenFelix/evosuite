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

public class Class_setClazz_22334189911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18373;

    public Class_setClazz_22334189911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18373 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term18373, term18373.getClass(), "comment", null);
        setField(term18373, term18373.getClass(), "tag", null);
        setField(term18373, term18373.getClass(), "generic", null);
        setField(term18373, term18373.getClass(), "clazz", null);
        setField(term18373, term18373.getClass(), "_interface", null);
        setField(term18373, term18373.getClass(), "constructor", null);
        setField(term18373, term18373.getClass(), "method", null);
        setField(term18373, term18373.getClass(), "annotation", null);
        setField(term18373, term18373.getClass(), "field", null);
        setField(term18373, term18373.getClass(), "name", null);
        setField(term18373, term18373.getClass(), "qualified", null);
        setField(term18373, term18373.getClass(), "scope", null);
        setField(term18373, term18373.getClass(), "_abstract", null);
        setField(term18373, term18373.getClass(), "error", null);
        setField(term18373, term18373.getClass(), "exception", null);
        setField(term18373, term18373.getClass(), "externalizable", null);
        setField(term18373, term18373.getClass(), "included", null);
        setField(term18373, term18373.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClazz", argTypes, term18373, args);
    }

};


