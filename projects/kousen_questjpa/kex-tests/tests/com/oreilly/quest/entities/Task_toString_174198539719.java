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

public class Task_toString_174198539719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7100;

    public Task_toString_174198539719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7101 = new Long(50358265865610362L);
        Long term7126 = new Long(5510783420697225605L);
        HashMap term7142 = new HashMap();
        Set<Object> term7196 =  ((Map) term7142).keySet();
        HashSet term7141 = new HashSet((Collection<? extends Object>) term7196);
        HashMap term7148 = new HashMap();
        Set<Object> term7197 =  ((Map) term7148).keySet();
        HashSet term7147 = new HashSet((Collection<? extends Object>) term7197);
        term7100 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term7116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7125 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term7153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7173 = newInstance(Class.forName("java.time.Duration"));
        setField(term7100, term7100.getClass(), "id", term7101);
        setField(term7100, term7100.getClass(), "name", "SJiQaLvSKv");
        setIntField(term7100, term7100.getClass(), "priority", 3);
        setIntField(term7116, term7116.getClass(), "year", 2026);
        setShortField(term7116, term7116.getClass(), "month", (short) 8);
        setShortField(term7116, term7116.getClass(), "day", (short) 12);
        setField(term7100, term7100.getClass(), "startDate", term7116);
        setIntField(term7120, term7120.getClass(), "year", 2026);
        setShortField(term7120, term7120.getClass(), "month", (short) 8);
        setShortField(term7120, term7120.getClass(), "day", (short) 12);
        setField(term7100, term7100.getClass(), "endDate", term7120);
        setBooleanField(term7100, term7100.getClass(), "completed", false);
        setField(term7125, term7125.getClass(), "id", term7126);
        setField(term7125, term7125.getClass(), "name", "OEXDRUKcFl");
        setLongField(term7125, term7125.getClass(), "version", -6823727938421990489L);
        setField(term7125, term7125.getClass(), "tasks", term7141);
        setField(term7125, term7125.getClass(), "knights", term7147);
        setField(term7100, term7100.getClass(), "quest", term7125);
        setIntField(term7154, term7154.getClass(), "year", 2010);
        setShortField(term7154, term7154.getClass(), "month", (short) 5);
        setShortField(term7154, term7154.getClass(), "day", (short) 2);
        setField(term7153, term7153.getClass(), "date", term7154);
        setByteField(term7158, term7158.getClass(), "hour", (byte) 2);
        setByteField(term7158, term7158.getClass(), "minute", (byte) 22);
        setByteField(term7158, term7158.getClass(), "second", (byte) 33);
        setIntField(term7158, term7158.getClass(), "nano", 530835039);
        setField(term7153, term7153.getClass(), "time", term7158);
        setField(term7100, term7100.getClass(), "createdDate", term7153);
        setIntField(term7164, term7164.getClass(), "year", 2024);
        setShortField(term7164, term7164.getClass(), "month", (short) 4);
        setShortField(term7164, term7164.getClass(), "day", (short) 24);
        setField(term7163, term7163.getClass(), "date", term7164);
        setByteField(term7168, term7168.getClass(), "hour", (byte) 7);
        setByteField(term7168, term7168.getClass(), "minute", (byte) 2);
        setByteField(term7168, term7168.getClass(), "second", (byte) 51);
        setIntField(term7168, term7168.getClass(), "nano", 635502964);
        setField(term7163, term7163.getClass(), "time", term7168);
        setField(term7100, term7100.getClass(), "modifiedDate", term7163);
        setLongField(term7173, term7173.getClass(), "seconds", 97200L);
        setIntField(term7173, term7173.getClass(), "nanos", 0);
        setField(term7100, term7100.getClass(), "duration", term7173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7100, args);
    }

};


