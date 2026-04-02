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

public class Enum_getClazz_5293126487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33245;

    public Enum_getClazz_5293126487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33245 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        setField(term33245, term33245.getClass(), "comment", null);
        setField(term33245, term33245.getClass(), "tag", null);
        setField(term33245, term33245.getClass(), "clazz", null);
        setField(term33245, term33245.getClass(), "_interface", null);
        setField(term33245, term33245.getClass(), "constant", null);
        setField(term33245, term33245.getClass(), "annotation", null);
        setField(term33245, term33245.getClass(), "name", null);
        setField(term33245, term33245.getClass(), "qualified", null);
        setField(term33245, term33245.getClass(), "scope", null);
        setField(term33245, term33245.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClazz", argTypes, term33245, args);
    }

};


