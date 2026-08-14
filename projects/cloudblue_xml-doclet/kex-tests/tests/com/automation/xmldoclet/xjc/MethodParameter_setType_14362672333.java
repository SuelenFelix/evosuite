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

public class MethodParameter_setType_14362672333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37148;

    public MethodParameter_setType_14362672333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37148 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        setField(term37148, term37148.getClass(), "type", null);
        setField(term37148, term37148.getClass(), "annotation", null);
        setField(term37148, term37148.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.MethodParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term37148, args);
    }

};


