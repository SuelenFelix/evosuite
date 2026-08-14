package com.rtbhouse.kafka.workers.impl;

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
import static com.rtbhouse.kafka.workers.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class KafkaWorkersImpl_tryToSetStatus_2160339437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;

    public KafkaWorkersImpl_tryToSetStatus_2160339437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31924 = Class.forName((String) "com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Field term31923 = ((Class) term31924).getDeclaredField((String) "CLOSING_INTERRUPTED");
        ((Field) term31923).setAccessible(true);
        enum1 = ((Field) term31923).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.KafkaWorkersImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers$Status");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "tryToSetStatus", argTypes, null, args);
    }

};


