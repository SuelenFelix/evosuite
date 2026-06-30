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

public class Task_setId_8074864398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2448;
     Object term2504;

    public Task_setId_8074864398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2449 = new Long(6811161968424632369L);
        Class<? extends Object> term2527 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term2526 = ((Class) term2527).getDeclaredField((String) "LATE");
        ((Field) term2526).setAccessible(true);
        Object enum7 = ((Field) term2526).get((Object) null);
        term2448 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term2475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2490 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2448, term2448.getClass(), "id", term2449);
        setField(term2448, term2448.getClass(), "title", "oVcInYnLWB");
        setField(term2448, term2448.getClass(), "description", "aJlieCFVtF");
        setIntField(term2476, term2476.getClass(), "year", 2012);
        setShortField(term2476, term2476.getClass(), "month", (short) 2);
        setShortField(term2476, term2476.getClass(), "day", (short) 19);
        setField(term2475, term2475.getClass(), "date", term2476);
        setByteField(term2480, term2480.getClass(), "hour", (byte) 8);
        setByteField(term2480, term2480.getClass(), "minute", (byte) 4);
        setByteField(term2480, term2480.getClass(), "second", (byte) 43);
        setIntField(term2480, term2480.getClass(), "nano", 114930008);
        setField(term2475, term2475.getClass(), "time", term2480);
        setField(term2448, term2448.getClass(), "createdDate", term2475);
        setIntField(term2486, term2486.getClass(), "year", 2017);
        setShortField(term2486, term2486.getClass(), "month", (short) 6);
        setShortField(term2486, term2486.getClass(), "day", (short) 8);
        setField(term2485, term2485.getClass(), "date", term2486);
        setByteField(term2490, term2490.getClass(), "hour", (byte) 0);
        setByteField(term2490, term2490.getClass(), "minute", (byte) 18);
        setByteField(term2490, term2490.getClass(), "second", (byte) 55);
        setIntField(term2490, term2490.getClass(), "nano", 680586717);
        setField(term2485, term2485.getClass(), "time", term2490);
        setField(term2448, term2448.getClass(), "eta", term2485);
        setBooleanField(term2448, term2448.getClass(), "finished", true);
        setField(term2448, term2448.getClass(), "taskStatus", enum7);
        term2504 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2504;
        callMethod(klass, "setId", argTypes, term2448, args);
    }

};


