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

public class Class_setExternalizable_125110281448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29727;

    public Class_setExternalizable_125110281448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29727 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term29727, term29727.getClass(), "comment", null);
        setField(term29727, term29727.getClass(), "tag", null);
        setField(term29727, term29727.getClass(), "generic", null);
        setField(term29727, term29727.getClass(), "clazz", null);
        setField(term29727, term29727.getClass(), "_interface", null);
        setField(term29727, term29727.getClass(), "constructor", null);
        setField(term29727, term29727.getClass(), "method", null);
        setField(term29727, term29727.getClass(), "annotation", null);
        setField(term29727, term29727.getClass(), "field", null);
        setField(term29727, term29727.getClass(), "name", null);
        setField(term29727, term29727.getClass(), "qualified", null);
        setField(term29727, term29727.getClass(), "scope", null);
        setField(term29727, term29727.getClass(), "_abstract", null);
        setField(term29727, term29727.getClass(), "error", null);
        setField(term29727, term29727.getClass(), "exception", null);
        setField(term29727, term29727.getClass(), "externalizable", null);
        setField(term29727, term29727.getClass(), "included", null);
        setField(term29727, term29727.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExternalizable", argTypes, term29727, args);
    }

};


