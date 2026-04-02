package com.rtbhouse.kafka.workers.impl.util;

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
import static com.rtbhouse.kafka.workers.impl.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeUtils_isOlderThan_19774605902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term10;

    public TimeUtils_isOlderThan_19774605902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term7, term7.getClass(), "seconds", 1480438351L);
        setIntField(term7, term7.getClass(), "nanos", 369000000);
        term10 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term10, term10.getClass(), "seconds", 122400L);
        setIntField(term10, term10.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.util.TimeUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Duration");
        argTypes[2] = Class.forName("java.time.Clock");
        Object[] args = new Object[3];
        args[0] = term7;
        args[1] = term10;
        args[2] = null;
        callMethod(klass, "isOlderThan", argTypes, null, args);
    }

};


