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

public class Field_isTransient_117931084630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60694;

    public Field_isTransient_117931084630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60694 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        setField(term60694, term60694.getClass(), "type", null);
        setField(term60694, term60694.getClass(), "comment", null);
        setField(term60694, term60694.getClass(), "tag", null);
        setField(term60694, term60694.getClass(), "constant", null);
        setField(term60694, term60694.getClass(), "annotation", null);
        setField(term60694, term60694.getClass(), "name", null);
        setField(term60694, term60694.getClass(), "qualified", null);
        setField(term60694, term60694.getClass(), "scope", null);
        setField(term60694, term60694.getClass(), "_volatile", null);
        setField(term60694, term60694.getClass(), "_transient", null);
        setField(term60694, term60694.getClass(), "_static", null);
        setField(term60694, term60694.getClass(), "_final", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTransient", argTypes, term60694, args);
    }

};


