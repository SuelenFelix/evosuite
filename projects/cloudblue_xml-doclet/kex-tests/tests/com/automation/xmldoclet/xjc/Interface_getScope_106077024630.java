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

public class Interface_getScope_106077024630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14001;

    public Interface_getScope_106077024630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14001 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term14001, term14001.getClass(), "comment", null);
        setField(term14001, term14001.getClass(), "tag", null);
        setField(term14001, term14001.getClass(), "generic", null);
        setField(term14001, term14001.getClass(), "_interface", null);
        setField(term14001, term14001.getClass(), "method", null);
        setField(term14001, term14001.getClass(), "annotation", null);
        setField(term14001, term14001.getClass(), "field", null);
        setField(term14001, term14001.getClass(), "name", null);
        setField(term14001, term14001.getClass(), "qualified", null);
        setField(term14001, term14001.getClass(), "scope", null);
        setField(term14001, term14001.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term14001, args);
    }

};


