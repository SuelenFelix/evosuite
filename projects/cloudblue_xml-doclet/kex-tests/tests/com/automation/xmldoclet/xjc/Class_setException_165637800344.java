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

public class Class_setException_165637800344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28473;

    public Class_setException_165637800344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28473 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term28473, term28473.getClass(), "comment", null);
        setField(term28473, term28473.getClass(), "tag", null);
        setField(term28473, term28473.getClass(), "generic", null);
        setField(term28473, term28473.getClass(), "clazz", null);
        setField(term28473, term28473.getClass(), "_interface", null);
        setField(term28473, term28473.getClass(), "constructor", null);
        setField(term28473, term28473.getClass(), "method", null);
        setField(term28473, term28473.getClass(), "annotation", null);
        setField(term28473, term28473.getClass(), "field", null);
        setField(term28473, term28473.getClass(), "name", null);
        setField(term28473, term28473.getClass(), "qualified", null);
        setField(term28473, term28473.getClass(), "scope", null);
        setField(term28473, term28473.getClass(), "_abstract", null);
        setField(term28473, term28473.getClass(), "error", null);
        setField(term28473, term28473.getClass(), "exception", null);
        setField(term28473, term28473.getClass(), "externalizable", null);
        setField(term28473, term28473.getClass(), "included", null);
        setField(term28473, term28473.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setException", argTypes, term28473, args);
    }

};


