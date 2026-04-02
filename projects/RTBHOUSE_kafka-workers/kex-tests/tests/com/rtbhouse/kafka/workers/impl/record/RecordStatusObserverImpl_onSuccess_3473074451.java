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

public class RecordStatusObserverImpl_onSuccess_3473074451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public RecordStatusObserverImpl_onSuccess_3473074451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl"));
        setField(term2, term2.getClass(), "subpartition", null);
        setLongField(term2, term2.getClass(), "offset", 2442117782898005296L);
        setField(term2, term2.getClass(), "context", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.record.RecordStatusObserverImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onSuccess", argTypes, term2, args);
    }

};


