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

public class HttpClientVerify_get_102478917013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18821;

    public HttpClientVerify_get_102478917013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18834 = new ArrayList();
        ((ArrayList) term18834).add((Object)null);
        ((ArrayList) term18834).add((Object)null);
        ((ArrayList) term18834).add((Object)null);
        ((ArrayList) term18834).add((Object)null);
        ((ArrayList) term18834).add((Object)null);
        term18821 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerify"));
        setField(term18821, term18821.getClass(), "defaultHost", "fztQhjqwdP");
        setField(term18821, term18821.getClass(), "requests", term18834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term18821, args);
    }

};


