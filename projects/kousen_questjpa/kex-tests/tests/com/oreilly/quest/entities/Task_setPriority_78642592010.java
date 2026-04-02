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
import java.lang.Integer;

public class Task_setPriority_78642592010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6205;
     Object term6281;

    public Task_setPriority_78642592010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6206 = new Long(7994303628307559416L);
        Long term6231 = new Long(2443640364875054177L);
        HashMap term6247 = new HashMap();
        Set<Object> term6303 =  ((Map) term6247).keySet();
        HashSet term6246 = new HashSet((Collection<? extends Object>) term6303);
        HashMap term6253 = new HashMap();
        Set<Object> term6304 =  ((Map) term6253).keySet();
        HashSet term6252 = new HashSet((Collection<? extends Object>) term6304);
        term6205 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6230 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6263 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6273 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6278 = newInstance(Class.forName("java.time.Duration"));
        setField(term6205, term6205.getClass(), "id", term6206);
        setField(term6205, term6205.getClass(), "name", "JqXGgAhZPl");
        setIntField(term6205, term6205.getClass(), "priority", 3);
        setIntField(term6221, term6221.getClass(), "year", 2026);
        setShortField(term6221, term6221.getClass(), "month", (short) 4);
        setShortField(term6221, term6221.getClass(), "day", (short) 2);
        setField(term6205, term6205.getClass(), "startDate", term6221);
        setIntField(term6225, term6225.getClass(), "year", 2026);
        setShortField(term6225, term6225.getClass(), "month", (short) 4);
        setShortField(term6225, term6225.getClass(), "day", (short) 2);
        setField(term6205, term6205.getClass(), "endDate", term6225);
        setBooleanField(term6205, term6205.getClass(), "completed", false);
        setField(term6230, term6230.getClass(), "id", term6231);
        setField(term6230, term6230.getClass(), "name", "jiKYgYHqIS");
        setLongField(term6230, term6230.getClass(), "version", 2486810210675247493L);
        setField(term6230, term6230.getClass(), "tasks", term6246);
        setField(term6230, term6230.getClass(), "knights", term6252);
        setField(term6205, term6205.getClass(), "quest", term6230);
        setIntField(term6259, term6259.getClass(), "year", 2015);
        setShortField(term6259, term6259.getClass(), "month", (short) 9);
        setShortField(term6259, term6259.getClass(), "day", (short) 16);
        setField(term6258, term6258.getClass(), "date", term6259);
        setByteField(term6263, term6263.getClass(), "hour", (byte) 6);
        setByteField(term6263, term6263.getClass(), "minute", (byte) 19);
        setByteField(term6263, term6263.getClass(), "second", (byte) 42);
        setIntField(term6263, term6263.getClass(), "nano", 630084975);
        setField(term6258, term6258.getClass(), "time", term6263);
        setField(term6205, term6205.getClass(), "createdDate", term6258);
        setIntField(term6269, term6269.getClass(), "year", 2029);
        setShortField(term6269, term6269.getClass(), "month", (short) 6);
        setShortField(term6269, term6269.getClass(), "day", (short) 23);
        setField(term6268, term6268.getClass(), "date", term6269);
        setByteField(term6273, term6273.getClass(), "hour", (byte) 21);
        setByteField(term6273, term6273.getClass(), "minute", (byte) 55);
        setByteField(term6273, term6273.getClass(), "second", (byte) 27);
        setIntField(term6273, term6273.getClass(), "nano", 66889274);
        setField(term6268, term6268.getClass(), "time", term6273);
        setField(term6205, term6205.getClass(), "modifiedDate", term6268);
        setLongField(term6278, term6278.getClass(), "seconds", 216000L);
        setIntField(term6278, term6278.getClass(), "nanos", 0);
        setField(term6205, term6205.getClass(), "duration", term6278);
        term6281 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6281;
        callMethod(klass, "setPriority", argTypes, term6205, args);
    }

};


