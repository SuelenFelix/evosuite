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

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_region_20301176483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11256;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_region_20301176483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11357 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term11356 = ((Class) term11357).getDeclaredField((String) "SERVERLESS");
        ((Field) term11356).setAccessible(true);
        Object enum25 = ((Field) term11356).get((Object) null);
        term11256 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term11256, term11256.getClass(), "endpoint", "eqJfYWRaEL");
        setField(term11256, term11256.getClass(), "index", "fhkbdRViHi");
        setField(term11256, term11256.getClass(), "region", "uWHnvSvaPl");
        setField(term11256, term11256.getClass(), "openSearchType", enum25);
        setLongField(term11256, term11256.getClass(), "bulkFlushIntervalMillis", -4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "region", argTypes, term11256, args);
    }

};


