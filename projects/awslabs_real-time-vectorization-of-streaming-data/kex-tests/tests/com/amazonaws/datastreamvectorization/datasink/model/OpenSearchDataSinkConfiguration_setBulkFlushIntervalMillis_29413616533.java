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

public class OpenSearchDataSinkConfiguration_setBulkFlushIntervalMillis_29413616533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8716;
     Object term8718;

    public OpenSearchDataSinkConfiguration_setBulkFlushIntervalMillis_29413616533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8716 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term8716, term8716.getClass(), "endpoint", null);
        setField(term8716, term8716.getClass(), "index", null);
        setField(term8716, term8716.getClass(), "region", null);
        setField(term8716, term8716.getClass(), "openSearchType", null);
        setLongField(term8716, term8716.getClass(), "bulkFlushIntervalMillis", 0L);
        term8718 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8718;
        callMethod(klass, "setBulkFlushIntervalMillis", argTypes, term8716, args);
    }

};


