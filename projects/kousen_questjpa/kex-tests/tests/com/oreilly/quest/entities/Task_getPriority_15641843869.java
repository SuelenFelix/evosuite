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

public class Task_getPriority_15641843869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6107;

    public Task_getPriority_15641843869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6108 = new Long(3892018155439224435L);
        Long term6133 = new Long(5953383087795962419L);
        HashMap term6149 = new HashMap();
        Set<Object> term6203 =  ((Map) term6149).keySet();
        HashSet term6148 = new HashSet((Collection<? extends Object>) term6203);
        HashMap term6155 = new HashMap();
        Set<Object> term6204 =  ((Map) term6155).keySet();
        HashSet term6154 = new HashSet((Collection<? extends Object>) term6204);
        term6107 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6132 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6180 = newInstance(Class.forName("java.time.Duration"));
        setField(term6107, term6107.getClass(), "id", term6108);
        setField(term6107, term6107.getClass(), "name", "xOcJIiQQDu");
        setIntField(term6107, term6107.getClass(), "priority", 3);
        setIntField(term6123, term6123.getClass(), "year", 2026);
        setShortField(term6123, term6123.getClass(), "month", (short) 6);
        setShortField(term6123, term6123.getClass(), "day", (short) 29);
        setField(term6107, term6107.getClass(), "startDate", term6123);
        setIntField(term6127, term6127.getClass(), "year", 2026);
        setShortField(term6127, term6127.getClass(), "month", (short) 6);
        setShortField(term6127, term6127.getClass(), "day", (short) 29);
        setField(term6107, term6107.getClass(), "endDate", term6127);
        setBooleanField(term6107, term6107.getClass(), "completed", true);
        setField(term6132, term6132.getClass(), "id", term6133);
        setField(term6132, term6132.getClass(), "name", "GVizqqzXpy");
        setLongField(term6132, term6132.getClass(), "version", -4365849114644724155L);
        setField(term6132, term6132.getClass(), "tasks", term6148);
        setField(term6132, term6132.getClass(), "knights", term6154);
        setField(term6107, term6107.getClass(), "quest", term6132);
        setIntField(term6161, term6161.getClass(), "year", 2012);
        setShortField(term6161, term6161.getClass(), "month", (short) 2);
        setShortField(term6161, term6161.getClass(), "day", (short) 19);
        setField(term6160, term6160.getClass(), "date", term6161);
        setByteField(term6165, term6165.getClass(), "hour", (byte) 8);
        setByteField(term6165, term6165.getClass(), "minute", (byte) 4);
        setByteField(term6165, term6165.getClass(), "second", (byte) 43);
        setIntField(term6165, term6165.getClass(), "nano", 114930008);
        setField(term6160, term6160.getClass(), "time", term6165);
        setField(term6107, term6107.getClass(), "createdDate", term6160);
        setIntField(term6171, term6171.getClass(), "year", 2017);
        setShortField(term6171, term6171.getClass(), "month", (short) 6);
        setShortField(term6171, term6171.getClass(), "day", (short) 8);
        setField(term6170, term6170.getClass(), "date", term6171);
        setByteField(term6175, term6175.getClass(), "hour", (byte) 0);
        setByteField(term6175, term6175.getClass(), "minute", (byte) 18);
        setByteField(term6175, term6175.getClass(), "second", (byte) 55);
        setIntField(term6175, term6175.getClass(), "nano", 680586717);
        setField(term6170, term6170.getClass(), "time", term6175);
        setField(term6107, term6107.getClass(), "modifiedDate", term6170);
        setLongField(term6180, term6180.getClass(), "seconds", 129600L);
        setIntField(term6180, term6180.getClass(), "nanos", 0);
        setField(term6107, term6107.getClass(), "duration", term6180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriority", argTypes, term6107, args);
    }

};


