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

public class Task_hashCode_204222220918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7002;

    public Task_hashCode_204222220918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7003 = new Long(9013624480170062917L);
        Long term7028 = new Long(7862575738391801707L);
        HashMap term7044 = new HashMap();
        Set<Object> term7098 =  ((Map) term7044).keySet();
        HashSet term7043 = new HashSet((Collection<? extends Object>) term7098);
        HashMap term7050 = new HashMap();
        Set<Object> term7099 =  ((Map) term7050).keySet();
        HashSet term7049 = new HashSet((Collection<? extends Object>) term7099);
        term7002 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        Object term7018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7027 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term7055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7075 = newInstance(Class.forName("java.time.Duration"));
        setField(term7002, term7002.getClass(), "id", term7003);
        setField(term7002, term7002.getClass(), "name", "fztQhjqwdP");
        setIntField(term7002, term7002.getClass(), "priority", 3);
        setIntField(term7018, term7018.getClass(), "year", 2026);
        setShortField(term7018, term7018.getClass(), "month", (short) 4);
        setShortField(term7018, term7018.getClass(), "day", (short) 2);
        setField(term7002, term7002.getClass(), "startDate", term7018);
        setIntField(term7022, term7022.getClass(), "year", 2026);
        setShortField(term7022, term7022.getClass(), "month", (short) 4);
        setShortField(term7022, term7022.getClass(), "day", (short) 2);
        setField(term7002, term7002.getClass(), "endDate", term7022);
        setBooleanField(term7002, term7002.getClass(), "completed", true);
        setField(term7027, term7027.getClass(), "id", term7028);
        setField(term7027, term7027.getClass(), "name", "eVpkWxjuki");
        setLongField(term7027, term7027.getClass(), "version", 5262507301787091109L);
        setField(term7027, term7027.getClass(), "tasks", term7043);
        setField(term7027, term7027.getClass(), "knights", term7049);
        setField(term7002, term7002.getClass(), "quest", term7027);
        setIntField(term7056, term7056.getClass(), "year", 2012);
        setShortField(term7056, term7056.getClass(), "month", (short) 3);
        setShortField(term7056, term7056.getClass(), "day", (short) 27);
        setField(term7055, term7055.getClass(), "date", term7056);
        setByteField(term7060, term7060.getClass(), "hour", (byte) 17);
        setByteField(term7060, term7060.getClass(), "minute", (byte) 49);
        setByteField(term7060, term7060.getClass(), "second", (byte) 24);
        setIntField(term7060, term7060.getClass(), "nano", 530647398);
        setField(term7055, term7055.getClass(), "time", term7060);
        setField(term7002, term7002.getClass(), "createdDate", term7055);
        setIntField(term7066, term7066.getClass(), "year", 2010);
        setShortField(term7066, term7066.getClass(), "month", (short) 6);
        setShortField(term7066, term7066.getClass(), "day", (short) 14);
        setField(term7065, term7065.getClass(), "date", term7066);
        setByteField(term7070, term7070.getClass(), "hour", (byte) 6);
        setByteField(term7070, term7070.getClass(), "minute", (byte) 22);
        setByteField(term7070, term7070.getClass(), "second", (byte) 20);
        setIntField(term7070, term7070.getClass(), "nano", 25133051);
        setField(term7065, term7065.getClass(), "time", term7070);
        setField(term7002, term7002.getClass(), "modifiedDate", term7065);
        setLongField(term7075, term7075.getClass(), "seconds", 352800L);
        setIntField(term7075, term7075.getClass(), "nanos", 0);
        setField(term7002, term7002.getClass(), "duration", term7075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7002, args);
    }

};


