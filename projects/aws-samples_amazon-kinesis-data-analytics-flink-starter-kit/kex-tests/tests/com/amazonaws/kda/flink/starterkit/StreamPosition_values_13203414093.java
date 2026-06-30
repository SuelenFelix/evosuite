package com.amazonaws.kda.flink.starterkit;

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
import static com.amazonaws.kda.flink.starterkit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class StreamPosition_values_13203414093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public StreamPosition_values_13203414093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3892 = Class.forName((String) "com.amazonaws.kda.flink.starterkit.StreamPosition");
        Field term3891 = ((Class) term3892).getDeclaredField((String) "TRIM_HORIZON");
        ((Field) term3891).setAccessible(true);
        enum0 = ((Field) term3891).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.StreamPosition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum0, args);
    }

};


