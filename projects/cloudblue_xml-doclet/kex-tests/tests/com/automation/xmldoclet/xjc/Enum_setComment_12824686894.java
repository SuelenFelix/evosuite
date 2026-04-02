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

public class Enum_setComment_12824686894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32746;

    public Enum_setComment_12824686894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32746 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term32746, term32746.getClass(), "comment", null);
        setField(term32746, term32746.getClass(), "tag", null);
        setField(term32746, term32746.getClass(), "clazz", null);
        setField(term32746, term32746.getClass(), "_interface", null);
        setField(term32746, term32746.getClass(), "constant", null);
        setField(term32746, term32746.getClass(), "annotation", null);
        setField(term32746, term32746.getClass(), "name", null);
        setField(term32746, term32746.getClass(), "qualified", null);
        setField(term32746, term32746.getClass(), "scope", null);
        setField(term32746, term32746.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setComment", argTypes, term32746, args);
    }

};


