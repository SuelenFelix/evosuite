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

public class OpenSearchDataSinkConfiguration_setOpenSearchType_87726782413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5524;
     Object enum13;

    public OpenSearchDataSinkConfiguration_setOpenSearchType_87726782413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5632 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term5631 = ((Class) term5632).getDeclaredField((String) "PROVISIONED");
        ((Field) term5631).setAccessible(true);
        Object enum12 = ((Field) term5631).get((Object) null);
        term5524 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term5524, term5524.getClass(), "endpoint", "Ghbwtircqb");
        setField(term5524, term5524.getClass(), "index", "xrwlQZdwCp");
        setField(term5524, term5524.getClass(), "region", "IDCWpPLRkE");
        setField(term5524, term5524.getClass(), "openSearchType", enum12);
        setLongField(term5524, term5524.getClass(), "bulkFlushIntervalMillis", -2813493605142626659L);
        Class<? extends Object> term6007 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term6006 = ((Class) term6007).getDeclaredField((String) "SERVERLESS");
        ((Field) term6006).setAccessible(true);
        enum13 = ((Field) term6006).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Object[] args = new Object[1];
        args[0] = enum13;
        callMethod(klass, "setOpenSearchType", argTypes, term5524, args);
    }

};


