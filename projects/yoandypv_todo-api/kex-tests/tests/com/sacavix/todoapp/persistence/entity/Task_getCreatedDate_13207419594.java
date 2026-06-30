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

public class Task_getCreatedDate_13207419594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;

    public Task_getCreatedDate_13207419594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1077 = new Long(-8400487765614892086L);
        Class<? extends Object> term1156 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term1155 = ((Class) term1156).getDeclaredField((String) "ON_TIME");
        ((Field) term1155).setAccessible(true);
        Object enum3 = ((Field) term1155).get((Object) null);
        term1076 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term1103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1108 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1118 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1076, term1076.getClass(), "id", term1077);
        setField(term1076, term1076.getClass(), "title", "SzjVpOQTyS");
        setField(term1076, term1076.getClass(), "description", "MjGYSRKTNF");
        setIntField(term1104, term1104.getClass(), "year", 2025);
        setShortField(term1104, term1104.getClass(), "month", (short) 4);
        setShortField(term1104, term1104.getClass(), "day", (short) 24);
        setField(term1103, term1103.getClass(), "date", term1104);
        setByteField(term1108, term1108.getClass(), "hour", (byte) 18);
        setByteField(term1108, term1108.getClass(), "minute", (byte) 11);
        setByteField(term1108, term1108.getClass(), "second", (byte) 40);
        setIntField(term1108, term1108.getClass(), "nano", 137454929);
        setField(term1103, term1103.getClass(), "time", term1108);
        setField(term1076, term1076.getClass(), "createdDate", term1103);
        setIntField(term1114, term1114.getClass(), "year", 2024);
        setShortField(term1114, term1114.getClass(), "month", (short) 1);
        setShortField(term1114, term1114.getClass(), "day", (short) 24);
        setField(term1113, term1113.getClass(), "date", term1114);
        setByteField(term1118, term1118.getClass(), "hour", (byte) 20);
        setByteField(term1118, term1118.getClass(), "minute", (byte) 28);
        setByteField(term1118, term1118.getClass(), "second", (byte) 39);
        setIntField(term1118, term1118.getClass(), "nano", 952728177);
        setField(term1113, term1113.getClass(), "time", term1118);
        setField(term1076, term1076.getClass(), "eta", term1113);
        setBooleanField(term1076, term1076.getClass(), "finished", false);
        setField(term1076, term1076.getClass(), "taskStatus", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term1076, args);
    }

};


