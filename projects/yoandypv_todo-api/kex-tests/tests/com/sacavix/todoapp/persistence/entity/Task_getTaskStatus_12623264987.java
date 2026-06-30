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

public class Task_getTaskStatus_12623264987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108;

    public Task_getTaskStatus_12623264987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2109 = new Long(4872422362414183754L);
        Class<? extends Object> term2185 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term2184 = ((Class) term2185).getDeclaredField((String) "LATE");
        ((Field) term2184).setAccessible(true);
        Object enum6 = ((Field) term2184).get((Object) null);
        term2108 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term2135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2150 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2108, term2108.getClass(), "id", term2109);
        setField(term2108, term2108.getClass(), "title", "MxlszYVzRf");
        setField(term2108, term2108.getClass(), "description", "LQFpaHEwXR");
        setIntField(term2136, term2136.getClass(), "year", 2012);
        setShortField(term2136, term2136.getClass(), "month", (short) 9);
        setShortField(term2136, term2136.getClass(), "day", (short) 11);
        setField(term2135, term2135.getClass(), "date", term2136);
        setByteField(term2140, term2140.getClass(), "hour", (byte) 22);
        setByteField(term2140, term2140.getClass(), "minute", (byte) 10);
        setByteField(term2140, term2140.getClass(), "second", (byte) 8);
        setIntField(term2140, term2140.getClass(), "nano", 380008862);
        setField(term2135, term2135.getClass(), "time", term2140);
        setField(term2108, term2108.getClass(), "createdDate", term2135);
        setIntField(term2146, term2146.getClass(), "year", 2021);
        setShortField(term2146, term2146.getClass(), "month", (short) 9);
        setShortField(term2146, term2146.getClass(), "day", (short) 7);
        setField(term2145, term2145.getClass(), "date", term2146);
        setByteField(term2150, term2150.getClass(), "hour", (byte) 5);
        setByteField(term2150, term2150.getClass(), "minute", (byte) 25);
        setByteField(term2150, term2150.getClass(), "second", (byte) 7);
        setIntField(term2150, term2150.getClass(), "nano", 755924076);
        setField(term2145, term2145.getClass(), "time", term2150);
        setField(term2108, term2108.getClass(), "eta", term2145);
        setBooleanField(term2108, term2108.getClass(), "finished", true);
        setField(term2108, term2108.getClass(), "taskStatus", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskStatus", argTypes, term2108, args);
    }

};


