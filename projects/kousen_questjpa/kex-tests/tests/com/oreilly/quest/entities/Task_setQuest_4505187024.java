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

public class Task_setQuest_4505187024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5553;
     Object term5629;

    public Task_setQuest_4505187024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5554 = new Long(4044358158040652353L);
        Long term5579 = new Long(-4443169559037975007L);
        HashMap term5595 = new HashMap();
        Set<Object> term5677 =  ((Map) term5595).keySet();
        HashSet term5594 = new HashSet((Collection<? extends Object>) term5677);
        HashMap term5601 = new HashMap();
        Set<Object> term5678 =  ((Map) term5601).keySet();
        HashSet term5600 = new HashSet((Collection<? extends Object>) term5678);
        term5553 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5578 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5611 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5626 = newInstance(Class.forName("java.time.Duration"));
        setField(term5553, term5553.getClass(), "id", term5554);
        setField(term5553, term5553.getClass(), "name", "wGmYcqUkgE");
        setIntField(term5553, term5553.getClass(), "priority", 3);
        setIntField(term5569, term5569.getClass(), "year", 2026);
        setShortField(term5569, term5569.getClass(), "month", (short) 8);
        setShortField(term5569, term5569.getClass(), "day", (short) 12);
        setField(term5553, term5553.getClass(), "startDate", term5569);
        setIntField(term5573, term5573.getClass(), "year", 2026);
        setShortField(term5573, term5573.getClass(), "month", (short) 8);
        setShortField(term5573, term5573.getClass(), "day", (short) 12);
        setField(term5553, term5553.getClass(), "endDate", term5573);
        setBooleanField(term5553, term5553.getClass(), "completed", false);
        setField(term5578, term5578.getClass(), "id", term5579);
        setField(term5578, term5578.getClass(), "name", "idgaQsnJpQ");
        setLongField(term5578, term5578.getClass(), "version", 5127676408959197577L);
        setField(term5578, term5578.getClass(), "tasks", term5594);
        setField(term5578, term5578.getClass(), "knights", term5600);
        setField(term5553, term5553.getClass(), "quest", term5578);
        setIntField(term5607, term5607.getClass(), "year", 2022);
        setShortField(term5607, term5607.getClass(), "month", (short) 2);
        setShortField(term5607, term5607.getClass(), "day", (short) 26);
        setField(term5606, term5606.getClass(), "date", term5607);
        setByteField(term5611, term5611.getClass(), "hour", (byte) 11);
        setByteField(term5611, term5611.getClass(), "minute", (byte) 42);
        setByteField(term5611, term5611.getClass(), "second", (byte) 15);
        setIntField(term5611, term5611.getClass(), "nano", 377731937);
        setField(term5606, term5606.getClass(), "time", term5611);
        setField(term5553, term5553.getClass(), "createdDate", term5606);
        setIntField(term5617, term5617.getClass(), "year", 2026);
        setShortField(term5617, term5617.getClass(), "month", (short) 12);
        setShortField(term5617, term5617.getClass(), "day", (short) 14);
        setField(term5616, term5616.getClass(), "date", term5617);
        setByteField(term5621, term5621.getClass(), "hour", (byte) 16);
        setByteField(term5621, term5621.getClass(), "minute", (byte) 34);
        setByteField(term5621, term5621.getClass(), "second", (byte) 9);
        setIntField(term5621, term5621.getClass(), "nano", 518326996);
        setField(term5616, term5616.getClass(), "time", term5621);
        setField(term5553, term5553.getClass(), "modifiedDate", term5616);
        setLongField(term5626, term5626.getClass(), "seconds", 198000L);
        setIntField(term5626, term5626.getClass(), "nanos", 0);
        setField(term5553, term5553.getClass(), "duration", term5626);
        Long term5630 = new Long(-3842548265506930260L);
        HashMap term5646 = new HashMap();
        Set<Object> term5689 =  ((Map) term5646).keySet();
        HashSet term5645 = new HashSet((Collection<? extends Object>) term5689);
        HashMap term5652 = new HashMap();
        Set<Object> term5690 =  ((Map) term5652).keySet();
        HashSet term5651 = new HashSet((Collection<? extends Object>) term5690);
        term5629 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term5629, term5629.getClass(), "id", term5630);
        setField(term5629, term5629.getClass(), "name", "VgZnGoIFwQ");
        setLongField(term5629, term5629.getClass(), "version", -6573104506744284592L);
        setField(term5629, term5629.getClass(), "tasks", term5645);
        setField(term5629, term5629.getClass(), "knights", term5651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Quest");
        Object[] args = new Object[1];
        args[0] = term5629;
        callMethod(klass, "setQuest", argTypes, term5553, args);
    }

};


