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

public class OpenSearchDataSinkConfiguration_setRegion_196544207513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5133;

    public OpenSearchDataSinkConfiguration_setRegion_196544207513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5234 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term5233 = ((Class) term5234).getDeclaredField((String) "SERVERLESS");
        ((Field) term5233).setAccessible(true);
        Object enum11 = ((Field) term5233).get((Object) null);
        term5133 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term5133, term5133.getClass(), "endpoint", "xrwlQZdwCp");
        setField(term5133, term5133.getClass(), "index", "IDCWpPLRkE");
        setField(term5133, term5133.getClass(), "region", "nyiiPDVjAc");
        setField(term5133, term5133.getClass(), "openSearchType", enum11);
        setLongField(term5133, term5133.getClass(), "bulkFlushIntervalMillis", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setRegion", argTypes, term5133, args);
    }

};


