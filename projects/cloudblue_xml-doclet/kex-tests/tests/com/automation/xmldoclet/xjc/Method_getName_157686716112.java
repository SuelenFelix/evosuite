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

public class Method_getName_157686716112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49824;

    public Method_getName_157686716112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49824 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term49824, term49824.getClass(), "comment", null);
        setField(term49824, term49824.getClass(), "tag", null);
        setField(term49824, term49824.getClass(), "parameter", null);
        setField(term49824, term49824.getClass(), "_return", null);
        setField(term49824, term49824.getClass(), "exception", null);
        setField(term49824, term49824.getClass(), "annotation", null);
        setField(term49824, term49824.getClass(), "name", null);
        setField(term49824, term49824.getClass(), "signature", null);
        setField(term49824, term49824.getClass(), "qualified", null);
        setField(term49824, term49824.getClass(), "scope", null);
        setField(term49824, term49824.getClass(), "_abstract", null);
        setField(term49824, term49824.getClass(), "_final", null);
        setField(term49824, term49824.getClass(), "included", null);
        setField(term49824, term49824.getClass(), "_native", null);
        setField(term49824, term49824.getClass(), "_synchronized", null);
        setField(term49824, term49824.getClass(), "_static", null);
        setField(term49824, term49824.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term49824, args);
    }

};


