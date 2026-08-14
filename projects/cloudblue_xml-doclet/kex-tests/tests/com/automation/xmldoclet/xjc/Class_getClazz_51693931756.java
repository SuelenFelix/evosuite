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

public class Class_getClazz_51693931756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33077;

    public Class_getClazz_51693931756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33077 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term33077, term33077.getClass(), "comment", null);
        setField(term33077, term33077.getClass(), "tag", null);
        setField(term33077, term33077.getClass(), "generic", null);
        setField(term33077, term33077.getClass(), "clazz", null);
        setField(term33077, term33077.getClass(), "_interface", null);
        setField(term33077, term33077.getClass(), "constructor", null);
        setField(term33077, term33077.getClass(), "method", null);
        setField(term33077, term33077.getClass(), "annotation", null);
        setField(term33077, term33077.getClass(), "field", null);
        setField(term33077, term33077.getClass(), "name", null);
        setField(term33077, term33077.getClass(), "qualified", null);
        setField(term33077, term33077.getClass(), "scope", null);
        setField(term33077, term33077.getClass(), "_abstract", null);
        setField(term33077, term33077.getClass(), "error", null);
        setField(term33077, term33077.getClass(), "exception", null);
        setField(term33077, term33077.getClass(), "externalizable", null);
        setField(term33077, term33077.getClass(), "included", null);
        setField(term33077, term33077.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClazz", argTypes, term33077, args);
    }

};


