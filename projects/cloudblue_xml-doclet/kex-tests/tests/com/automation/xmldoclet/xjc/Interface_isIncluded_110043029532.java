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

public class Interface_isIncluded_110043029532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14003;

    public Interface_isIncluded_110043029532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14003 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Interface"));
        setField(term14003, term14003.getClass(), "comment", null);
        setField(term14003, term14003.getClass(), "tag", null);
        setField(term14003, term14003.getClass(), "generic", null);
        setField(term14003, term14003.getClass(), "_interface", null);
        setField(term14003, term14003.getClass(), "method", null);
        setField(term14003, term14003.getClass(), "annotation", null);
        setField(term14003, term14003.getClass(), "field", null);
        setField(term14003, term14003.getClass(), "name", null);
        setField(term14003, term14003.getClass(), "qualified", null);
        setField(term14003, term14003.getClass(), "scope", null);
        setField(term14003, term14003.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Interface");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIncluded", argTypes, term14003, args);
    }

};


