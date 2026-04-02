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

public class Class_getGeneric_20766607017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16862;

    public Class_getGeneric_20766607017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16862 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term16862, term16862.getClass(), "comment", null);
        setField(term16862, term16862.getClass(), "tag", null);
        setField(term16862, term16862.getClass(), "generic", null);
        setField(term16862, term16862.getClass(), "clazz", null);
        setField(term16862, term16862.getClass(), "_interface", null);
        setField(term16862, term16862.getClass(), "constructor", null);
        setField(term16862, term16862.getClass(), "method", null);
        setField(term16862, term16862.getClass(), "annotation", null);
        setField(term16862, term16862.getClass(), "field", null);
        setField(term16862, term16862.getClass(), "name", null);
        setField(term16862, term16862.getClass(), "qualified", null);
        setField(term16862, term16862.getClass(), "scope", null);
        setField(term16862, term16862.getClass(), "_abstract", null);
        setField(term16862, term16862.getClass(), "error", null);
        setField(term16862, term16862.getClass(), "exception", null);
        setField(term16862, term16862.getClass(), "externalizable", null);
        setField(term16862, term16862.getClass(), "included", null);
        setField(term16862, term16862.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneric", argTypes, term16862, args);
    }

};


