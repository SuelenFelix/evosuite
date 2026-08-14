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

public class SetHeaderAction_enrichResponse_16050591431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4926;
     Object term4951;

    public SetHeaderAction_enrichResponse_16050591431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4926 = newInstance(Class.forName("com.pgssoft.httpclient.internal.action.SetHeaderAction"));
        setField(term4926, term4926.getClass(), "key", "SzjVpOQTyS");
        setField(term4926, term4926.getClass(), "value", "MjGYSRKTNF");
        HashMap term4953 = new HashMap();
        term4951 = newInstance(Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder"));
        Object term4958 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term4959 = (byte[]) newByteArray(0);
        setIntField(term4951, term4951.getClass(), "statusCode", -616727354);
        setField(term4951, term4951.getClass(), "headers", term4953);
        setField(term4958, term4958.getClass(), "hb", term4959);
        setIntField(term4958, term4958.getClass(), "offset", 0);
        setBooleanField(term4958, term4958.getClass(), "isReadOnly", false);
        setBooleanField(term4958, term4958.getClass(), "bigEndian", true);
        setBooleanField(term4958, term4958.getClass(), "nativeByteOrder", false);
        setIntField(term4958, term4958.getClass(), "mark", -1);
        setIntField(term4958, term4958.getClass(), "position", 0);
        setIntField(term4958, term4958.getClass(), "limit", 0);
        setIntField(term4958, term4958.getClass(), "capacity", 0);
        setLongField(term4958, term4958.getClass(), "address", 16L);
        setField(term4951, term4951.getClass(), "bodyBytes", term4958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.action.SetHeaderAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.MockedServerResponse$Builder");
        Object[] args = new Object[1];
        args[0] = term4951;
        callMethod(klass, "enrichResponse", argTypes, term4926, args);
    }

};


