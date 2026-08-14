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

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_endpoint_11174336811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10288;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_endpoint_11174336811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10388 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term10387 = ((Class) term10388).getDeclaredField((String) "PROVISIONED");
        ((Field) term10387).setAccessible(true);
        Object enum23 = ((Field) term10387).get((Object) null);
        term10288 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term10288, term10288.getClass(), "endpoint", "YRHGsAkhxb");
        setField(term10288, term10288.getClass(), "index", "ffYhPOzlUs");
        setField(term10288, term10288.getClass(), "region", "MLqYREekMl");
        setField(term10288, term10288.getClass(), "openSearchType", enum23);
        setLongField(term10288, term10288.getClass(), "bulkFlushIntervalMillis", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "endpoint", argTypes, term10288, args);
    }

};


