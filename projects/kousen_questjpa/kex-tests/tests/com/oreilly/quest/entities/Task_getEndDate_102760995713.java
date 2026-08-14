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

public class Task_getEndDate_102760995713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6505;

    public Task_getEndDate_102760995713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6506 = new Long(463622836963501975L);
        Long term6531 = new Long(305759998609888272L);
        HashMap term6547 = new HashMap();
        Set<Object> term6601 =  ((Map) term6547).keySet();
        HashSet term6546 = new HashSet((Collection<? extends Object>) term6601);
        HashMap term6553 = new HashMap();
        Set<Object> term6602 =  ((Map) term6553).keySet();
        HashSet term6552 = new HashSet((Collection<? extends Object>) term6602);
        term6505 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6530 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6573 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6578 = newInstance(Class.forName("java.time.Duration"));
        setField(term6505, term6505.getClass(), "id", term6506);
        setField(term6505, term6505.getClass(), "name", "BKLfkLiZTH");
        setIntField(term6505, term6505.getClass(), "priority", 3);
        setIntField(term6521, term6521.getClass(), "year", 2026);
        setShortField(term6521, term6521.getClass(), "month", (short) 8);
        setShortField(term6521, term6521.getClass(), "day", (short) 12);
        setField(term6505, term6505.getClass(), "startDate", term6521);
        setIntField(term6525, term6525.getClass(), "year", 2026);
        setShortField(term6525, term6525.getClass(), "month", (short) 8);
        setShortField(term6525, term6525.getClass(), "day", (short) 12);
        setField(term6505, term6505.getClass(), "endDate", term6525);
        setBooleanField(term6505, term6505.getClass(), "completed", true);
        setField(term6530, term6530.getClass(), "id", term6531);
        setField(term6530, term6530.getClass(), "name", "SPpkrGcPRr");
        setLongField(term6530, term6530.getClass(), "version", -4502405999831680926L);
        setField(term6530, term6530.getClass(), "tasks", term6546);
        setField(term6530, term6530.getClass(), "knights", term6552);
        setField(term6505, term6505.getClass(), "quest", term6530);
        setIntField(term6559, term6559.getClass(), "year", 2015);
        setShortField(term6559, term6559.getClass(), "month", (short) 3);
        setShortField(term6559, term6559.getClass(), "day", (short) 10);
        setField(term6558, term6558.getClass(), "date", term6559);
        setByteField(term6563, term6563.getClass(), "hour", (byte) 23);
        setByteField(term6563, term6563.getClass(), "minute", (byte) 34);
        setByteField(term6563, term6563.getClass(), "second", (byte) 44);
        setIntField(term6563, term6563.getClass(), "nano", 587322824);
        setField(term6558, term6558.getClass(), "time", term6563);
        setField(term6505, term6505.getClass(), "createdDate", term6558);
        setIntField(term6569, term6569.getClass(), "year", 2027);
        setShortField(term6569, term6569.getClass(), "month", (short) 8);
        setShortField(term6569, term6569.getClass(), "day", (short) 26);
        setField(term6568, term6568.getClass(), "date", term6569);
        setByteField(term6573, term6573.getClass(), "hour", (byte) 5);
        setByteField(term6573, term6573.getClass(), "minute", (byte) 11);
        setByteField(term6573, term6573.getClass(), "second", (byte) 9);
        setIntField(term6573, term6573.getClass(), "nano", 219245092);
        setField(term6568, term6568.getClass(), "time", term6573);
        setField(term6505, term6505.getClass(), "modifiedDate", term6568);
        setLongField(term6578, term6578.getClass(), "seconds", 183600L);
        setIntField(term6578, term6578.getClass(), "nanos", 0);
        setField(term6505, term6505.getClass(), "duration", term6578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term6505, args);
    }

};


