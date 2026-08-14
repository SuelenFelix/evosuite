package com.getindata.connectors.http;

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
import static com.getindata.connectors.http.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LookupArg_equals_647542652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3558;
     Object term3583;

    public LookupArg_equals_647542652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3558 = newInstance(Class.forName("com.getindata.connectors.http.LookupArg"));
        setField(term3558, term3558.getClass(), "argName", "vrQLuWIDJX");
        setField(term3558, term3558.getClass(), "argValue", "flxyYxBRtu");
        term3583 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.LookupArg");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3583;
        callMethod(klass, "equals", argTypes, term3558, args);
    }

};


