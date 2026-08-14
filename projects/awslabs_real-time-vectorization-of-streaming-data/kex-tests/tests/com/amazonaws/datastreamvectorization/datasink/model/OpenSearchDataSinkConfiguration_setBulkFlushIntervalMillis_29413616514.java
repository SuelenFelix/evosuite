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
import java.lang.Long;

public class OpenSearchDataSinkConfiguration_setBulkFlushIntervalMillis_29413616514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6378;
     Object term6435;

    public OpenSearchDataSinkConfiguration_setBulkFlushIntervalMillis_29413616514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6468 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term6467 = ((Class) term6468).getDeclaredField((String) "PROVISIONED");
        ((Field) term6467).setAccessible(true);
        Object enum14 = ((Field) term6467).get((Object) null);
        term6378 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term6378, term6378.getClass(), "endpoint", "nyiiPDVjAc");
        setField(term6378, term6378.getClass(), "index", "aKnKipADSo");
        setField(term6378, term6378.getClass(), "region", "wSQxaModmm");
        setField(term6378, term6378.getClass(), "openSearchType", enum14);
        setLongField(term6378, term6378.getClass(), "bulkFlushIntervalMillis", -8885298608300233488L);
        term6435 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6435;
        callMethod(klass, "setBulkFlushIntervalMillis", argTypes, term6378, args);
    }

};


