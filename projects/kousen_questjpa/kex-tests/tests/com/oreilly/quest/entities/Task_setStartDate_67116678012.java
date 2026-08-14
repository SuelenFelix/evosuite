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

public class Task_setStartDate_67116678012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6403;
     Object term6479;

    public Task_setStartDate_67116678012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6404 = new Long(-8658027316505137504L);
        Long term6429 = new Long(414749984815662075L);
        HashMap term6445 = new HashMap();
        Set<Object> term6503 =  ((Map) term6445).keySet();
        HashSet term6444 = new HashSet((Collection<? extends Object>) term6503);
        HashMap term6451 = new HashMap();
        Set<Object> term6504 =  ((Map) term6451).keySet();
        HashSet term6450 = new HashSet((Collection<? extends Object>) term6504);
        term6403 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6428 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6456 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6461 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6471 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6476 = newInstance(Class.forName("java.time.Duration"));
        setField(term6403, term6403.getClass(), "id", term6404);
        setField(term6403, term6403.getClass(), "name", "JiVRgTZvKc");
        setIntField(term6403, term6403.getClass(), "priority", 3);
        setIntField(term6419, term6419.getClass(), "year", 2026);
        setShortField(term6419, term6419.getClass(), "month", (short) 8);
        setShortField(term6419, term6419.getClass(), "day", (short) 12);
        setField(term6403, term6403.getClass(), "startDate", term6419);
        setIntField(term6423, term6423.getClass(), "year", 2026);
        setShortField(term6423, term6423.getClass(), "month", (short) 8);
        setShortField(term6423, term6423.getClass(), "day", (short) 12);
        setField(term6403, term6403.getClass(), "endDate", term6423);
        setBooleanField(term6403, term6403.getClass(), "completed", false);
        setField(term6428, term6428.getClass(), "id", term6429);
        setField(term6428, term6428.getClass(), "name", "XPKmummaqg");
        setLongField(term6428, term6428.getClass(), "version", -7672528020740371001L);
        setField(term6428, term6428.getClass(), "tasks", term6444);
        setField(term6428, term6428.getClass(), "knights", term6450);
        setField(term6403, term6403.getClass(), "quest", term6428);
        setIntField(term6457, term6457.getClass(), "year", 2014);
        setShortField(term6457, term6457.getClass(), "month", (short) 7);
        setShortField(term6457, term6457.getClass(), "day", (short) 13);
        setField(term6456, term6456.getClass(), "date", term6457);
        setByteField(term6461, term6461.getClass(), "hour", (byte) 21);
        setByteField(term6461, term6461.getClass(), "minute", (byte) 46);
        setByteField(term6461, term6461.getClass(), "second", (byte) 0);
        setIntField(term6461, term6461.getClass(), "nano", 887884128);
        setField(term6456, term6456.getClass(), "time", term6461);
        setField(term6403, term6403.getClass(), "createdDate", term6456);
        setIntField(term6467, term6467.getClass(), "year", 2023);
        setShortField(term6467, term6467.getClass(), "month", (short) 3);
        setShortField(term6467, term6467.getClass(), "day", (short) 7);
        setField(term6466, term6466.getClass(), "date", term6467);
        setByteField(term6471, term6471.getClass(), "hour", (byte) 21);
        setByteField(term6471, term6471.getClass(), "minute", (byte) 15);
        setByteField(term6471, term6471.getClass(), "second", (byte) 43);
        setIntField(term6471, term6471.getClass(), "nano", 639721472);
        setField(term6466, term6466.getClass(), "time", term6471);
        setField(term6403, term6403.getClass(), "modifiedDate", term6466);
        setLongField(term6476, term6476.getClass(), "seconds", 302400L);
        setIntField(term6476, term6476.getClass(), "nanos", 0);
        setField(term6403, term6403.getClass(), "duration", term6476);
        term6479 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term6479, term6479.getClass(), "year", 2012);
        setShortField(term6479, term6479.getClass(), "month", (short) 8);
        setShortField(term6479, term6479.getClass(), "day", (short) 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term6479;
        callMethod(klass, "setStartDate", argTypes, term6403, args);
    }

};


