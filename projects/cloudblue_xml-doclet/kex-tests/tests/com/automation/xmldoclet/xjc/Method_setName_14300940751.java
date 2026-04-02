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

public class Method_setName_14300940751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52191;

    public Method_setName_14300940751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52191 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term52191, term52191.getClass(), "comment", null);
        setField(term52191, term52191.getClass(), "tag", null);
        setField(term52191, term52191.getClass(), "parameter", null);
        setField(term52191, term52191.getClass(), "_return", null);
        setField(term52191, term52191.getClass(), "exception", null);
        setField(term52191, term52191.getClass(), "annotation", null);
        setField(term52191, term52191.getClass(), "name", null);
        setField(term52191, term52191.getClass(), "signature", null);
        setField(term52191, term52191.getClass(), "qualified", null);
        setField(term52191, term52191.getClass(), "scope", null);
        setField(term52191, term52191.getClass(), "_abstract", null);
        setField(term52191, term52191.getClass(), "_final", null);
        setField(term52191, term52191.getClass(), "included", null);
        setField(term52191, term52191.getClass(), "_native", null);
        setField(term52191, term52191.getClass(), "_synchronized", null);
        setField(term52191, term52191.getClass(), "_static", null);
        setField(term52191, term52191.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term52191, args);
    }

};


