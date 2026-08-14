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

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_index_6035126542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10772;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_index_6035126542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10872 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term10871 = ((Class) term10872).getDeclaredField((String) "PROVISIONED");
        ((Field) term10871).setAccessible(true);
        Object enum24 = ((Field) term10871).get((Object) null);
        term10772 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term10772, term10772.getClass(), "endpoint", "nHXjMycHlU");
        setField(term10772, term10772.getClass(), "index", "ieCtQFdkii");
        setField(term10772, term10772.getClass(), "region", "dEnhdmILtU");
        setField(term10772, term10772.getClass(), "openSearchType", enum24);
        setLongField(term10772, term10772.getClass(), "bulkFlushIntervalMillis", -6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "index", argTypes, term10772, args);
    }

};


