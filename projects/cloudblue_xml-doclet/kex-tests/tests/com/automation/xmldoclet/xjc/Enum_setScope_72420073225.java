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

public class Enum_setScope_72420073225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36899;

    public Enum_setScope_72420073225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36899 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term36899, term36899.getClass(), "comment", null);
        setField(term36899, term36899.getClass(), "tag", null);
        setField(term36899, term36899.getClass(), "clazz", null);
        setField(term36899, term36899.getClass(), "_interface", null);
        setField(term36899, term36899.getClass(), "constant", null);
        setField(term36899, term36899.getClass(), "annotation", null);
        setField(term36899, term36899.getClass(), "name", null);
        setField(term36899, term36899.getClass(), "qualified", null);
        setField(term36899, term36899.getClass(), "scope", null);
        setField(term36899, term36899.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScope", argTypes, term36899, args);
    }

};


