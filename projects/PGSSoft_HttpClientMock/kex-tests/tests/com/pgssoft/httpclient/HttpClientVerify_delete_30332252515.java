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

public class HttpClientVerify_delete_30332252515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18875;

    public HttpClientVerify_delete_30332252515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18888 = new ArrayList();
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        ((ArrayList) term18888).add((Object)null);
        term18875 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerify"));
        setField(term18875, term18875.getClass(), "defaultHost", "SJiQaLvSKv");
        setField(term18875, term18875.getClass(), "requests", term18888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "delete", argTypes, term18875, args);
    }

};


