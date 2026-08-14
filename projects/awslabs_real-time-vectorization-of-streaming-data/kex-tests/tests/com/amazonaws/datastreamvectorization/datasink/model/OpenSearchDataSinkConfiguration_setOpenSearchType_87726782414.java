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

public class OpenSearchDataSinkConfiguration_setOpenSearchType_87726782414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5615;
     Object enum13;

    public OpenSearchDataSinkConfiguration_setOpenSearchType_87726782414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5723 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term5722 = ((Class) term5723).getDeclaredField((String) "PROVISIONED");
        ((Field) term5722).setAccessible(true);
        Object enum12 = ((Field) term5722).get((Object) null);
        term5615 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term5615, term5615.getClass(), "endpoint", "wSQxaModmm");
        setField(term5615, term5615.getClass(), "index", "UlajhuVLaP");
        setField(term5615, term5615.getClass(), "region", "gGSMzuGICf");
        setField(term5615, term5615.getClass(), "openSearchType", enum12);
        setLongField(term5615, term5615.getClass(), "bulkFlushIntervalMillis", -2813493605142626659L);
        Class<? extends Object> term6098 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term6097 = ((Class) term6098).getDeclaredField((String) "SERVERLESS");
        ((Field) term6097).setAccessible(true);
        enum13 = ((Field) term6097).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "setOpenSearchType", argTypes, term5615, args);
    }

};


