package com.amazonaws.datastreamvectorization.datasink.model;

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
import static com.amazonaws.datastreamvectorization.datasink.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class OpenSearchDataSinkConfiguration_getEndpoint_8914309486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;

    public OpenSearchDataSinkConfiguration_getEndpoint_8914309486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1951 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term1950 = ((Class) term1951).getDeclaredField((String) "PROVISIONED");
        ((Field) term1950).setAccessible(true);
        Object enum4 = ((Field) term1950).get((Object) null);
        term1863 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term1863, term1863.getClass(), "endpoint", "LQFpaHEwXR");
        setField(term1863, term1863.getClass(), "index", "oVcInYnLWB");
        setField(term1863, term1863.getClass(), "region", "aJlieCFVtF");
        setField(term1863, term1863.getClass(), "openSearchType", enum4);
        setLongField(term1863, term1863.getClass(), "bulkFlushIntervalMillis", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndpoint", argTypes, term1863, args);
    }

};


