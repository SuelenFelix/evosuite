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

public class Field_getType_14871946012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54831;

    public Field_getType_14871946012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54831 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term54831, term54831.getClass(), "type", null);
        setField(term54831, term54831.getClass(), "comment", null);
        setField(term54831, term54831.getClass(), "tag", null);
        setField(term54831, term54831.getClass(), "constant", null);
        setField(term54831, term54831.getClass(), "annotation", null);
        setField(term54831, term54831.getClass(), "name", null);
        setField(term54831, term54831.getClass(), "qualified", null);
        setField(term54831, term54831.getClass(), "scope", null);
        setField(term54831, term54831.getClass(), "_volatile", null);
        setField(term54831, term54831.getClass(), "_transient", null);
        setField(term54831, term54831.getClass(), "_static", null);
        setField(term54831, term54831.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term54831, args);
    }

};


