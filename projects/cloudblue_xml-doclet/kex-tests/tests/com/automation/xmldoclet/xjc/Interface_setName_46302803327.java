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

public class Interface_setName_46302803327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13998;

    public Interface_setName_46302803327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13998 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term13998, term13998.getClass(), "comment", null);
        setField(term13998, term13998.getClass(), "tag", null);
        setField(term13998, term13998.getClass(), "generic", null);
        setField(term13998, term13998.getClass(), "_interface", null);
        setField(term13998, term13998.getClass(), "method", null);
        setField(term13998, term13998.getClass(), "annotation", null);
        setField(term13998, term13998.getClass(), "field", null);
        setField(term13998, term13998.getClass(), "name", null);
        setField(term13998, term13998.getClass(), "qualified", null);
        setField(term13998, term13998.getClass(), "scope", null);
        setField(term13998, term13998.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term13998, args);
    }

};


