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

public class Class_setSerializable_84620645756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32229;

    public Class_setSerializable_84620645756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32229 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term32229, term32229.getClass(), "comment", null);
        setField(term32229, term32229.getClass(), "tag", null);
        setField(term32229, term32229.getClass(), "generic", null);
        setField(term32229, term32229.getClass(), "clazz", null);
        setField(term32229, term32229.getClass(), "_interface", null);
        setField(term32229, term32229.getClass(), "constructor", null);
        setField(term32229, term32229.getClass(), "method", null);
        setField(term32229, term32229.getClass(), "annotation", null);
        setField(term32229, term32229.getClass(), "field", null);
        setField(term32229, term32229.getClass(), "name", null);
        setField(term32229, term32229.getClass(), "qualified", null);
        setField(term32229, term32229.getClass(), "scope", null);
        setField(term32229, term32229.getClass(), "_abstract", null);
        setField(term32229, term32229.getClass(), "error", null);
        setField(term32229, term32229.getClass(), "exception", null);
        setField(term32229, term32229.getClass(), "externalizable", null);
        setField(term32229, term32229.getClass(), "included", null);
        setField(term32229, term32229.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSerializable", argTypes, term32229, args);
    }

};


