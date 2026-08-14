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

public class Class_getField_211634202220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21273;

    public Class_getField_211634202220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21273 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term21273, term21273.getClass(), "comment", null);
        setField(term21273, term21273.getClass(), "tag", null);
        setField(term21273, term21273.getClass(), "generic", null);
        setField(term21273, term21273.getClass(), "clazz", null);
        setField(term21273, term21273.getClass(), "_interface", null);
        setField(term21273, term21273.getClass(), "constructor", null);
        setField(term21273, term21273.getClass(), "method", null);
        setField(term21273, term21273.getClass(), "annotation", null);
        setField(term21273, term21273.getClass(), "field", null);
        setField(term21273, term21273.getClass(), "name", null);
        setField(term21273, term21273.getClass(), "qualified", null);
        setField(term21273, term21273.getClass(), "scope", null);
        setField(term21273, term21273.getClass(), "_abstract", null);
        setField(term21273, term21273.getClass(), "error", null);
        setField(term21273, term21273.getClass(), "exception", null);
        setField(term21273, term21273.getClass(), "externalizable", null);
        setField(term21273, term21273.getClass(), "included", null);
        setField(term21273, term21273.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getField", argTypes, term21273, args);
    }

};


