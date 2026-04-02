package com.rtbhouse.kafka.workers.impl.offsets;

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
import static com.rtbhouse.kafka.workers.impl.offsets.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DefaultOffsetsState_TopicPartitionMetricInfo_getOffsetStatusCount_6087390892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public DefaultOffsetsState_TopicPartitionMetricInfo_getOffsetStatusCount_6087390892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175 = Class.forName((String) "com.rtbhouse.kafka.workers.impl.offsets.OffsetStatus");
        Field term174 = ((Class) term175).getDeclaredField((String) "CONSUMED");
        ((Field) term174).setAccessible(true);
        enum0 = ((Field) term174).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.OffsetStatus");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "getOffsetStatusCount", argTypes, null, args);
    }

};


