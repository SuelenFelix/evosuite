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

public class Package_setName_152427650019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42590;

    public Package_setName_152427650019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42590 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term42590, term42590.getClass(), "comment", null);
        setField(term42590, term42590.getClass(), "tag", null);
        setField(term42590, term42590.getClass(), "annotation", null);
        setField(term42590, term42590.getClass(), "_enum", null);
        setField(term42590, term42590.getClass(), "_interface", null);
        setField(term42590, term42590.getClass(), "clazz", null);
        setField(term42590, term42590.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Package");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term42590, args);
    }

};


