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

public class Field_getConstant_43281763112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58158;

    public Field_getConstant_43281763112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58158 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term58158, term58158.getClass(), "type", null);
        setField(term58158, term58158.getClass(), "comment", null);
        setField(term58158, term58158.getClass(), "tag", null);
        setField(term58158, term58158.getClass(), "constant", null);
        setField(term58158, term58158.getClass(), "annotation", null);
        setField(term58158, term58158.getClass(), "name", null);
        setField(term58158, term58158.getClass(), "qualified", null);
        setField(term58158, term58158.getClass(), "scope", null);
        setField(term58158, term58158.getClass(), "_volatile", null);
        setField(term58158, term58158.getClass(), "_transient", null);
        setField(term58158, term58158.getClass(), "_static", null);
        setField(term58158, term58158.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstant", argTypes, term58158, args);
    }

};


