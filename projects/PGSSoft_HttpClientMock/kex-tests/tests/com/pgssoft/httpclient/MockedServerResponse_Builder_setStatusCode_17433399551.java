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
import java.lang.Integer;

public class MockedServerResponse_Builder_setStatusCode_17433399551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13172;
     Object term13190;

    public MockedServerResponse_Builder_setStatusCode_17433399551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13174 = new HashMap();
        term13172 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term13179 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term13180 = (byte[]) newByteArray(0);
        setIntField(term13172, term13172.getClass(), "statusCode", 947897214);
        setField(term13172, term13172.getClass(), "headers", term13174);
        setField(term13179, term13179.getClass(), "hb", term13180);
        setIntField(term13179, term13179.getClass(), "offset", 0);
        setBooleanField(term13179, term13179.getClass(), "isReadOnly", false);
        setBooleanField(term13179, term13179.getClass(), "bigEndian", true);
        setBooleanField(term13179, term13179.getClass(), "nativeByteOrder", false);
        setIntField(term13179, term13179.getClass(), "mark", -1);
        setIntField(term13179, term13179.getClass(), "position", 0);
        setIntField(term13179, term13179.getClass(), "limit", 0);
        setIntField(term13179, term13179.getClass(), "capacity", 0);
        setLongField(term13179, term13179.getClass(), "address", 16L);
        setField(term13172, term13172.getClass(), "bodyBytes", term13179);
        term13190 = new Integer(1496340209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13190;
        callMethod(klass, "setStatusCode", argTypes, term13172, args);
    }

};


