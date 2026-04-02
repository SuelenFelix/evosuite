package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Task_equals_159353553417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6903;
     Object term6979;

    public Task_equals_159353553417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6904 = new Long(-7291743527973326814L);
        Long term6929 = new Long(-5963439350418910964L);
        HashMap term6945 = new HashMap();
        Set<Object> term7000 =  ((Map) term6945).keySet();
        HashSet term6944 = new HashSet((Collection<? extends Object>) term7000);
        HashMap term6951 = new HashMap();
        Set<Object> term7001 =  ((Map) term6951).keySet();
        HashSet term6950 = new HashSet((Collection<? extends Object>) term7001);
        term6903 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6928 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6976 = newInstance(Class.forName("java.time.Duration"));
        setField(term6903, term6903.getClass(), "id", term6904);
        setField(term6903, term6903.getClass(), "name", "sEnIVFtZuQ");
        setIntField(term6903, term6903.getClass(), "priority", 3);
        setIntField(term6919, term6919.getClass(), "year", 2026);
        setShortField(term6919, term6919.getClass(), "month", (short) 4);
        setShortField(term6919, term6919.getClass(), "day", (short) 2);
        setField(term6903, term6903.getClass(), "startDate", term6919);
        setIntField(term6923, term6923.getClass(), "year", 2026);
        setShortField(term6923, term6923.getClass(), "month", (short) 4);
        setShortField(term6923, term6923.getClass(), "day", (short) 2);
        setField(term6903, term6903.getClass(), "endDate", term6923);
        setBooleanField(term6903, term6903.getClass(), "completed", true);
        setField(term6928, term6928.getClass(), "id", term6929);
        setField(term6928, term6928.getClass(), "name", "ZVecLZMLHF");
        setLongField(term6928, term6928.getClass(), "version", -5892135042702373494L);
        setField(term6928, term6928.getClass(), "tasks", term6944);
        setField(term6928, term6928.getClass(), "knights", term6950);
        setField(term6903, term6903.getClass(), "quest", term6928);
        setIntField(term6957, term6957.getClass(), "year", 2016);
        setShortField(term6957, term6957.getClass(), "month", (short) 6);
        setShortField(term6957, term6957.getClass(), "day", (short) 15);
        setField(term6956, term6956.getClass(), "date", term6957);
        setByteField(term6961, term6961.getClass(), "hour", (byte) 21);
        setByteField(term6961, term6961.getClass(), "minute", (byte) 23);
        setByteField(term6961, term6961.getClass(), "second", (byte) 23);
        setIntField(term6961, term6961.getClass(), "nano", 433372070);
        setField(term6956, term6956.getClass(), "time", term6961);
        setField(term6903, term6903.getClass(), "createdDate", term6956);
        setIntField(term6967, term6967.getClass(), "year", 2012);
        setShortField(term6967, term6967.getClass(), "month", (short) 8);
        setShortField(term6967, term6967.getClass(), "day", (short) 25);
        setField(term6966, term6966.getClass(), "date", term6967);
        setByteField(term6971, term6971.getClass(), "hour", (byte) 19);
        setByteField(term6971, term6971.getClass(), "minute", (byte) 49);
        setByteField(term6971, term6971.getClass(), "second", (byte) 8);
        setIntField(term6971, term6971.getClass(), "nano", 912685024);
        setField(term6966, term6966.getClass(), "time", term6971);
        setField(term6903, term6903.getClass(), "modifiedDate", term6966);
        setLongField(term6976, term6976.getClass(), "seconds", 342000L);
        setIntField(term6976, term6976.getClass(), "nanos", 0);
        setField(term6903, term6903.getClass(), "duration", term6976);
        term6979 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6979;
        callMethod(klass, "equals", argTypes, term6903, args);
    }

};


