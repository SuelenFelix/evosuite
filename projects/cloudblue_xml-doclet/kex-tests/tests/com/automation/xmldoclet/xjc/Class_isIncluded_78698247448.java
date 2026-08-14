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

public class Class_isIncluded_78698247448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31531;

    public Class_isIncluded_78698247448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31531 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term31531, term31531.getClass(), "comment", null);
        setField(term31531, term31531.getClass(), "tag", null);
        setField(term31531, term31531.getClass(), "generic", null);
        setField(term31531, term31531.getClass(), "clazz", null);
        setField(term31531, term31531.getClass(), "_interface", null);
        setField(term31531, term31531.getClass(), "constructor", null);
        setField(term31531, term31531.getClass(), "method", null);
        setField(term31531, term31531.getClass(), "annotation", null);
        setField(term31531, term31531.getClass(), "field", null);
        setField(term31531, term31531.getClass(), "name", null);
        setField(term31531, term31531.getClass(), "qualified", null);
        setField(term31531, term31531.getClass(), "scope", null);
        setField(term31531, term31531.getClass(), "_abstract", null);
        setField(term31531, term31531.getClass(), "error", null);
        setField(term31531, term31531.getClass(), "exception", null);
        setField(term31531, term31531.getClass(), "externalizable", null);
        setField(term31531, term31531.getClass(), "included", null);
        setField(term31531, term31531.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIncluded", argTypes, term31531, args);
    }

};


