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

public class Method_isAbstract_90283041355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52195;

    public Method_isAbstract_90283041355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52195 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term52195, term52195.getClass(), "comment", null);
        setField(term52195, term52195.getClass(), "tag", null);
        setField(term52195, term52195.getClass(), "parameter", null);
        setField(term52195, term52195.getClass(), "_return", null);
        setField(term52195, term52195.getClass(), "exception", null);
        setField(term52195, term52195.getClass(), "annotation", null);
        setField(term52195, term52195.getClass(), "name", null);
        setField(term52195, term52195.getClass(), "signature", null);
        setField(term52195, term52195.getClass(), "qualified", null);
        setField(term52195, term52195.getClass(), "scope", null);
        setField(term52195, term52195.getClass(), "_abstract", null);
        setField(term52195, term52195.getClass(), "_final", null);
        setField(term52195, term52195.getClass(), "included", null);
        setField(term52195, term52195.getClass(), "_native", null);
        setField(term52195, term52195.getClass(), "_synchronized", null);
        setField(term52195, term52195.getClass(), "_static", null);
        setField(term52195, term52195.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAbstract", argTypes, term52195, args);
    }

};


