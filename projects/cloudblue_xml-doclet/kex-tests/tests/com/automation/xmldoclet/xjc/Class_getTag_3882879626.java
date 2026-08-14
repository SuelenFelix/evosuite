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

public class Class_getTag_3882879626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17516;

    public Class_getTag_3882879626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17516 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term17516, term17516.getClass(), "comment", null);
        setField(term17516, term17516.getClass(), "tag", null);
        setField(term17516, term17516.getClass(), "generic", null);
        setField(term17516, term17516.getClass(), "clazz", null);
        setField(term17516, term17516.getClass(), "_interface", null);
        setField(term17516, term17516.getClass(), "constructor", null);
        setField(term17516, term17516.getClass(), "method", null);
        setField(term17516, term17516.getClass(), "annotation", null);
        setField(term17516, term17516.getClass(), "field", null);
        setField(term17516, term17516.getClass(), "name", null);
        setField(term17516, term17516.getClass(), "qualified", null);
        setField(term17516, term17516.getClass(), "scope", null);
        setField(term17516, term17516.getClass(), "_abstract", null);
        setField(term17516, term17516.getClass(), "error", null);
        setField(term17516, term17516.getClass(), "exception", null);
        setField(term17516, term17516.getClass(), "externalizable", null);
        setField(term17516, term17516.getClass(), "included", null);
        setField(term17516, term17516.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term17516, args);
    }

};


