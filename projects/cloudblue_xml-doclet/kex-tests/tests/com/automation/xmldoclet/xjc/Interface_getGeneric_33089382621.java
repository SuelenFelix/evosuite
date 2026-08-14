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

public class Interface_getGeneric_33089382621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13992;

    public Interface_getGeneric_33089382621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13992 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term13992, term13992.getClass(), "comment", null);
        setField(term13992, term13992.getClass(), "tag", null);
        setField(term13992, term13992.getClass(), "generic", null);
        setField(term13992, term13992.getClass(), "_interface", null);
        setField(term13992, term13992.getClass(), "method", null);
        setField(term13992, term13992.getClass(), "annotation", null);
        setField(term13992, term13992.getClass(), "field", null);
        setField(term13992, term13992.getClass(), "name", null);
        setField(term13992, term13992.getClass(), "qualified", null);
        setField(term13992, term13992.getClass(), "scope", null);
        setField(term13992, term13992.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneric", argTypes, term13992, args);
    }

};


