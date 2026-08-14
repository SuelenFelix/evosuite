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
import java.lang.Long;

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_bulkFlushIntervalMillis_212450790213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13590;
     Object term13592;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_bulkFlushIntervalMillis_212450790213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13590 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term13590, term13590.getClass(), "endpoint", null);
        setField(term13590, term13590.getClass(), "index", null);
        setField(term13590, term13590.getClass(), "region", null);
        setField(term13590, term13590.getClass(), "openSearchType", null);
        setLongField(term13590, term13590.getClass(), "bulkFlushIntervalMillis", 0L);
        term13592 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13592;
        callMethod(klass, "bulkFlushIntervalMillis", argTypes, term13590, args);
    }

};


