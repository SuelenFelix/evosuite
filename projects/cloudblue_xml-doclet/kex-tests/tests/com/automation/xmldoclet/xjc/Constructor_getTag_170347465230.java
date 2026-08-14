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

public class Constructor_getTag_170347465230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6012;

    public Constructor_getTag_170347465230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6012 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term6012, term6012.getClass(), "comment", null);
        setField(term6012, term6012.getClass(), "tag", null);
        setField(term6012, term6012.getClass(), "parameter", null);
        setField(term6012, term6012.getClass(), "exception", null);
        setField(term6012, term6012.getClass(), "annotation", null);
        setField(term6012, term6012.getClass(), "name", null);
        setField(term6012, term6012.getClass(), "signature", null);
        setField(term6012, term6012.getClass(), "qualified", null);
        setField(term6012, term6012.getClass(), "scope", null);
        setField(term6012, term6012.getClass(), "_final", null);
        setField(term6012, term6012.getClass(), "included", null);
        setField(term6012, term6012.getClass(), "_native", null);
        setField(term6012, term6012.getClass(), "_synchronized", null);
        setField(term6012, term6012.getClass(), "_static", null);
        setField(term6012, term6012.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term6012, args);
    }

};


