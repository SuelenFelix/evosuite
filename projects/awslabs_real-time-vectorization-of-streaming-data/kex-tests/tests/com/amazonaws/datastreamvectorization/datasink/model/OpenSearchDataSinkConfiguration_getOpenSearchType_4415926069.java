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

public class OpenSearchDataSinkConfiguration_getOpenSearchType_4415926069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;

    public OpenSearchDataSinkConfiguration_getOpenSearchType_4415926069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3336 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term3335 = ((Class) term3336).getDeclaredField((String) "SERVERLESS");
        ((Field) term3335).setAccessible(true);
        Object enum7 = ((Field) term3335).get((Object) null);
        term3247 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term3247, term3247.getClass(), "endpoint", "xOEqzGAmDU");
        setField(term3247, term3247.getClass(), "index", "eZFUvlxvGV");
        setField(term3247, term3247.getClass(), "region", "BYqFIqCKAV");
        setField(term3247, term3247.getClass(), "openSearchType", enum7);
        setLongField(term3247, term3247.getClass(), "bulkFlushIntervalMillis", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpenSearchType", argTypes, term3247, args);
    }

};


