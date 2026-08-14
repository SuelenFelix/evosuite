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

public class OpenSearchDataSinkConfiguration_validate_7751459823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;

    public OpenSearchDataSinkConfiguration_validate_7751459823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1027 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term1026 = ((Class) term1027).getDeclaredField((String) "PROVISIONED");
        ((Field) term1026).setAccessible(true);
        Object enum2 = ((Field) term1026).get((Object) null);
        term900 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term900, term900.getClass(), "endpoint", "MjGYSRKTNF");
        setField(term900, term900.getClass(), "index", "hRNSzYYIrc");
        setField(term900, term900.getClass(), "region", "RMFIsYGgne");
        setField(term900, term900.getClass(), "openSearchType", enum2);
        setLongField(term900, term900.getClass(), "bulkFlushIntervalMillis", 2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term900, args);
    }

};


