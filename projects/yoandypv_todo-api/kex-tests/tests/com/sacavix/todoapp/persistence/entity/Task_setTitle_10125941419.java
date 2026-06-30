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

public class Task_setTitle_10125941419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2790;

    public Task_setTitle_10125941419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2791 = new Long(6967924379644551255L);
        Class<? extends Object> term2882 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term2881 = ((Class) term2882).getDeclaredField((String) "ON_TIME");
        ((Field) term2881).setAccessible(true);
        Object enum8 = ((Field) term2881).get((Object) null);
        term2790 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term2817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2832 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2790, term2790.getClass(), "id", term2791);
        setField(term2790, term2790.getClass(), "title", "ZiaGIbnzTs");
        setField(term2790, term2790.getClass(), "description", "tbcdzjIfER");
        setIntField(term2818, term2818.getClass(), "year", 2015);
        setShortField(term2818, term2818.getClass(), "month", (short) 9);
        setShortField(term2818, term2818.getClass(), "day", (short) 16);
        setField(term2817, term2817.getClass(), "date", term2818);
        setByteField(term2822, term2822.getClass(), "hour", (byte) 6);
        setByteField(term2822, term2822.getClass(), "minute", (byte) 19);
        setByteField(term2822, term2822.getClass(), "second", (byte) 42);
        setIntField(term2822, term2822.getClass(), "nano", 630084975);
        setField(term2817, term2817.getClass(), "time", term2822);
        setField(term2790, term2790.getClass(), "createdDate", term2817);
        setIntField(term2828, term2828.getClass(), "year", 2029);
        setShortField(term2828, term2828.getClass(), "month", (short) 6);
        setShortField(term2828, term2828.getClass(), "day", (short) 23);
        setField(term2827, term2827.getClass(), "date", term2828);
        setByteField(term2832, term2832.getClass(), "hour", (byte) 21);
        setByteField(term2832, term2832.getClass(), "minute", (byte) 55);
        setByteField(term2832, term2832.getClass(), "second", (byte) 27);
        setIntField(term2832, term2832.getClass(), "nano", 66889274);
        setField(term2827, term2827.getClass(), "time", term2832);
        setField(term2790, term2790.getClass(), "eta", term2827);
        setBooleanField(term2790, term2790.getClass(), "finished", false);
        setField(term2790, term2790.getClass(), "taskStatus", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setTitle", argTypes, term2790, args);
    }

};


