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

public class Package_getTag_121445226413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42584;

    public Package_getTag_121445226413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42584 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Package"));
        setField(term42584, term42584.getClass(), "comment", null);
        setField(term42584, term42584.getClass(), "tag", null);
        setField(term42584, term42584.getClass(), "annotation", null);
        setField(term42584, term42584.getClass(), "_enum", null);
        setField(term42584, term42584.getClass(), "_interface", null);
        setField(term42584, term42584.getClass(), "clazz", null);
        setField(term42584, term42584.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Package");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term42584, args);
    }

};


