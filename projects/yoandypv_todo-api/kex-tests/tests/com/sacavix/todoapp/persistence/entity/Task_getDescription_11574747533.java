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

public class Task_getDescription_11574747533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public Task_getDescription_11574747533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term725 = new Long(-8257434502486459194L);
        Class<? extends Object> term804 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term803 = ((Class) term804).getDeclaredField((String) "ON_TIME");
        ((Field) term803).setAccessible(true);
        Object enum2 = ((Field) term803).get((Object) null);
        term724 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term766 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term724, term724.getClass(), "id", term725);
        setField(term724, term724.getClass(), "title", "jJCZpVmanW");
        setField(term724, term724.getClass(), "description", "EGtDIRbSSb");
        setIntField(term752, term752.getClass(), "year", 2022);
        setShortField(term752, term752.getClass(), "month", (short) 2);
        setShortField(term752, term752.getClass(), "day", (short) 26);
        setField(term751, term751.getClass(), "date", term752);
        setByteField(term756, term756.getClass(), "hour", (byte) 11);
        setByteField(term756, term756.getClass(), "minute", (byte) 42);
        setByteField(term756, term756.getClass(), "second", (byte) 15);
        setIntField(term756, term756.getClass(), "nano", 377731937);
        setField(term751, term751.getClass(), "time", term756);
        setField(term724, term724.getClass(), "createdDate", term751);
        setIntField(term762, term762.getClass(), "year", 2026);
        setShortField(term762, term762.getClass(), "month", (short) 12);
        setShortField(term762, term762.getClass(), "day", (short) 14);
        setField(term761, term761.getClass(), "date", term762);
        setByteField(term766, term766.getClass(), "hour", (byte) 16);
        setByteField(term766, term766.getClass(), "minute", (byte) 34);
        setByteField(term766, term766.getClass(), "second", (byte) 9);
        setIntField(term766, term766.getClass(), "nano", 518326996);
        setField(term761, term761.getClass(), "time", term766);
        setField(term724, term724.getClass(), "eta", term761);
        setBooleanField(term724, term724.getClass(), "finished", false);
        setField(term724, term724.getClass(), "taskStatus", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term724, args);
    }

};


