package com.pgssoft.httpclient;

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
import static com.pgssoft.httpclient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HttpClientVerify_newRule_19712043082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18378;

    public HttpClientVerify_newRule_19712043082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18391 = new ArrayList();
        ((ArrayList) term18391).add((Object)null);
        ((ArrayList) term18391).add((Object)null);
        term18378 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerify"));
        setField(term18378, term18378.getClass(), "defaultHost", "xOcJIiQQDu");
        setField(term18378, term18378.getClass(), "requests", term18391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerify");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "GVizqqzXpy";
        args[1] = "JqXGgAhZPl";
        callMethod(klass, "newRule", argTypes, term18378, args);
    }

};


