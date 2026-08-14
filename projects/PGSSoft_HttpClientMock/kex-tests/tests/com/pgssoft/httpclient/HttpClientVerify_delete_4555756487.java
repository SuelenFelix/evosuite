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

public class HttpClientVerify_delete_4555756487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18597;

    public HttpClientVerify_delete_4555756487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18610 = new ArrayList();
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        term18597 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerify"));
        setField(term18597, term18597.getClass(), "defaultHost", "SPpkrGcPRr");
        setField(term18597, term18597.getClass(), "requests", term18610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "delete", argTypes, term18597, args);
    }

};


