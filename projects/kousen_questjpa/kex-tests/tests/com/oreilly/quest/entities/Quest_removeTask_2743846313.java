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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Quest_removeTask_2743846313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9798;
     Object term9826;

    public Quest_removeTask_2743846313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9799 = new Long(1667122142089513324L);
        HashMap term9815 = new HashMap();
        Set<Object> term9912 =  ((Map) term9815).keySet();
        HashSet term9814 = new HashSet((Collection<? extends Object>) term9912);
        HashMap term9821 = new HashMap();
        Set<Object> term9913 =  ((Map) term9821).keySet();
        HashSet term9820 = new HashSet((Collection<? extends Object>) term9913);
        term9798 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term9798, term9798.getClass(), "id", term9799);
        setField(term9798, term9798.getClass(), "name", "wzsPSPcRdj");
        setLongField(term9798, term9798.getClass(), "version", 5907001541142728739L);
        setField(term9798, term9798.getClass(), "tasks", term9814);
        setField(term9798, term9798.getClass(), "knights", term9820);
        Long term9827 = new Long(-6342139649364011743L);
        Long term9852 = new Long(-4924950707540628022L);
        HashMap term9868 = new HashMap();
        Set<Object> term9934 =  ((Map) term9868).keySet();
        HashSet term9867 = new HashSet((Collection<? extends Object>) term9934);
        HashMap term9874 = new HashMap();
        Set<Object> term9935 =  ((Map) term9874).keySet();
        HashSet term9873 = new HashSet((Collection<? extends Object>) term9935);
        term9826 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term9842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9851 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term9879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9899 = newInstance(Class.forName("java.time.Duration"));
        setField(term9826, term9826.getClass(), "id", term9827);
        setField(term9826, term9826.getClass(), "name", "kGMQdqJYyB");
        setIntField(term9826, term9826.getClass(), "priority", 3);
        setIntField(term9842, term9842.getClass(), "year", 2026);
        setShortField(term9842, term9842.getClass(), "month", (short) 8);
        setShortField(term9842, term9842.getClass(), "day", (short) 12);
        setField(term9826, term9826.getClass(), "startDate", term9842);
        setIntField(term9846, term9846.getClass(), "year", 2026);
        setShortField(term9846, term9846.getClass(), "month", (short) 8);
        setShortField(term9846, term9846.getClass(), "day", (short) 12);
        setField(term9826, term9826.getClass(), "endDate", term9846);
        setBooleanField(term9826, term9826.getClass(), "completed", true);
        setField(term9851, term9851.getClass(), "id", term9852);
        setField(term9851, term9851.getClass(), "name", "XJJNClzHRf");
        setLongField(term9851, term9851.getClass(), "version", 4178434741742309755L);
        setField(term9851, term9851.getClass(), "tasks", term9867);
        setField(term9851, term9851.getClass(), "knights", term9873);
        setField(term9826, term9826.getClass(), "quest", term9851);
        setIntField(term9880, term9880.getClass(), "year", 2023);
        setShortField(term9880, term9880.getClass(), "month", (short) 7);
        setShortField(term9880, term9880.getClass(), "day", (short) 16);
        setField(term9879, term9879.getClass(), "date", term9880);
        setByteField(term9884, term9884.getClass(), "hour", (byte) 3);
        setByteField(term9884, term9884.getClass(), "minute", (byte) 1);
        setByteField(term9884, term9884.getClass(), "second", (byte) 19);
        setIntField(term9884, term9884.getClass(), "nano", 488629554);
        setField(term9879, term9879.getClass(), "time", term9884);
        setField(term9826, term9826.getClass(), "createdDate", term9879);
        setIntField(term9890, term9890.getClass(), "year", 2018);
        setShortField(term9890, term9890.getClass(), "month", (short) 7);
        setShortField(term9890, term9890.getClass(), "day", (short) 12);
        setField(term9889, term9889.getClass(), "date", term9890);
        setByteField(term9894, term9894.getClass(), "hour", (byte) 1);
        setByteField(term9894, term9894.getClass(), "minute", (byte) 3);
        setByteField(term9894, term9894.getClass(), "second", (byte) 47);
        setIntField(term9894, term9894.getClass(), "nano", 2729929);
        setField(term9889, term9889.getClass(), "time", term9894);
        setField(term9826, term9826.getClass(), "modifiedDate", term9889);
        setLongField(term9899, term9899.getClass(), "seconds", 262800L);
        setIntField(term9899, term9899.getClass(), "nanos", 0);
        setField(term9826, term9826.getClass(), "duration", term9899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Task");
        Object[] args = new Object[1];
        args[0] = term9826;
        callMethod(klass, "removeTask", argTypes, term9798, args);
    }

};


