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

public class Package_getInterface_183577389716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42587;

    public Package_getInterface_183577389716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42587 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term42587, term42587.getClass(), "comment", null);
        setField(term42587, term42587.getClass(), "tag", null);
        setField(term42587, term42587.getClass(), "annotation", null);
        setField(term42587, term42587.getClass(), "_enum", null);
        setField(term42587, term42587.getClass(), "_interface", null);
        setField(term42587, term42587.getClass(), "clazz", null);
        setField(term42587, term42587.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInterface", argTypes, term42587, args);
    }

};


