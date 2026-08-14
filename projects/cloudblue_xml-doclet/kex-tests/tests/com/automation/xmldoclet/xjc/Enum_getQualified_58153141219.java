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

public class Enum_getQualified_58153141219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36107;

    public Enum_getQualified_58153141219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36107 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term36107, term36107.getClass(), "comment", null);
        setField(term36107, term36107.getClass(), "tag", null);
        setField(term36107, term36107.getClass(), "clazz", null);
        setField(term36107, term36107.getClass(), "_interface", null);
        setField(term36107, term36107.getClass(), "constant", null);
        setField(term36107, term36107.getClass(), "annotation", null);
        setField(term36107, term36107.getClass(), "name", null);
        setField(term36107, term36107.getClass(), "qualified", null);
        setField(term36107, term36107.getClass(), "scope", null);
        setField(term36107, term36107.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualified", argTypes, term36107, args);
    }

};


