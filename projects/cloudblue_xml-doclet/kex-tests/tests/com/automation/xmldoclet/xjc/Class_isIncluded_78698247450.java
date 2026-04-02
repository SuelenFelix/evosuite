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

public class Class_isIncluded_78698247450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30296;

    public Class_isIncluded_78698247450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30296 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term30296, term30296.getClass(), "comment", null);
        setField(term30296, term30296.getClass(), "tag", null);
        setField(term30296, term30296.getClass(), "generic", null);
        setField(term30296, term30296.getClass(), "clazz", null);
        setField(term30296, term30296.getClass(), "_interface", null);
        setField(term30296, term30296.getClass(), "constructor", null);
        setField(term30296, term30296.getClass(), "method", null);
        setField(term30296, term30296.getClass(), "annotation", null);
        setField(term30296, term30296.getClass(), "field", null);
        setField(term30296, term30296.getClass(), "name", null);
        setField(term30296, term30296.getClass(), "qualified", null);
        setField(term30296, term30296.getClass(), "scope", null);
        setField(term30296, term30296.getClass(), "_abstract", null);
        setField(term30296, term30296.getClass(), "error", null);
        setField(term30296, term30296.getClass(), "exception", null);
        setField(term30296, term30296.getClass(), "externalizable", null);
        setField(term30296, term30296.getClass(), "included", null);
        setField(term30296, term30296.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIncluded", argTypes, term30296, args);
    }

};


