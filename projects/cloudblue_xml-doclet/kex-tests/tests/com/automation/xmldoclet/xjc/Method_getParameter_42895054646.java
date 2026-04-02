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

public class Method_getParameter_42895054646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52186;

    public Method_getParameter_42895054646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52186 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term52186, term52186.getClass(), "comment", null);
        setField(term52186, term52186.getClass(), "tag", null);
        setField(term52186, term52186.getClass(), "parameter", null);
        setField(term52186, term52186.getClass(), "_return", null);
        setField(term52186, term52186.getClass(), "exception", null);
        setField(term52186, term52186.getClass(), "annotation", null);
        setField(term52186, term52186.getClass(), "name", null);
        setField(term52186, term52186.getClass(), "signature", null);
        setField(term52186, term52186.getClass(), "qualified", null);
        setField(term52186, term52186.getClass(), "scope", null);
        setField(term52186, term52186.getClass(), "_abstract", null);
        setField(term52186, term52186.getClass(), "_final", null);
        setField(term52186, term52186.getClass(), "included", null);
        setField(term52186, term52186.getClass(), "_native", null);
        setField(term52186, term52186.getClass(), "_synchronized", null);
        setField(term52186, term52186.getClass(), "_static", null);
        setField(term52186, term52186.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameter", argTypes, term52186, args);
    }

};


