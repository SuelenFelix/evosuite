package com.rtbhouse.kafka.workers.impl;

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
import static com.rtbhouse.kafka.workers.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KafkaWorkersImpl_timedOut_17099884910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32237;
     Object term32240;

    public KafkaWorkersImpl_timedOut_17099884910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32237 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term32237, term32237.getClass(), "seconds", 1863631094L);
        setIntField(term32237, term32237.getClass(), "nanos", 992000000);
        term32240 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term32240, term32240.getClass(), "seconds", 100800L);
        setIntField(term32240, term32240.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.KafkaWorkersImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Duration");
        Object[] args = new Object[2];
        args[0] = term32237;
        args[1] = term32240;
        callMethod(klass, "timedOut", argTypes, null, args);
    }

};


