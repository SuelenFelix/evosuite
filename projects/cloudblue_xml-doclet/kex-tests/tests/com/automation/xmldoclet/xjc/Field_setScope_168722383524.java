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

public class Field_setScope_168722383524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60039;

    public Field_setScope_168722383524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60039 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term60039, term60039.getClass(), "type", null);
        setField(term60039, term60039.getClass(), "comment", null);
        setField(term60039, term60039.getClass(), "tag", null);
        setField(term60039, term60039.getClass(), "constant", null);
        setField(term60039, term60039.getClass(), "annotation", null);
        setField(term60039, term60039.getClass(), "name", null);
        setField(term60039, term60039.getClass(), "qualified", null);
        setField(term60039, term60039.getClass(), "scope", null);
        setField(term60039, term60039.getClass(), "_volatile", null);
        setField(term60039, term60039.getClass(), "_transient", null);
        setField(term60039, term60039.getClass(), "_static", null);
        setField(term60039, term60039.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScope", argTypes, term60039, args);
    }

};


