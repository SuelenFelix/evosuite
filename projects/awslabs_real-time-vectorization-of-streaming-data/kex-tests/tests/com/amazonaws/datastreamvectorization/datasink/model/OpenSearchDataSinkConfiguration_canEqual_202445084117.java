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

public class OpenSearchDataSinkConfiguration_canEqual_202445084117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7394;
     Object term7451;

    public OpenSearchDataSinkConfiguration_canEqual_202445084117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7483 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term7482 = ((Class) term7483).getDeclaredField((String) "PROVISIONED");
        ((Field) term7482).setAccessible(true);
        Object enum16 = ((Field) term7482).get((Object) null);
        term7394 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration"));
        setField(term7394, term7394.getClass(), "endpoint", "jDtqGUpnZN");
        setField(term7394, term7394.getClass(), "index", "nGKItKLYNC");
        setField(term7394, term7394.getClass(), "region", "UiUYnPrcCi");
        setField(term7394, term7394.getClass(), "openSearchType", enum16);
        setLongField(term7394, term7394.getClass(), "bulkFlushIntervalMillis", -5476826692763582090L);
        term7451 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7451;
        callMethod(klass, "canEqual", argTypes, term7394, args);
    }

};


