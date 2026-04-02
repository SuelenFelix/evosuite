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

public class Class_isSerializable_90249502752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32332;

    public Class_isSerializable_90249502752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32332 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term32332, term32332.getClass(), "comment", null);
        setField(term32332, term32332.getClass(), "tag", null);
        setField(term32332, term32332.getClass(), "generic", null);
        setField(term32332, term32332.getClass(), "clazz", null);
        setField(term32332, term32332.getClass(), "_interface", null);
        setField(term32332, term32332.getClass(), "constructor", null);
        setField(term32332, term32332.getClass(), "method", null);
        setField(term32332, term32332.getClass(), "annotation", null);
        setField(term32332, term32332.getClass(), "field", null);
        setField(term32332, term32332.getClass(), "name", null);
        setField(term32332, term32332.getClass(), "qualified", null);
        setField(term32332, term32332.getClass(), "scope", null);
        setField(term32332, term32332.getClass(), "_abstract", null);
        setField(term32332, term32332.getClass(), "error", null);
        setField(term32332, term32332.getClass(), "exception", null);
        setField(term32332, term32332.getClass(), "externalizable", null);
        setField(term32332, term32332.getClass(), "included", null);
        setField(term32332, term32332.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSerializable", argTypes, term32332, args);
    }

};


