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

public class DocletOption_process_194882155317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1097;

    public DocletOption_process_194882155317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1097 = newInstance(Class.forName("com.automation.xmldoclet.util.DocletOption"));
        setField(term1097, term1097.getClass(), "names", null);
        setField(term1097, term1097.getClass(), "parameters", null);
        setField(term1097, term1097.getClass(), "description", null);
        setIntField(term1097, term1097.getClass(), "argumentCount", 0);
        setField(term1097, term1097.getClass(), "processor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.util.DocletOption");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "process", argTypes, term1097, args);
    }

};


