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

public class Task_equals_14607085215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5216;
     Object term5275;

    public Task_equals_14607085215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5217 = new Long(-872011222785455006L);
        Class<? extends Object> term5297 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term5296 = ((Class) term5297).getDeclaredField((String) "ON_TIME");
        ((Field) term5296).setAccessible(true);
        Object enum15 = ((Field) term5296).get((Object) null);
        term5216 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term5243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5248 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5258 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5216, term5216.getClass(), "id", term5217);
        setField(term5216, term5216.getClass(), "title", "OWDIEULEFu");
        setField(term5216, term5216.getClass(), "description", "dWRymuLBtr");
        setIntField(term5244, term5244.getClass(), "year", 2016);
        setShortField(term5244, term5244.getClass(), "month", (short) 6);
        setShortField(term5244, term5244.getClass(), "day", (short) 15);
        setField(term5243, term5243.getClass(), "date", term5244);
        setByteField(term5248, term5248.getClass(), "hour", (byte) 21);
        setByteField(term5248, term5248.getClass(), "minute", (byte) 23);
        setByteField(term5248, term5248.getClass(), "second", (byte) 23);
        setIntField(term5248, term5248.getClass(), "nano", 433372070);
        setField(term5243, term5243.getClass(), "time", term5248);
        setField(term5216, term5216.getClass(), "createdDate", term5243);
        setIntField(term5254, term5254.getClass(), "year", 2012);
        setShortField(term5254, term5254.getClass(), "month", (short) 8);
        setShortField(term5254, term5254.getClass(), "day", (short) 25);
        setField(term5253, term5253.getClass(), "date", term5254);
        setByteField(term5258, term5258.getClass(), "hour", (byte) 19);
        setByteField(term5258, term5258.getClass(), "minute", (byte) 49);
        setByteField(term5258, term5258.getClass(), "second", (byte) 8);
        setIntField(term5258, term5258.getClass(), "nano", 912685024);
        setField(term5253, term5253.getClass(), "time", term5258);
        setField(term5216, term5216.getClass(), "eta", term5253);
        setBooleanField(term5216, term5216.getClass(), "finished", false);
        setField(term5216, term5216.getClass(), "taskStatus", enum15);
        term5275 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5275;
        callMethod(klass, "equals", argTypes, term5216, args);
    }

};


