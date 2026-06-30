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

public class Task_setEndDate_183434957114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6603;
     Object term6679;

    public Task_setEndDate_183434957114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6604 = new Long(-8654565919063661957L);
        Long term6629 = new Long(-5248475803419977214L);
        HashMap term6645 = new HashMap();
        Set<Object> term6703 =  ((Map) term6645).keySet();
        HashSet term6644 = new HashSet((Collection<? extends Object>) term6703);
        HashMap term6651 = new HashMap();
        Set<Object> term6704 =  ((Map) term6651).keySet();
        HashSet term6650 = new HashSet((Collection<? extends Object>) term6704);
        term6603 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6628 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6661 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6666 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6667 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6671 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6676 = newInstance(Class.forName("java.time.Duration"));
        setField(term6603, term6603.getClass(), "id", term6604);
        setField(term6603, term6603.getClass(), "name", "sEccwbJKYE");
        setIntField(term6603, term6603.getClass(), "priority", 3);
        setIntField(term6619, term6619.getClass(), "year", 2026);
        setShortField(term6619, term6619.getClass(), "month", (short) 6);
        setShortField(term6619, term6619.getClass(), "day", (short) 29);
        setField(term6603, term6603.getClass(), "startDate", term6619);
        setIntField(term6623, term6623.getClass(), "year", 2026);
        setShortField(term6623, term6623.getClass(), "month", (short) 6);
        setShortField(term6623, term6623.getClass(), "day", (short) 29);
        setField(term6603, term6603.getClass(), "endDate", term6623);
        setBooleanField(term6603, term6603.getClass(), "completed", false);
        setField(term6628, term6628.getClass(), "id", term6629);
        setField(term6628, term6628.getClass(), "name", "AWRooQKkdW");
        setLongField(term6628, term6628.getClass(), "version", 1967728129628047933L);
        setField(term6628, term6628.getClass(), "tasks", term6644);
        setField(term6628, term6628.getClass(), "knights", term6650);
        setField(term6603, term6603.getClass(), "quest", term6628);
        setIntField(term6657, term6657.getClass(), "year", 2025);
        setShortField(term6657, term6657.getClass(), "month", (short) 3);
        setShortField(term6657, term6657.getClass(), "day", (short) 9);
        setField(term6656, term6656.getClass(), "date", term6657);
        setByteField(term6661, term6661.getClass(), "hour", (byte) 5);
        setByteField(term6661, term6661.getClass(), "minute", (byte) 49);
        setByteField(term6661, term6661.getClass(), "second", (byte) 12);
        setIntField(term6661, term6661.getClass(), "nano", 791695028);
        setField(term6656, term6656.getClass(), "time", term6661);
        setField(term6603, term6603.getClass(), "createdDate", term6656);
        setIntField(term6667, term6667.getClass(), "year", 2023);
        setShortField(term6667, term6667.getClass(), "month", (short) 9);
        setShortField(term6667, term6667.getClass(), "day", (short) 23);
        setField(term6666, term6666.getClass(), "date", term6667);
        setByteField(term6671, term6671.getClass(), "hour", (byte) 12);
        setByteField(term6671, term6671.getClass(), "minute", (byte) 55);
        setByteField(term6671, term6671.getClass(), "second", (byte) 58);
        setIntField(term6671, term6671.getClass(), "nano", 159178396);
        setField(term6666, term6666.getClass(), "time", term6671);
        setField(term6603, term6603.getClass(), "modifiedDate", term6666);
        setLongField(term6676, term6676.getClass(), "seconds", 273600L);
        setIntField(term6676, term6676.getClass(), "nanos", 0);
        setField(term6603, term6603.getClass(), "duration", term6676);
        term6679 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term6679, term6679.getClass(), "year", 2016);
        setShortField(term6679, term6679.getClass(), "month", (short) 11);
        setShortField(term6679, term6679.getClass(), "day", (short) 29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term6679;
        callMethod(klass, "setEndDate", argTypes, term6603, args);
    }

};


