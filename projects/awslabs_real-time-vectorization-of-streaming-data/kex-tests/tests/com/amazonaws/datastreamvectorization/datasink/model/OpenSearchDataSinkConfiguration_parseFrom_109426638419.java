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

public class OpenSearchDataSinkConfiguration_parseFrom_109426638419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8688;

    public OpenSearchDataSinkConfiguration_parseFrom_109426638419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8688 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term8688, term8688.getClass(), "endpoint", null);
        setField(term8688, term8688.getClass(), "index", null);
        setField(term8688, term8688.getClass(), "region", null);
        setField(term8688, term8688.getClass(), "openSearchType", null);
        setLongField(term8688, term8688.getClass(), "bulkFlushIntervalMillis", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseFrom", argTypes, term8688, args);
    }

};


