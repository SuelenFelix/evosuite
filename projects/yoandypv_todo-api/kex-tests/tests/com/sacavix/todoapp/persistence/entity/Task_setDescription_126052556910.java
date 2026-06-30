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

public class Task_setDescription_126052556910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;

    public Task_setDescription_126052556910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3165 = new Long(-2813493605142626659L);
        Class<? extends Object> term3253 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term3252 = ((Class) term3253).getDeclaredField((String) "LATE");
        ((Field) term3252).setAccessible(true);
        Object enum9 = ((Field) term3252).get((Object) null);
        term3164 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term3191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3206 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3164, term3164.getClass(), "id", term3165);
        setField(term3164, term3164.getClass(), "title", "pCTimMblYc");
        setField(term3164, term3164.getClass(), "description", "hNxWaHcfhY");
        setIntField(term3192, term3192.getClass(), "year", 2017);
        setShortField(term3192, term3192.getClass(), "month", (short) 3);
        setShortField(term3192, term3192.getClass(), "day", (short) 5);
        setField(term3191, term3191.getClass(), "date", term3192);
        setByteField(term3196, term3196.getClass(), "hour", (byte) 20);
        setByteField(term3196, term3196.getClass(), "minute", (byte) 34);
        setByteField(term3196, term3196.getClass(), "second", (byte) 55);
        setIntField(term3196, term3196.getClass(), "nano", 78024496);
        setField(term3191, term3191.getClass(), "time", term3196);
        setField(term3164, term3164.getClass(), "createdDate", term3191);
        setIntField(term3202, term3202.getClass(), "year", 2020);
        setShortField(term3202, term3202.getClass(), "month", (short) 7);
        setShortField(term3202, term3202.getClass(), "day", (short) 24);
        setField(term3201, term3201.getClass(), "date", term3202);
        setByteField(term3206, term3206.getClass(), "hour", (byte) 0);
        setByteField(term3206, term3206.getClass(), "minute", (byte) 59);
        setByteField(term3206, term3206.getClass(), "second", (byte) 56);
        setIntField(term3206, term3206.getClass(), "nano", 320219201);
        setField(term3201, term3201.getClass(), "time", term3206);
        setField(term3164, term3164.getClass(), "eta", term3201);
        setBooleanField(term3164, term3164.getClass(), "finished", true);
        setField(term3164, term3164.getClass(), "taskStatus", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setDescription", argTypes, term3164, args);
    }

};


