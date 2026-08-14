package com.getindata.connectors.http.internal;

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
import static com.getindata.connectors.http.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ComposeHeaderPreprocessor_preprocessValueForHeader_3087486111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27257;

    public ComposeHeaderPreprocessor_preprocessValueForHeader_3087486111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27258 = new HashMap();
        term27257 = newInstance(Class.forName("com.getindata.connectors.http.internal.ComposeHeaderPreprocessor"));
        setField(term27257, term27257.getClass(), "valuePreprocessors", term27258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.ComposeHeaderPreprocessor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "qFGKIJjlmV";
        args[1] = "IHqvyhMtuM";
        callMethod(klass, "preprocessValueForHeader", argTypes, term27257, args);
    }

};


