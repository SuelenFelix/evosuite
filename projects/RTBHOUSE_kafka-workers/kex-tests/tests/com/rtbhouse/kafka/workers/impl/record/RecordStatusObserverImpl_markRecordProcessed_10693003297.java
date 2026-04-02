package com.rtbhouse.kafka.workers.impl.record;

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
import static com.rtbhouse.kafka.workers.impl.record.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RecordStatusObserverImpl_markRecordProcessed_10693003297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2756;

    public RecordStatusObserverImpl_markRecordProcessed_10693003297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2756 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl"));
        setField(term2756, term2756.getClass(), "subpartition", null);
        setLongField(term2756, term2756.getClass(), "offset", 0L);
        setField(term2756, term2756.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markRecordProcessed", argTypes, term2756, args);
    }

};


