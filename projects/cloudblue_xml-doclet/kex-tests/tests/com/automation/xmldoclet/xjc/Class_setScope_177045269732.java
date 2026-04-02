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

public class Class_setScope_177045269732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24511;

    public Class_setScope_177045269732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24511 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term24511, term24511.getClass(), "comment", null);
        setField(term24511, term24511.getClass(), "tag", null);
        setField(term24511, term24511.getClass(), "generic", null);
        setField(term24511, term24511.getClass(), "clazz", null);
        setField(term24511, term24511.getClass(), "_interface", null);
        setField(term24511, term24511.getClass(), "constructor", null);
        setField(term24511, term24511.getClass(), "method", null);
        setField(term24511, term24511.getClass(), "annotation", null);
        setField(term24511, term24511.getClass(), "field", null);
        setField(term24511, term24511.getClass(), "name", null);
        setField(term24511, term24511.getClass(), "qualified", null);
        setField(term24511, term24511.getClass(), "scope", null);
        setField(term24511, term24511.getClass(), "_abstract", null);
        setField(term24511, term24511.getClass(), "error", null);
        setField(term24511, term24511.getClass(), "exception", null);
        setField(term24511, term24511.getClass(), "externalizable", null);
        setField(term24511, term24511.getClass(), "included", null);
        setField(term24511, term24511.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScope", argTypes, term24511, args);
    }

};


