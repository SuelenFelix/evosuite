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

public class MockedServerResponse_Builder_setBodyBytes_18418881633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13254;

    public MockedServerResponse_Builder_setBodyBytes_18418881633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13256 = new HashMap();
        term13254 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term13261 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term13262 = (byte[]) newByteArray(0);
        setIntField(term13254, term13254.getClass(), "statusCode", 43258317);
        setField(term13254, term13254.getClass(), "headers", term13256);
        setField(term13261, term13261.getClass(), "hb", term13262);
        setIntField(term13261, term13261.getClass(), "offset", 0);
        setBooleanField(term13261, term13261.getClass(), "isReadOnly", false);
        setBooleanField(term13261, term13261.getClass(), "bigEndian", true);
        setBooleanField(term13261, term13261.getClass(), "nativeByteOrder", false);
        setIntField(term13261, term13261.getClass(), "mark", -1);
        setIntField(term13261, term13261.getClass(), "position", 0);
        setIntField(term13261, term13261.getClass(), "limit", 0);
        setIntField(term13261, term13261.getClass(), "capacity", 0);
        setLongField(term13261, term13261.getClass(), "address", 16L);
        setField(term13254, term13254.getClass(), "bodyBytes", term13261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBodyBytes", argTypes, term13254, args);
    }

};


