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

public class DefaultOffsetsState_TopicPartitionMetricInfo_calculateOffsetRangesStatusCounts_21011109210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term130;

    public DefaultOffsetsState_TopicPartitionMetricInfo_calculateOffsetRangesStatusCounts_21011109210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets"));
        Object term126 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.collection.RandomAccessArrayDeque"));
        Object[] term127 = (Object[]) newArray("java.lang.Object", 16);
        setField(term126, term126.getClass(), "elements", term127);
        setIntField(term126, term126.getClass(), "head", 0);
        setIntField(term126, term126.getClass(), "tail", 0);
        setField(term125, term125.getClass(), "consumedRanges", term126);
        term130 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges"));
        Object term131 = newInstance(Class.forName("java.util.TreeSet"));
        Object term132 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term132, term132.getClass(), "comparator", null);
        setField(term132, term132.getClass(), "root", null);
        setIntField(term132, term132.getClass(), "size", 0);
        setIntField(term132, term132.getClass(), "modCount", 0);
        setField(term132, term132.getClass(), "entrySet", null);
        setField(term132, term132.getClass(), "navigableKeySet", null);
        setField(term132, term132.getClass(), "descendingMap", null);
        setField(term132, term132.getClass(), "keySet", null);
        setField(term132, term132.getClass(), "values", null);
        setField(term131, term131.getClass(), "m", term132);
        setField(term130, term130.getClass(), "ranges", term131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.DefaultOffsetsState$TopicPartitionMetricInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.rtbhouse.kafka.workers.impl.offsets.ConsumedOffsets");
        argTypes[1] = Class.forName("com.rtbhouse.kafka.workers.impl.range.SortedRanges");
        Object[] args = new Object[2];
        args[0] = term125;
        args[1] = term130;
        callMethod(klass, "calculateOffsetRangesStatusCounts", argTypes, null, args);
    }

};


