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

public class Class_getAnnotation_47594069759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32231;

    public Class_getAnnotation_47594069759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32231 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term32231, term32231.getClass(), "comment", null);
        setField(term32231, term32231.getClass(), "tag", null);
        setField(term32231, term32231.getClass(), "generic", null);
        setField(term32231, term32231.getClass(), "clazz", null);
        setField(term32231, term32231.getClass(), "_interface", null);
        setField(term32231, term32231.getClass(), "constructor", null);
        setField(term32231, term32231.getClass(), "method", null);
        setField(term32231, term32231.getClass(), "annotation", null);
        setField(term32231, term32231.getClass(), "field", null);
        setField(term32231, term32231.getClass(), "name", null);
        setField(term32231, term32231.getClass(), "qualified", null);
        setField(term32231, term32231.getClass(), "scope", null);
        setField(term32231, term32231.getClass(), "_abstract", null);
        setField(term32231, term32231.getClass(), "error", null);
        setField(term32231, term32231.getClass(), "exception", null);
        setField(term32231, term32231.getClass(), "externalizable", null);
        setField(term32231, term32231.getClass(), "included", null);
        setField(term32231, term32231.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term32231, args);
    }

};


