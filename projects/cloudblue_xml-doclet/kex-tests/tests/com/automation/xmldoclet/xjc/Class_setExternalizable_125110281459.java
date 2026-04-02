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

public class Class_setExternalizable_125110281459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33080;

    public Class_setExternalizable_125110281459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33080 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term33080, term33080.getClass(), "comment", null);
        setField(term33080, term33080.getClass(), "tag", null);
        setField(term33080, term33080.getClass(), "generic", null);
        setField(term33080, term33080.getClass(), "clazz", null);
        setField(term33080, term33080.getClass(), "_interface", null);
        setField(term33080, term33080.getClass(), "constructor", null);
        setField(term33080, term33080.getClass(), "method", null);
        setField(term33080, term33080.getClass(), "annotation", null);
        setField(term33080, term33080.getClass(), "field", null);
        setField(term33080, term33080.getClass(), "name", null);
        setField(term33080, term33080.getClass(), "qualified", null);
        setField(term33080, term33080.getClass(), "scope", null);
        setField(term33080, term33080.getClass(), "_abstract", null);
        setField(term33080, term33080.getClass(), "error", null);
        setField(term33080, term33080.getClass(), "exception", null);
        setField(term33080, term33080.getClass(), "externalizable", null);
        setField(term33080, term33080.getClass(), "included", null);
        setField(term33080, term33080.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExternalizable", argTypes, term33080, args);
    }

};


