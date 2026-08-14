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

public class Enum_setQualified_41877397221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36383;

    public Enum_setQualified_41877397221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36383 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term36383, term36383.getClass(), "comment", null);
        setField(term36383, term36383.getClass(), "tag", null);
        setField(term36383, term36383.getClass(), "clazz", null);
        setField(term36383, term36383.getClass(), "_interface", null);
        setField(term36383, term36383.getClass(), "constant", null);
        setField(term36383, term36383.getClass(), "annotation", null);
        setField(term36383, term36383.getClass(), "name", null);
        setField(term36383, term36383.getClass(), "qualified", null);
        setField(term36383, term36383.getClass(), "scope", null);
        setField(term36383, term36383.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQualified", argTypes, term36383, args);
    }

};


