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

public class TimeUtils_isOlderThan_19547635731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4;

    public TimeUtils_isOlderThan_19547635731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1, term1.getClass(), "seconds", 1345871412L);
        setIntField(term1, term1.getClass(), "nanos", 244000000);
        term4 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term4, term4.getClass(), "seconds", 46800L);
        setIntField(term4, term4.getClass(), "nanos", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.util.TimeUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Duration");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term4;
        callMethod(klass, "isOlderThan", argTypes, null, args);
    }

};


