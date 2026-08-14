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

public class KafkaWorkers_Status_isTransitionAllowed_20252893703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object enum1;

    public KafkaWorkers_Status_isTransitionAllowed_20252893703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term219 = Class.forName((String) "com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Field term218 = ((Class) term219).getDeclaredField((String) "CANNOT_STOP_THREADS");
        ((Field) term218).setAccessible(true);
        enum0 = ((Field) term218).get((Object) null);
        Class<? extends Object> term533 = Class.forName((String) "com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Field term532 = ((Class) term533).getDeclaredField((String) "CLOSING_INTERRUPTED");
        ((Field) term532).setAccessible(true);
        enum1 = ((Field) term532).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        argTypes[1] = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = enum1;
        callMethod(klass, "isTransitionAllowed", argTypes, null, args);
    }

};


