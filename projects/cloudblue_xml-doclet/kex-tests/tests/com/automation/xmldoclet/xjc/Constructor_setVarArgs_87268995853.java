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

public class Constructor_setVarArgs_87268995853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6035;

    public Constructor_setVarArgs_87268995853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6035 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term6035, term6035.getClass(), "comment", null);
        setField(term6035, term6035.getClass(), "tag", null);
        setField(term6035, term6035.getClass(), "parameter", null);
        setField(term6035, term6035.getClass(), "exception", null);
        setField(term6035, term6035.getClass(), "annotation", null);
        setField(term6035, term6035.getClass(), "name", null);
        setField(term6035, term6035.getClass(), "signature", null);
        setField(term6035, term6035.getClass(), "qualified", null);
        setField(term6035, term6035.getClass(), "scope", null);
        setField(term6035, term6035.getClass(), "_final", null);
        setField(term6035, term6035.getClass(), "included", null);
        setField(term6035, term6035.getClass(), "_native", null);
        setField(term6035, term6035.getClass(), "_synchronized", null);
        setField(term6035, term6035.getClass(), "_static", null);
        setField(term6035, term6035.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVarArgs", argTypes, term6035, args);
    }

};


