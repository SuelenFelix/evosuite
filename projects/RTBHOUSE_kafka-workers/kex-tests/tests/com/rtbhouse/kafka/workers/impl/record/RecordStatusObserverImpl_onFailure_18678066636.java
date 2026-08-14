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

public class RecordStatusObserverImpl_onFailure_18678066636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2754;

    public RecordStatusObserverImpl_onFailure_18678066636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2754 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl"));
        setField(term2754, term2754.getClass(), "subpartition", null);
        setLongField(term2754, term2754.getClass(), "offset", 0L);
        setField(term2754, term2754.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Exception");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onFailure", argTypes, term2754, args);
    }

};


