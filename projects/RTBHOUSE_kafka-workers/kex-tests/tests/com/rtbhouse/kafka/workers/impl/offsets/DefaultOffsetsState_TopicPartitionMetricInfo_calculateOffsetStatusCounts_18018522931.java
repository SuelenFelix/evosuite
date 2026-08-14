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

public class DefaultOffsetsState_TopicPartitionMetricInfo_calculateOffsetStatusCounts_18018522931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public DefaultOffsetsState_TopicPartitionMetricInfo_calculateOffsetStatusCounts_18018522931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo"));
        setField(term135, term135.getClass(), "computedAt", null);
        setField(term135, term135.getClass(), "offsetStatusCounts", null);
        setField(term135, term135.getClass(), "offsetRangesStatusCounts", null);
        setLongField(term135, term135.getClass(), "computationTimeMillis", 0L);
        setField(term135, term135.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateOffsetStatusCounts", argTypes, term135, args);
    }

};


