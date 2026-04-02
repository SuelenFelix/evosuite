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

public class DefaultOffsetsState_TopicPartitionMetricInfo_toString_17338339098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774;

    public DefaultOffsetsState_TopicPartitionMetricInfo_toString_17338339098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term774 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo"));
        setField(term774, term774.getClass(), "computedAt", null);
        setField(term774, term774.getClass(), "offsetStatusCounts", null);
        setField(term774, term774.getClass(), "offsetRangesStatusCounts", null);
        setLongField(term774, term774.getClass(), "computationTimeMillis", 0L);
        setField(term774, term774.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term774, args);
    }

};


