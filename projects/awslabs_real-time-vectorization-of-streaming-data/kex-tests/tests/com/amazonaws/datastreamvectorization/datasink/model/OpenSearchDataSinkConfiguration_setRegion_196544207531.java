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

public class OpenSearchDataSinkConfiguration_setRegion_196544207531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8712;

    public OpenSearchDataSinkConfiguration_setRegion_196544207531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8712 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term8712, term8712.getClass(), "endpoint", null);
        setField(term8712, term8712.getClass(), "index", null);
        setField(term8712, term8712.getClass(), "region", null);
        setField(term8712, term8712.getClass(), "openSearchType", null);
        setLongField(term8712, term8712.getClass(), "bulkFlushIntervalMillis", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRegion", argTypes, term8712, args);
    }

};


