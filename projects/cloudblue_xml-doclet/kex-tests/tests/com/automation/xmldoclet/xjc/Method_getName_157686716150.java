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

public class Method_getName_157686716150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52190;

    public Method_getName_157686716150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52190 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term52190, term52190.getClass(), "comment", null);
        setField(term52190, term52190.getClass(), "tag", null);
        setField(term52190, term52190.getClass(), "parameter", null);
        setField(term52190, term52190.getClass(), "_return", null);
        setField(term52190, term52190.getClass(), "exception", null);
        setField(term52190, term52190.getClass(), "annotation", null);
        setField(term52190, term52190.getClass(), "name", null);
        setField(term52190, term52190.getClass(), "signature", null);
        setField(term52190, term52190.getClass(), "qualified", null);
        setField(term52190, term52190.getClass(), "scope", null);
        setField(term52190, term52190.getClass(), "_abstract", null);
        setField(term52190, term52190.getClass(), "_final", null);
        setField(term52190, term52190.getClass(), "included", null);
        setField(term52190, term52190.getClass(), "_native", null);
        setField(term52190, term52190.getClass(), "_synchronized", null);
        setField(term52190, term52190.getClass(), "_static", null);
        setField(term52190, term52190.getClass(), "varArgs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term52190, args);
    }

};


