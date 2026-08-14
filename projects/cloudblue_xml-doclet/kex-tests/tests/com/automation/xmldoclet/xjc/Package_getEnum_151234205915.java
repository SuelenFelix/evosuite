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

public class Package_getEnum_151234205915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42586;

    public Package_getEnum_151234205915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42586 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term42586, term42586.getClass(), "comment", null);
        setField(term42586, term42586.getClass(), "tag", null);
        setField(term42586, term42586.getClass(), "annotation", null);
        setField(term42586, term42586.getClass(), "_enum", null);
        setField(term42586, term42586.getClass(), "_interface", null);
        setField(term42586, term42586.getClass(), "clazz", null);
        setField(term42586, term42586.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnum", argTypes, term42586, args);
    }

};


