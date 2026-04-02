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

public class Task_getId_21170510675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5691;

    public Task_getId_21170510675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5692 = new Long(-5788180182343976541L);
        Long term5717 = new Long(2936323121573284007L);
        HashMap term5733 = new HashMap();
        Set<Object> term5787 =  ((Map) term5733).keySet();
        HashSet term5732 = new HashSet((Collection<? extends Object>) term5787);
        HashMap term5739 = new HashMap();
        Set<Object> term5788 =  ((Map) term5739).keySet();
        HashSet term5738 = new HashSet((Collection<? extends Object>) term5788);
        term5691 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term5707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5716 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term5744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5759 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5764 = newInstance(Class.forName("java.time.Duration"));
        setField(term5691, term5691.getClass(), "id", term5692);
        setField(term5691, term5691.getClass(), "name", "jUbSRrkrYZ");
        setIntField(term5691, term5691.getClass(), "priority", 3);
        setIntField(term5707, term5707.getClass(), "year", 2026);
        setShortField(term5707, term5707.getClass(), "month", (short) 4);
        setShortField(term5707, term5707.getClass(), "day", (short) 2);
        setField(term5691, term5691.getClass(), "startDate", term5707);
        setIntField(term5711, term5711.getClass(), "year", 2026);
        setShortField(term5711, term5711.getClass(), "month", (short) 4);
        setShortField(term5711, term5711.getClass(), "day", (short) 2);
        setField(term5691, term5691.getClass(), "endDate", term5711);
        setBooleanField(term5691, term5691.getClass(), "completed", false);
        setField(term5716, term5716.getClass(), "id", term5717);
        setField(term5716, term5716.getClass(), "name", "bWWfajKbEX");
        setLongField(term5716, term5716.getClass(), "version", -4920224193275732920L);
        setField(term5716, term5716.getClass(), "tasks", term5732);
        setField(term5716, term5716.getClass(), "knights", term5738);
        setField(term5691, term5691.getClass(), "quest", term5716);
        setIntField(term5745, term5745.getClass(), "year", 2025);
        setShortField(term5745, term5745.getClass(), "month", (short) 4);
        setShortField(term5745, term5745.getClass(), "day", (short) 24);
        setField(term5744, term5744.getClass(), "date", term5745);
        setByteField(term5749, term5749.getClass(), "hour", (byte) 18);
        setByteField(term5749, term5749.getClass(), "minute", (byte) 11);
        setByteField(term5749, term5749.getClass(), "second", (byte) 40);
        setIntField(term5749, term5749.getClass(), "nano", 137454929);
        setField(term5744, term5744.getClass(), "time", term5749);
        setField(term5691, term5691.getClass(), "createdDate", term5744);
        setIntField(term5755, term5755.getClass(), "year", 2024);
        setShortField(term5755, term5755.getClass(), "month", (short) 1);
        setShortField(term5755, term5755.getClass(), "day", (short) 24);
        setField(term5754, term5754.getClass(), "date", term5755);
        setByteField(term5759, term5759.getClass(), "hour", (byte) 20);
        setByteField(term5759, term5759.getClass(), "minute", (byte) 28);
        setByteField(term5759, term5759.getClass(), "second", (byte) 39);
        setIntField(term5759, term5759.getClass(), "nano", 952728177);
        setField(term5754, term5754.getClass(), "time", term5759);
        setField(term5691, term5691.getClass(), "modifiedDate", term5754);
        setLongField(term5764, term5764.getClass(), "seconds", 194400L);
        setIntField(term5764, term5764.getClass(), "nanos", 0);
        setField(term5691, term5691.getClass(), "duration", term5764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5691, args);
    }

};


