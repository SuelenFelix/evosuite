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

public class Method_isVarArgs_17029773361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52201;

    public Method_isVarArgs_17029773361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52201 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term52201, term52201.getClass(), "comment", null);
        setField(term52201, term52201.getClass(), "tag", null);
        setField(term52201, term52201.getClass(), "parameter", null);
        setField(term52201, term52201.getClass(), "_return", null);
        setField(term52201, term52201.getClass(), "exception", null);
        setField(term52201, term52201.getClass(), "annotation", null);
        setField(term52201, term52201.getClass(), "name", null);
        setField(term52201, term52201.getClass(), "signature", null);
        setField(term52201, term52201.getClass(), "qualified", null);
        setField(term52201, term52201.getClass(), "scope", null);
        setField(term52201, term52201.getClass(), "_abstract", null);
        setField(term52201, term52201.getClass(), "_final", null);
        setField(term52201, term52201.getClass(), "included", null);
        setField(term52201, term52201.getClass(), "_native", null);
        setField(term52201, term52201.getClass(), "_synchronized", null);
        setField(term52201, term52201.getClass(), "_static", null);
        setField(term52201, term52201.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isVarArgs", argTypes, term52201, args);
    }

};


