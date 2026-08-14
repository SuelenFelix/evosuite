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

public class ConsumedOffsets_getFirst_16395930196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;

    public ConsumedOffsets_getFirst_16395930196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets"));
        Object term33 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque"));
        Object[] term34 = (Object[]) newArray("java.lang.Object", 16);
        setField(term33, term33.getClass(), "elements", term34);
        setIntField(term33, term33.getClass(), "head", 0);
        setIntField(term33, term33.getClass(), "tail", 0);
        setField(term32, term32.getClass(), "consumedRanges", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirst", argTypes, term32, args);
    }

};


