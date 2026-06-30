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

public class Task_getQuest_14951674523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5455;

    public Task_getQuest_14951674523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5456 = new Long(-7612550318181586304L);
        Long term5481 = new Long(-2170847986967241072L);
        HashMap term5497 = new HashMap();
        Set<Object> term5551 =  ((Map) term5497).keySet();
        HashSet term5496 = new HashSet((Collection<? extends Object>) term5551);
        HashMap term5503 = new HashMap();
        Set<Object> term5552 =  ((Map) term5503).keySet();
        HashSet term5502 = new HashSet((Collection<? extends Object>) term5552);
        term5455 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5480 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5528 = newInstance(Class.forName("java.time.Duration"));
        setField(term5455, term5455.getClass(), "id", term5456);
        setField(term5455, term5455.getClass(), "name", "vQVyKLdtaz");
        setIntField(term5455, term5455.getClass(), "priority", 3);
        setIntField(term5471, term5471.getClass(), "year", 2026);
        setShortField(term5471, term5471.getClass(), "month", (short) 6);
        setShortField(term5471, term5471.getClass(), "day", (short) 29);
        setField(term5455, term5455.getClass(), "startDate", term5471);
        setIntField(term5475, term5475.getClass(), "year", 2026);
        setShortField(term5475, term5475.getClass(), "month", (short) 6);
        setShortField(term5475, term5475.getClass(), "day", (short) 29);
        setField(term5455, term5455.getClass(), "endDate", term5475);
        setBooleanField(term5455, term5455.getClass(), "completed", false);
        setField(term5480, term5480.getClass(), "id", term5481);
        setField(term5480, term5480.getClass(), "name", "OWKQODBLzb");
        setLongField(term5480, term5480.getClass(), "version", -316468845751588286L);
        setField(term5480, term5480.getClass(), "tasks", term5496);
        setField(term5480, term5480.getClass(), "knights", term5502);
        setField(term5455, term5455.getClass(), "quest", term5480);
        setIntField(term5509, term5509.getClass(), "year", 2015);
        setShortField(term5509, term5509.getClass(), "month", (short) 9);
        setShortField(term5509, term5509.getClass(), "day", (short) 19);
        setField(term5508, term5508.getClass(), "date", term5509);
        setByteField(term5513, term5513.getClass(), "hour", (byte) 9);
        setByteField(term5513, term5513.getClass(), "minute", (byte) 4);
        setByteField(term5513, term5513.getClass(), "second", (byte) 10);
        setIntField(term5513, term5513.getClass(), "nano", 401765865);
        setField(term5508, term5508.getClass(), "time", term5513);
        setField(term5455, term5455.getClass(), "createdDate", term5508);
        setIntField(term5519, term5519.getClass(), "year", 2015);
        setShortField(term5519, term5519.getClass(), "month", (short) 4);
        setShortField(term5519, term5519.getClass(), "day", (short) 14);
        setField(term5518, term5518.getClass(), "date", term5519);
        setByteField(term5523, term5523.getClass(), "hour", (byte) 18);
        setByteField(term5523, term5523.getClass(), "minute", (byte) 24);
        setByteField(term5523, term5523.getClass(), "second", (byte) 32);
        setIntField(term5523, term5523.getClass(), "nano", 369233818);
        setField(term5518, term5518.getClass(), "time", term5523);
        setField(term5455, term5455.getClass(), "modifiedDate", term5518);
        setLongField(term5528, term5528.getClass(), "seconds", 122400L);
        setIntField(term5528, term5528.getClass(), "nanos", 0);
        setField(term5455, term5455.getClass(), "duration", term5528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuest", argTypes, term5455, args);
    }

};


