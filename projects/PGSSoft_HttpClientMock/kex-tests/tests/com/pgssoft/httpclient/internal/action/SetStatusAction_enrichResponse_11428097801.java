package com.pgssoft.httpclient.internal.action;

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
import static com.pgssoft.httpclient.internal.action.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class SetStatusAction_enrichResponse_11428097801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4794;
     Object term4796;

    public SetStatusAction_enrichResponse_11428097801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4794 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.SetStatusAction"));
        setIntField(term4794, term4794.getClass(), "status", 1484323161);
        HashMap term4798 = new HashMap();
        term4796 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term4803 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4804 = (byte[]) newByteArray(0);
        setIntField(term4796, term4796.getClass(), "statusCode", 391863371);
        setField(term4796, term4796.getClass(), "headers", term4798);
        setField(term4803, term4803.getClass(), "hb", term4804);
        setIntField(term4803, term4803.getClass(), "offset", 0);
        setBooleanField(term4803, term4803.getClass(), "isReadOnly", false);
        setBooleanField(term4803, term4803.getClass(), "bigEndian", true);
        setBooleanField(term4803, term4803.getClass(), "nativeByteOrder", false);
        setIntField(term4803, term4803.getClass(), "mark", -1);
        setIntField(term4803, term4803.getClass(), "position", 0);
        setIntField(term4803, term4803.getClass(), "limit", 0);
        setIntField(term4803, term4803.getClass(), "capacity", 0);
        setLongField(term4803, term4803.getClass(), "address", 16L);
        setField(term4796, term4796.getClass(), "bodyBytes", term4803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.action.SetStatusAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Object[] args = new Object[1];
        args[0] = term4796;
        callMethod(klass, "enrichResponse", argTypes, term4794, args);
    }

};


