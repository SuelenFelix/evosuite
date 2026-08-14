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

public class Interface_getField_22892925325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13996;

    public Interface_getField_22892925325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13996 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term13996, term13996.getClass(), "comment", null);
        setField(term13996, term13996.getClass(), "tag", null);
        setField(term13996, term13996.getClass(), "generic", null);
        setField(term13996, term13996.getClass(), "_interface", null);
        setField(term13996, term13996.getClass(), "method", null);
        setField(term13996, term13996.getClass(), "annotation", null);
        setField(term13996, term13996.getClass(), "field", null);
        setField(term13996, term13996.getClass(), "name", null);
        setField(term13996, term13996.getClass(), "qualified", null);
        setField(term13996, term13996.getClass(), "scope", null);
        setField(term13996, term13996.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getField", argTypes, term13996, args);
    }

};


