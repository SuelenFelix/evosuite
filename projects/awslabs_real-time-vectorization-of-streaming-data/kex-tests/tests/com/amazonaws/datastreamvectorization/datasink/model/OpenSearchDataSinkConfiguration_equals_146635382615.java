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

public class OpenSearchDataSinkConfiguration_equals_146635382615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6842;
     Object term6900;

    public OpenSearchDataSinkConfiguration_equals_146635382615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6932 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term6931 = ((Class) term6932).getDeclaredField((String) "SERVERLESS");
        ((Field) term6931).setAccessible(true);
        Object enum15 = ((Field) term6931).get((Object) null);
        term6842 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term6842, term6842.getClass(), "endpoint", "UlajhuVLaP");
        setField(term6842, term6842.getClass(), "index", "gGSMzuGICf");
        setField(term6842, term6842.getClass(), "region", "hxCBltsObl");
        setField(term6842, term6842.getClass(), "openSearchType", enum15);
        setLongField(term6842, term6842.getClass(), "bulkFlushIntervalMillis", 2535595959091595249L);
        term6900 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6900;
        callMethod(klass, "equals", argTypes, term6842, args);
    }

};


