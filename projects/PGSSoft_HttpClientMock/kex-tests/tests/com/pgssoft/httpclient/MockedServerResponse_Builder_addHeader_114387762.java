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
import java.util.HashMap;
import java.lang.Object;

public class MockedServerResponse_Builder_addHeader_114387762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13192;

    public MockedServerResponse_Builder_addHeader_114387762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13194 = new HashMap();
        term13192 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term13199 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term13200 = (byte[]) newByteArray(0);
        setIntField(term13192, term13192.getClass(), "statusCode", -1748391876);
        setField(term13192, term13192.getClass(), "headers", term13194);
        setField(term13199, term13199.getClass(), "hb", term13200);
        setIntField(term13199, term13199.getClass(), "offset", 0);
        setBooleanField(term13199, term13199.getClass(), "isReadOnly", false);
        setBooleanField(term13199, term13199.getClass(), "bigEndian", true);
        setBooleanField(term13199, term13199.getClass(), "nativeByteOrder", false);
        setIntField(term13199, term13199.getClass(), "mark", -1);
        setIntField(term13199, term13199.getClass(), "position", 0);
        setIntField(term13199, term13199.getClass(), "limit", 0);
        setIntField(term13199, term13199.getClass(), "capacity", 0);
        setLongField(term13199, term13199.getClass(), "address", 16L);
        setField(term13192, term13192.getClass(), "bodyBytes", term13199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "UiUYnPrcCi";
        args[1] = "UoYtihxVaS";
        callMethod(klass, "addHeader", argTypes, term13192, args);
    }

};


