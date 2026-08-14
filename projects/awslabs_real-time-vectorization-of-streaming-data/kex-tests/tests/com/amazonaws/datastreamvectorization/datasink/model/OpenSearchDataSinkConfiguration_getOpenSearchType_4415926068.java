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

public class OpenSearchDataSinkConfiguration_getOpenSearchType_4415926068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;

    public OpenSearchDataSinkConfiguration_getOpenSearchType_4415926068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3245 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term3244 = ((Class) term3245).getDeclaredField((String) "SERVERLESS");
        ((Field) term3244).setAccessible(true);
        Object enum7 = ((Field) term3244).get((Object) null);
        term3156 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term3156, term3156.getClass(), "endpoint", "tbcdzjIfER");
        setField(term3156, term3156.getClass(), "index", "HyxfbSQYBe");
        setField(term3156, term3156.getClass(), "region", "pCTimMblYc");
        setField(term3156, term3156.getClass(), "openSearchType", enum7);
        setLongField(term3156, term3156.getClass(), "bulkFlushIntervalMillis", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpenSearchType", argTypes, term3156, args);
    }

};


