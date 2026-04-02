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
import java.lang.Boolean;

public class Task_setCompleted_4421811516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6803;
     Object term6879;

    public Task_setCompleted_4421811516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6804 = new Long(6682528376118987775L);
        Long term6829 = new Long(682356318767179819L);
        HashMap term6845 = new HashMap();
        Set<Object> term6901 =  ((Map) term6845).keySet();
        HashSet term6844 = new HashSet((Collection<? extends Object>) term6901);
        HashMap term6851 = new HashMap();
        Set<Object> term6902 =  ((Map) term6851).keySet();
        HashSet term6850 = new HashSet((Collection<? extends Object>) term6902);
        term6803 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6828 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6876 = newInstance(Class.forName("java.time.Duration"));
        setField(term6803, term6803.getClass(), "id", term6804);
        setField(term6803, term6803.getClass(), "name", "qxSDVejjiY");
        setIntField(term6803, term6803.getClass(), "priority", 3);
        setIntField(term6819, term6819.getClass(), "year", 2026);
        setShortField(term6819, term6819.getClass(), "month", (short) 4);
        setShortField(term6819, term6819.getClass(), "day", (short) 2);
        setField(term6803, term6803.getClass(), "startDate", term6819);
        setIntField(term6823, term6823.getClass(), "year", 2026);
        setShortField(term6823, term6823.getClass(), "month", (short) 4);
        setShortField(term6823, term6823.getClass(), "day", (short) 2);
        setField(term6803, term6803.getClass(), "endDate", term6823);
        setBooleanField(term6803, term6803.getClass(), "completed", false);
        setField(term6828, term6828.getClass(), "id", term6829);
        setField(term6828, term6828.getClass(), "name", "xBsXSDjXYK");
        setLongField(term6828, term6828.getClass(), "version", 6855071767938501807L);
        setField(term6828, term6828.getClass(), "tasks", term6844);
        setField(term6828, term6828.getClass(), "knights", term6850);
        setField(term6803, term6803.getClass(), "quest", term6828);
        setIntField(term6857, term6857.getClass(), "year", 2021);
        setShortField(term6857, term6857.getClass(), "month", (short) 8);
        setShortField(term6857, term6857.getClass(), "day", (short) 12);
        setField(term6856, term6856.getClass(), "date", term6857);
        setByteField(term6861, term6861.getClass(), "hour", (byte) 2);
        setByteField(term6861, term6861.getClass(), "minute", (byte) 17);
        setByteField(term6861, term6861.getClass(), "second", (byte) 51);
        setIntField(term6861, term6861.getClass(), "nano", 207375141);
        setField(term6856, term6856.getClass(), "time", term6861);
        setField(term6803, term6803.getClass(), "createdDate", term6856);
        setIntField(term6867, term6867.getClass(), "year", 2025);
        setShortField(term6867, term6867.getClass(), "month", (short) 11);
        setShortField(term6867, term6867.getClass(), "day", (short) 3);
        setField(term6866, term6866.getClass(), "date", term6867);
        setByteField(term6871, term6871.getClass(), "hour", (byte) 21);
        setByteField(term6871, term6871.getClass(), "minute", (byte) 24);
        setByteField(term6871, term6871.getClass(), "second", (byte) 23);
        setIntField(term6871, term6871.getClass(), "nano", 210986721);
        setField(term6866, term6866.getClass(), "time", term6871);
        setField(term6803, term6803.getClass(), "modifiedDate", term6866);
        setLongField(term6876, term6876.getClass(), "seconds", 252000L);
        setIntField(term6876, term6876.getClass(), "nanos", 0);
        setField(term6803, term6803.getClass(), "duration", term6876);
        term6879 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6879;
        callMethod(klass, "setCompleted", argTypes, term6803, args);
    }

};


