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

public class HttpClientVerify_head_195066095216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18902;

    public HttpClientVerify_head_195066095216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18915 = new ArrayList();
        ((ArrayList) term18915).add((Object)null);
        ((ArrayList) term18915).add((Object)null);
        ((ArrayList) term18915).add((Object)null);
        ((ArrayList) term18915).add((Object)null);
        ((ArrayList) term18915).add((Object)null);
        ((ArrayList) term18915).add((Object)null);
        term18902 = newInstance(Class.forName("com.pgssoft.httpclient.HttpClientVerify"));
        setField(term18902, term18902.getClass(), "defaultHost", "OEXDRUKcFl");
        setField(term18902, term18902.getClass(), "requests", term18915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.HttpClientVerify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "head", argTypes, term18902, args);
    }

};


