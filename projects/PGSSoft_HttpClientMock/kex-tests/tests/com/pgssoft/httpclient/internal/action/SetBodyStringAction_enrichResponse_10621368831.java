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

public class SetBodyStringAction_enrichResponse_10621368831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4840;
     Object term4853;

    public SetBodyStringAction_enrichResponse_10621368831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4840 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.SetBodyStringAction"));
        setField(term4840, term4840.getClass(), "content", "xxtlPwDYFs");
        setField(term4840, term4840.getClass(), "charset", null);
        HashMap term4855 = new HashMap();
        term4853 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term4860 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4861 = (byte[]) newByteArray(0);
        setIntField(term4853, term4853.getClass(), "statusCode", -1922583790);
        setField(term4853, term4853.getClass(), "headers", term4855);
        setField(term4860, term4860.getClass(), "hb", term4861);
        setIntField(term4860, term4860.getClass(), "offset", 0);
        setBooleanField(term4860, term4860.getClass(), "isReadOnly", false);
        setBooleanField(term4860, term4860.getClass(), "bigEndian", true);
        setBooleanField(term4860, term4860.getClass(), "nativeByteOrder", false);
        setIntField(term4860, term4860.getClass(), "mark", -1);
        setIntField(term4860, term4860.getClass(), "position", 0);
        setIntField(term4860, term4860.getClass(), "limit", 0);
        setIntField(term4860, term4860.getClass(), "capacity", 0);
        setLongField(term4860, term4860.getClass(), "address", 16L);
        setField(term4853, term4853.getClass(), "bodyBytes", term4860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.action.SetBodyStringAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Object[] args = new Object[1];
        args[0] = term4853;
        callMethod(klass, "enrichResponse", argTypes, term4840, args);
    }

};


