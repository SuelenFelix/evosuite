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

public class ConsumedOffsets_addConsumedRange_7801634074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term21;

    public ConsumedOffsets_addConsumedRange_7801634074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets"));
        Object term17 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque"));
        Object[] term18 = (Object[]) newArray("java.lang.Object", 16);
        setField(term17, term17.getClass(), "elements", term18);
        setIntField(term17, term17.getClass(), "head", 0);
        setIntField(term17, term17.getClass(), "tail", 0);
        setField(term16, term16.getClass(), "consumedRanges", term17);
        term21 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange"));
        Object term22 = newInstance(Class.forName("java.time.Instant"));
        setField(term21, term21.getClass(), "range", null);
        setLongField(term22, term22.getClass(), "seconds", 1345871412L);
        setIntField(term22, term22.getClass(), "nanos", 244000000);
        setField(term21, term21.getClass(), "consumedAt", term22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange");
        Object[] args = new Object[1];
        args[0] = term21;
        callMethod(klass, "addConsumedRange", argTypes, term16, args);
    }

};


