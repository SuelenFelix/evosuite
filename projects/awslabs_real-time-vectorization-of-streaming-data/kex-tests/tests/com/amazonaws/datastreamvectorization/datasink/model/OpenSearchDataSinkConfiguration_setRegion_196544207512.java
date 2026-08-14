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

public class OpenSearchDataSinkConfiguration_setRegion_196544207512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5042;

    public OpenSearchDataSinkConfiguration_setRegion_196544207512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5143 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term5142 = ((Class) term5143).getDeclaredField((String) "SERVERLESS");
        ((Field) term5142).setAccessible(true);
        Object enum11 = ((Field) term5142).get((Object) null);
        term5042 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term5042, term5042.getClass(), "endpoint", "dWRymuLBtr");
        setField(term5042, term5042.getClass(), "index", "AijpHYOFuy");
        setField(term5042, term5042.getClass(), "region", "SbAoxhfrkn");
        setField(term5042, term5042.getClass(), "openSearchType", enum11);
        setLongField(term5042, term5042.getClass(), "bulkFlushIntervalMillis", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setRegion", argTypes, term5042, args);
    }

};


