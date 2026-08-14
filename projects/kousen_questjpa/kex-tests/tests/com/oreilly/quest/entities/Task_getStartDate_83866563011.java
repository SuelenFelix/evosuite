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

public class Task_getStartDate_83866563011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6305;

    public Task_getStartDate_83866563011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6306 = new Long(-1610676979013636850L);
        Long term6331 = new Long(2062173786000223358L);
        HashMap term6347 = new HashMap();
        Set<Object> term6401 =  ((Map) term6347).keySet();
        HashSet term6346 = new HashSet((Collection<? extends Object>) term6401);
        HashMap term6353 = new HashMap();
        Set<Object> term6402 =  ((Map) term6353).keySet();
        HashSet term6352 = new HashSet((Collection<? extends Object>) term6402);
        term6305 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term6321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6330 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term6358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6378 = newInstance(Class.forName("java.time.Duration"));
        setField(term6305, term6305.getClass(), "id", term6306);
        setField(term6305, term6305.getClass(), "name", "DfISiziTgG");
        setIntField(term6305, term6305.getClass(), "priority", 3);
        setIntField(term6321, term6321.getClass(), "year", 2026);
        setShortField(term6321, term6321.getClass(), "month", (short) 8);
        setShortField(term6321, term6321.getClass(), "day", (short) 12);
        setField(term6305, term6305.getClass(), "startDate", term6321);
        setIntField(term6325, term6325.getClass(), "year", 2026);
        setShortField(term6325, term6325.getClass(), "month", (short) 8);
        setShortField(term6325, term6325.getClass(), "day", (short) 12);
        setField(term6305, term6305.getClass(), "endDate", term6325);
        setBooleanField(term6305, term6305.getClass(), "completed", true);
        setField(term6330, term6330.getClass(), "id", term6331);
        setField(term6330, term6330.getClass(), "name", "XqgfKFvPSD");
        setLongField(term6330, term6330.getClass(), "version", 7009926388951271268L);
        setField(term6330, term6330.getClass(), "tasks", term6346);
        setField(term6330, term6330.getClass(), "knights", term6352);
        setField(term6305, term6305.getClass(), "quest", term6330);
        setIntField(term6359, term6359.getClass(), "year", 2017);
        setShortField(term6359, term6359.getClass(), "month", (short) 3);
        setShortField(term6359, term6359.getClass(), "day", (short) 5);
        setField(term6358, term6358.getClass(), "date", term6359);
        setByteField(term6363, term6363.getClass(), "hour", (byte) 20);
        setByteField(term6363, term6363.getClass(), "minute", (byte) 34);
        setByteField(term6363, term6363.getClass(), "second", (byte) 55);
        setIntField(term6363, term6363.getClass(), "nano", 78024496);
        setField(term6358, term6358.getClass(), "time", term6363);
        setField(term6305, term6305.getClass(), "createdDate", term6358);
        setIntField(term6369, term6369.getClass(), "year", 2020);
        setShortField(term6369, term6369.getClass(), "month", (short) 7);
        setShortField(term6369, term6369.getClass(), "day", (short) 24);
        setField(term6368, term6368.getClass(), "date", term6369);
        setByteField(term6373, term6373.getClass(), "hour", (byte) 0);
        setByteField(term6373, term6373.getClass(), "minute", (byte) 59);
        setByteField(term6373, term6373.getClass(), "second", (byte) 56);
        setIntField(term6373, term6373.getClass(), "nano", 320219201);
        setField(term6368, term6368.getClass(), "time", term6373);
        setField(term6305, term6305.getClass(), "modifiedDate", term6368);
        setLongField(term6378, term6378.getClass(), "seconds", 133200L);
        setIntField(term6378, term6378.getClass(), "nanos", 0);
        setField(term6305, term6305.getClass(), "duration", term6378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term6305, args);
    }

};


