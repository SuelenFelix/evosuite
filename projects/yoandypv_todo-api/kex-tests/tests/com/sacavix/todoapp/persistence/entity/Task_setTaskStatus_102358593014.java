package com.sacavix.todoapp.persistence.entity;

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
import static com.sacavix.todoapp.persistence.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class Task_setTaskStatus_102358593014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4592;
     Object enum14;

    public Task_setTaskStatus_102358593014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4593 = new Long(-5476826692763582090L);
        Class<? extends Object> term4680 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term4679 = ((Class) term4680).getDeclaredField((String) "LATE");
        ((Field) term4679).setAccessible(true);
        Object enum13 = ((Field) term4679).get((Object) null);
        term4592 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term4619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4634 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4592, term4592.getClass(), "id", term4593);
        setField(term4592, term4592.getClass(), "title", "IoAlmYsBwc");
        setField(term4592, term4592.getClass(), "description", "TEParAifyi");
        setIntField(term4620, term4620.getClass(), "year", 2021);
        setShortField(term4620, term4620.getClass(), "month", (short) 8);
        setShortField(term4620, term4620.getClass(), "day", (short) 12);
        setField(term4619, term4619.getClass(), "date", term4620);
        setByteField(term4624, term4624.getClass(), "hour", (byte) 2);
        setByteField(term4624, term4624.getClass(), "minute", (byte) 17);
        setByteField(term4624, term4624.getClass(), "second", (byte) 51);
        setIntField(term4624, term4624.getClass(), "nano", 207375141);
        setField(term4619, term4619.getClass(), "time", term4624);
        setField(term4592, term4592.getClass(), "createdDate", term4619);
        setIntField(term4630, term4630.getClass(), "year", 2025);
        setShortField(term4630, term4630.getClass(), "month", (short) 11);
        setShortField(term4630, term4630.getClass(), "day", (short) 3);
        setField(term4629, term4629.getClass(), "date", term4630);
        setByteField(term4634, term4634.getClass(), "hour", (byte) 21);
        setByteField(term4634, term4634.getClass(), "minute", (byte) 24);
        setByteField(term4634, term4634.getClass(), "second", (byte) 23);
        setIntField(term4634, term4634.getClass(), "nano", 210986721);
        setField(term4629, term4629.getClass(), "time", term4634);
        setField(term4592, term4592.getClass(), "eta", term4629);
        setBooleanField(term4592, term4592.getClass(), "finished", false);
        setField(term4592, term4592.getClass(), "taskStatus", enum13);
        Class<? extends Object> term4944 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term4943 = ((Class) term4944).getDeclaredField((String) "ON_TIME");
        ((Field) term4943).setAccessible(true);
        enum14 = ((Field) term4943).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sacavix.todoapp.persistence.entity.TaskStatus");
        Object[] args = new Object[1];
        args[0] = enum14;
        callMethod(klass, "setTaskStatus", argTypes, term4592, args);
    }

};


