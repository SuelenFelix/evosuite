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

public class Class_getClazz_5169393179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17635;

    public Class_getClazz_5169393179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17635 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term17635, term17635.getClass(), "comment", null);
        setField(term17635, term17635.getClass(), "tag", null);
        setField(term17635, term17635.getClass(), "generic", null);
        setField(term17635, term17635.getClass(), "clazz", null);
        setField(term17635, term17635.getClass(), "_interface", null);
        setField(term17635, term17635.getClass(), "constructor", null);
        setField(term17635, term17635.getClass(), "method", null);
        setField(term17635, term17635.getClass(), "annotation", null);
        setField(term17635, term17635.getClass(), "field", null);
        setField(term17635, term17635.getClass(), "name", null);
        setField(term17635, term17635.getClass(), "qualified", null);
        setField(term17635, term17635.getClass(), "scope", null);
        setField(term17635, term17635.getClass(), "_abstract", null);
        setField(term17635, term17635.getClass(), "error", null);
        setField(term17635, term17635.getClass(), "exception", null);
        setField(term17635, term17635.getClass(), "externalizable", null);
        setField(term17635, term17635.getClass(), "included", null);
        setField(term17635, term17635.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClazz", argTypes, term17635, args);
    }

};


