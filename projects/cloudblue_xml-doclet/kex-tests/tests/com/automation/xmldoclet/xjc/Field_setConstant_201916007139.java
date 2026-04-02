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

public class Field_setConstant_201916007139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61782;

    public Field_setConstant_201916007139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61782 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term61782, term61782.getClass(), "type", null);
        setField(term61782, term61782.getClass(), "comment", null);
        setField(term61782, term61782.getClass(), "tag", null);
        setField(term61782, term61782.getClass(), "constant", null);
        setField(term61782, term61782.getClass(), "annotation", null);
        setField(term61782, term61782.getClass(), "name", null);
        setField(term61782, term61782.getClass(), "qualified", null);
        setField(term61782, term61782.getClass(), "scope", null);
        setField(term61782, term61782.getClass(), "_volatile", null);
        setField(term61782, term61782.getClass(), "_transient", null);
        setField(term61782, term61782.getClass(), "_static", null);
        setField(term61782, term61782.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setConstant", argTypes, term61782, args);
    }

};


