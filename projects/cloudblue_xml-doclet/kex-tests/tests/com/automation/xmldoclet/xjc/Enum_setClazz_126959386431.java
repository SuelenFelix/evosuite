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

public class Enum_setClazz_126959386431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37475;

    public Enum_setClazz_126959386431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37475 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term37475, term37475.getClass(), "comment", null);
        setField(term37475, term37475.getClass(), "tag", null);
        setField(term37475, term37475.getClass(), "clazz", null);
        setField(term37475, term37475.getClass(), "_interface", null);
        setField(term37475, term37475.getClass(), "constant", null);
        setField(term37475, term37475.getClass(), "annotation", null);
        setField(term37475, term37475.getClass(), "name", null);
        setField(term37475, term37475.getClass(), "qualified", null);
        setField(term37475, term37475.getClass(), "scope", null);
        setField(term37475, term37475.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClazz", argTypes, term37475, args);
    }

};


