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

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_toString_21296851177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13120;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_toString_21296851177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13208 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term13207 = ((Class) term13208).getDeclaredField((String) "PROVISIONED");
        ((Field) term13207).setAccessible(true);
        Object enum29 = ((Field) term13207).get((Object) null);
        term13120 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term13120, term13120.getClass(), "endpoint", "oVgzLbrsFr");
        setField(term13120, term13120.getClass(), "index", "vQVyKLdtaz");
        setField(term13120, term13120.getClass(), "region", "OWKQODBLzb");
        setField(term13120, term13120.getClass(), "openSearchType", enum29);
        setLongField(term13120, term13120.getClass(), "bulkFlushIntervalMillis", 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13120, args);
    }

};


