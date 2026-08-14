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
import java.lang.Long;

public class ConsumedOffsets_ConsumedOffsetRange_shrinkFromLeft_15573001016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term110;

    public ConsumedOffsets_ConsumedOffsetRange_shrinkFromLeft_15573001016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange"));
        Object term107 = newInstance(Class.forName("java.time.Instant"));
        setField(term106, term106.getClass(), "range", null);
        setLongField(term107, term107.getClass(), "seconds", 1495357463L);
        setIntField(term107, term107.getClass(), "nanos", 288000000);
        setField(term106, term106.getClass(), "consumedAt", term107);
        term110 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets$ConsumedOffsetRange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term110;
        callMethod(klass, "shrinkFromLeft", argTypes, term106, args);
    }

};


