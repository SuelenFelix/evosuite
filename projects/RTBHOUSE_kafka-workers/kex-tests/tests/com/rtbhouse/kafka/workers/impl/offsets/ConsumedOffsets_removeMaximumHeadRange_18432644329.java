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

public class ConsumedOffsets_removeMaximumHeadRange_18432644329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public ConsumedOffsets_removeMaximumHeadRange_18432644329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets"));
        Object term48 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque"));
        Object[] term49 = (Object[]) newArray("java.lang.Object", 16);
        setField(term48, term48.getClass(), "elements", term49);
        setIntField(term48, term48.getClass(), "head", 0);
        setIntField(term48, term48.getClass(), "tail", 0);
        setField(term47, term47.getClass(), "consumedRanges", term48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.range.ClosedRange");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeMaximumHeadRange", argTypes, term47, args);
    }

};


