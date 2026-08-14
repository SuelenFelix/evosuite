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

public class OpenSearchDataSinkConfiguration_getIndex_17121187736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2234;

    public OpenSearchDataSinkConfiguration_getIndex_17121187736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2322 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term2321 = ((Class) term2322).getDeclaredField((String) "PROVISIONED");
        ((Field) term2321).setAccessible(true);
        Object enum5 = ((Field) term2321).get((Object) null);
        term2234 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term2234, term2234.getClass(), "endpoint", "uuaPigETmJ");
        setField(term2234, term2234.getClass(), "index", "MxlszYVzRf");
        setField(term2234, term2234.getClass(), "region", "LQFpaHEwXR");
        setField(term2234, term2234.getClass(), "openSearchType", enum5);
        setLongField(term2234, term2234.getClass(), "bulkFlushIntervalMillis", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term2234, args);
    }

};


