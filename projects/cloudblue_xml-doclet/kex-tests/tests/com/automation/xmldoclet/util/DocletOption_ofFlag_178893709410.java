package com.automation.xmldoclet.util;

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
import static com.automation.xmldoclet.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DocletOption_ofFlag_178893709410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;

    public DocletOption_ofFlag_178893709410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term1083, term1083.getClass(), "names", null);
        setField(term1083, term1083.getClass(), "parameters", null);
        setField(term1083, term1083.getClass(), "description", null);
        setIntField(term1083, term1083.getClass(), "argumentCount", 0);
        setField(term1083, term1083.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Runnable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "ofFlag", argTypes, term1083, args);
    }

};


