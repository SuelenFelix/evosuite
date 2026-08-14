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

public class TypeInfo_setWildcard_181464462910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45246;

    public TypeInfo_setWildcard_181464462910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45246 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term45246, term45246.getClass(), "wildcard", null);
        setField(term45246, term45246.getClass(), "generic", null);
        setField(term45246, term45246.getClass(), "qualified", null);
        setField(term45246, term45246.getClass(), "dimension", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.Wildcard");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWildcard", argTypes, term45246, args);
    }

};


