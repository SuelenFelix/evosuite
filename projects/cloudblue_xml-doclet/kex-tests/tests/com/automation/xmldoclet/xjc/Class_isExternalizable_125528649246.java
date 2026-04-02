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

public class Class_isExternalizable_125528649246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29194;

    public Class_isExternalizable_125528649246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29194 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term29194, term29194.getClass(), "comment", null);
        setField(term29194, term29194.getClass(), "tag", null);
        setField(term29194, term29194.getClass(), "generic", null);
        setField(term29194, term29194.getClass(), "clazz", null);
        setField(term29194, term29194.getClass(), "_interface", null);
        setField(term29194, term29194.getClass(), "constructor", null);
        setField(term29194, term29194.getClass(), "method", null);
        setField(term29194, term29194.getClass(), "annotation", null);
        setField(term29194, term29194.getClass(), "field", null);
        setField(term29194, term29194.getClass(), "name", null);
        setField(term29194, term29194.getClass(), "qualified", null);
        setField(term29194, term29194.getClass(), "scope", null);
        setField(term29194, term29194.getClass(), "_abstract", null);
        setField(term29194, term29194.getClass(), "error", null);
        setField(term29194, term29194.getClass(), "exception", null);
        setField(term29194, term29194.getClass(), "externalizable", null);
        setField(term29194, term29194.getClass(), "included", null);
        setField(term29194, term29194.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExternalizable", argTypes, term29194, args);
    }

};


