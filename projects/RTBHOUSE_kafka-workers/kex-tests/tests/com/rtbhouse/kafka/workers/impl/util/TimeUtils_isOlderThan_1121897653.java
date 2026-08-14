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

public class TimeUtils_isOlderThan_1121897653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term16;
     Object term19;

    public TimeUtils_isOlderThan_1121897653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13, term13.getClass(), "seconds", 1610940182L);
        setIntField(term13, term13.getClass(), "nanos", 830000000);
        term16 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term16, term16.getClass(), "seconds", 198000L);
        setIntField(term16, term16.getClass(), "nanos", 0);
        term19 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term19, term19.getClass(), "seconds", 1606045635L);
        setIntField(term19, term19.getClass(), "nanos", 837000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rtbhouse.kafka.workers.impl.util.TimeUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Duration");
        argTypes[2] = Class.forName("java.time.Instant");
        Object[] args = new Object[3];
        args[0] = term13;
        args[1] = term16;
        args[2] = term19;
        callMethod(klass, "isOlderThan", argTypes, null, args);
    }

};


