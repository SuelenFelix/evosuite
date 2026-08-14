package com.rtbhouse.kafka.workers.api;

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
import static com.rtbhouse.kafka.workers.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KafkaWorkers_Status_isTransitionAllowed_20252893708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum5;

    public KafkaWorkers_Status_isTransitionAllowed_20252893708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1820 = Class.forName((String) "com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Field term1819 = ((Class) term1820).getDeclaredField((String) "CANNOT_STOP_THREADS");
        ((Field) term1819).setAccessible(true);
        enum5 = ((Field) term1819).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        argTypes[1] = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isTransitionAllowed", argTypes, enum5, args);
    }

};


