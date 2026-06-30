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

public class Task_getId_3774446811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Task_getId_3774446811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Class<? extends Object> term100 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term99 = ((Class) term100).getDeclaredField((String) "ON_TIME");
        ((Field) term99).setAccessible(true);
        Object enum0 = ((Field) term99).get((Object) null);
        term1 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term28 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "title", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "description", "sjlJAEtRrb");
        setIntField(term29, term29.getClass(), "year", 2012);
        setShortField(term29, term29.getClass(), "month", (short) 8);
        setShortField(term29, term29.getClass(), "day", (short) 25);
        setField(term28, term28.getClass(), "date", term29);
        setByteField(term33, term33.getClass(), "hour", (byte) 5);
        setByteField(term33, term33.getClass(), "minute", (byte) 20);
        setByteField(term33, term33.getClass(), "second", (byte) 50);
        setIntField(term33, term33.getClass(), "nano", 345595912);
        setField(term28, term28.getClass(), "time", term33);
        setField(term1, term1.getClass(), "createdDate", term28);
        setIntField(term39, term39.getClass(), "year", 2021);
        setShortField(term39, term39.getClass(), "month", (short) 1);
        setShortField(term39, term39.getClass(), "day", (short) 18);
        setField(term38, term38.getClass(), "date", term39);
        setByteField(term43, term43.getClass(), "hour", (byte) 13);
        setByteField(term43, term43.getClass(), "minute", (byte) 38);
        setByteField(term43, term43.getClass(), "second", (byte) 26);
        setIntField(term43, term43.getClass(), "nano", 544608644);
        setField(term38, term38.getClass(), "time", term43);
        setField(term1, term1.getClass(), "eta", term38);
        setBooleanField(term1, term1.getClass(), "finished", false);
        setField(term1, term1.getClass(), "taskStatus", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


