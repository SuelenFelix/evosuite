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

public class Task_setId_17478744716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5789;
     Object term5865;

    public Task_setId_17478744716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5790 = new Long(-1154553077993834885L);
        Long term5815 = new Long(-2850532706972744550L);
        HashMap term5831 = new HashMap();
        Set<Object> term5887 =  ((Map) term5831).keySet();
        HashSet term5830 = new HashSet((Collection<? extends Object>) term5887);
        HashMap term5837 = new HashMap();
        Set<Object> term5888 =  ((Map) term5837).keySet();
        HashSet term5836 = new HashSet((Collection<? extends Object>) term5888);
        term5789 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5814 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5857 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5862 = newInstance(Class.forName("java.time.Duration"));
        setField(term5789, term5789.getClass(), "id", term5790);
        setField(term5789, term5789.getClass(), "name", "cAPeiZHKGJ");
        setIntField(term5789, term5789.getClass(), "priority", 3);
        setIntField(term5805, term5805.getClass(), "year", 2026);
        setShortField(term5805, term5805.getClass(), "month", (short) 4);
        setShortField(term5805, term5805.getClass(), "day", (short) 2);
        setField(term5789, term5789.getClass(), "startDate", term5805);
        setIntField(term5809, term5809.getClass(), "year", 2026);
        setShortField(term5809, term5809.getClass(), "month", (short) 4);
        setShortField(term5809, term5809.getClass(), "day", (short) 2);
        setField(term5789, term5789.getClass(), "endDate", term5809);
        setBooleanField(term5789, term5789.getClass(), "completed", true);
        setField(term5814, term5814.getClass(), "id", term5815);
        setField(term5814, term5814.getClass(), "name", "LvJFtLBaxj");
        setLongField(term5814, term5814.getClass(), "version", 8428634514691209827L);
        setField(term5814, term5814.getClass(), "tasks", term5830);
        setField(term5814, term5814.getClass(), "knights", term5836);
        setField(term5789, term5789.getClass(), "quest", term5814);
        setIntField(term5843, term5843.getClass(), "year", 2029);
        setShortField(term5843, term5843.getClass(), "month", (short) 8);
        setShortField(term5843, term5843.getClass(), "day", (short) 29);
        setField(term5842, term5842.getClass(), "date", term5843);
        setByteField(term5847, term5847.getClass(), "hour", (byte) 15);
        setByteField(term5847, term5847.getClass(), "minute", (byte) 50);
        setByteField(term5847, term5847.getClass(), "second", (byte) 1);
        setIntField(term5847, term5847.getClass(), "nano", 277971904);
        setField(term5842, term5842.getClass(), "time", term5847);
        setField(term5789, term5789.getClass(), "createdDate", term5842);
        setIntField(term5853, term5853.getClass(), "year", 2022);
        setShortField(term5853, term5853.getClass(), "month", (short) 11);
        setShortField(term5853, term5853.getClass(), "day", (short) 16);
        setField(term5852, term5852.getClass(), "date", term5853);
        setByteField(term5857, term5857.getClass(), "hour", (byte) 15);
        setByteField(term5857, term5857.getClass(), "minute", (byte) 54);
        setByteField(term5857, term5857.getClass(), "second", (byte) 2);
        setIntField(term5857, term5857.getClass(), "nano", 733274103);
        setField(term5852, term5852.getClass(), "time", term5857);
        setField(term5789, term5789.getClass(), "modifiedDate", term5852);
        setLongField(term5862, term5862.getClass(), "seconds", 100800L);
        setIntField(term5862, term5862.getClass(), "nanos", 0);
        setField(term5789, term5789.getClass(), "duration", term5862);
        term5865 = new Long(-2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5865;
        callMethod(klass, "setId", argTypes, term5789, args);
    }

};


