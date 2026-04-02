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

public class Class_getComment_151723963058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32230;

    public Class_getComment_151723963058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32230 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term32230, term32230.getClass(), "comment", null);
        setField(term32230, term32230.getClass(), "tag", null);
        setField(term32230, term32230.getClass(), "generic", null);
        setField(term32230, term32230.getClass(), "clazz", null);
        setField(term32230, term32230.getClass(), "_interface", null);
        setField(term32230, term32230.getClass(), "constructor", null);
        setField(term32230, term32230.getClass(), "method", null);
        setField(term32230, term32230.getClass(), "annotation", null);
        setField(term32230, term32230.getClass(), "field", null);
        setField(term32230, term32230.getClass(), "name", null);
        setField(term32230, term32230.getClass(), "qualified", null);
        setField(term32230, term32230.getClass(), "scope", null);
        setField(term32230, term32230.getClass(), "_abstract", null);
        setField(term32230, term32230.getClass(), "error", null);
        setField(term32230, term32230.getClass(), "exception", null);
        setField(term32230, term32230.getClass(), "externalizable", null);
        setField(term32230, term32230.getClass(), "included", null);
        setField(term32230, term32230.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term32230, args);
    }

};


