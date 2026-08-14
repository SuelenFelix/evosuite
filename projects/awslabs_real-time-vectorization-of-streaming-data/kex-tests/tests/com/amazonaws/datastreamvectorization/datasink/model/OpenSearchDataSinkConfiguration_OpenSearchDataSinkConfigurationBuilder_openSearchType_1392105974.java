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

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_openSearchType_1392105974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11738;
     Object enum26;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_openSearchType_1392105974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11827 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term11826 = ((Class) term11827).getDeclaredField((String) "SERVERLESS");
        ((Field) term11826).setAccessible(true);
        enum26 = ((Field) term11826).get((Object) null);
        term11738 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term11738, term11738.getClass(), "endpoint", "TJmVBGfTML");
        setField(term11738, term11738.getClass(), "index", "tPlsykYBqO");
        setField(term11738, term11738.getClass(), "region", "bLPjGVBhlX");
        setField(term11738, term11738.getClass(), "openSearchType", enum26);
        setLongField(term11738, term11738.getClass(), "bulkFlushIntervalMillis", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Object[] args = new Object[1];
        args[0] = enum26;
        callMethod(klass, "openSearchType", argTypes, term11738, args);
    }

};


