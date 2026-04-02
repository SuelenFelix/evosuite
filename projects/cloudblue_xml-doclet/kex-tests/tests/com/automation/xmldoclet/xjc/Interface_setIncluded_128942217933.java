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

public class Interface_setIncluded_128942217933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14004;

    public Interface_setIncluded_128942217933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14004 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term14004, term14004.getClass(), "comment", null);
        setField(term14004, term14004.getClass(), "tag", null);
        setField(term14004, term14004.getClass(), "generic", null);
        setField(term14004, term14004.getClass(), "_interface", null);
        setField(term14004, term14004.getClass(), "method", null);
        setField(term14004, term14004.getClass(), "annotation", null);
        setField(term14004, term14004.getClass(), "field", null);
        setField(term14004, term14004.getClass(), "name", null);
        setField(term14004, term14004.getClass(), "qualified", null);
        setField(term14004, term14004.getClass(), "scope", null);
        setField(term14004, term14004.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIncluded", argTypes, term14004, args);
    }

};


