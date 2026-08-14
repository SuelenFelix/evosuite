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
import java.lang.Object;

public class ConsumedOffsets_ConsumedOffsetRange_size_14233686685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;

    public ConsumedOffsets_ConsumedOffsetRange_size_14233686685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange"));
        Object term103 = newInstance(Class.forName("java.time.Instant"));
        setField(term102, term102.getClass(), "range", null);
        setLongField(term103, term103.getClass(), "seconds", 1429023851L);
        setIntField(term103, term103.getClass(), "nanos", 389000000);
        setField(term102, term102.getClass(), "consumedAt", term103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term102, args);
    }

};


