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

public class MockedServerResponse_Builder_build_19622811304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13272;

    public MockedServerResponse_Builder_build_19622811304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13274 = new HashMap();
        term13272 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term13279 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term13280 = (byte[]) newByteArray(0);
        setIntField(term13272, term13272.getClass(), "statusCode", 1707220033);
        setField(term13272, term13272.getClass(), "headers", term13274);
        setField(term13279, term13279.getClass(), "hb", term13280);
        setIntField(term13279, term13279.getClass(), "offset", 0);
        setBooleanField(term13279, term13279.getClass(), "isReadOnly", false);
        setBooleanField(term13279, term13279.getClass(), "bigEndian", true);
        setBooleanField(term13279, term13279.getClass(), "nativeByteOrder", false);
        setIntField(term13279, term13279.getClass(), "mark", -1);
        setIntField(term13279, term13279.getClass(), "position", 0);
        setIntField(term13279, term13279.getClass(), "limit", 0);
        setIntField(term13279, term13279.getClass(), "capacity", 0);
        setLongField(term13279, term13279.getClass(), "address", 16L);
        setField(term13272, term13272.getClass(), "bodyBytes", term13279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13272, args);
    }

};


