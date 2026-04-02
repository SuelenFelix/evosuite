package com.rtbhouse.kafka.workers.api;

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
import static com.rtbhouse.kafka.workers.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KafkaWorkers_waitForShutdown_10633512817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8118;

    public KafkaWorkers_waitForShutdown_10633512817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8118 = newInstance(Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers"));
        setField(term8118, term8118.getClass(), "workers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.api.KafkaWorkers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "waitForShutdown", argTypes, term8118, args);
    }

};


