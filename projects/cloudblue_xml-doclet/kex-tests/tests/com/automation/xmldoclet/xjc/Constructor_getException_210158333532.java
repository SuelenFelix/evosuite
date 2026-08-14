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

public class Constructor_getException_210158333532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6014;

    public Constructor_getException_210158333532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6014 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term6014, term6014.getClass(), "comment", null);
        setField(term6014, term6014.getClass(), "tag", null);
        setField(term6014, term6014.getClass(), "parameter", null);
        setField(term6014, term6014.getClass(), "exception", null);
        setField(term6014, term6014.getClass(), "annotation", null);
        setField(term6014, term6014.getClass(), "name", null);
        setField(term6014, term6014.getClass(), "signature", null);
        setField(term6014, term6014.getClass(), "qualified", null);
        setField(term6014, term6014.getClass(), "scope", null);
        setField(term6014, term6014.getClass(), "_final", null);
        setField(term6014, term6014.getClass(), "included", null);
        setField(term6014, term6014.getClass(), "_native", null);
        setField(term6014, term6014.getClass(), "_synchronized", null);
        setField(term6014, term6014.getClass(), "_static", null);
        setField(term6014, term6014.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getException", argTypes, term6014, args);
    }

};


