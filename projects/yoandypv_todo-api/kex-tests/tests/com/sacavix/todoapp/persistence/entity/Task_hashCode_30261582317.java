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

public class Task_hashCode_30261582317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5910;

    public Task_hashCode_30261582317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5911 = new Long(5127676408959197577L);
        Class<? extends Object> term5987 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term5986 = ((Class) term5987).getDeclaredField((String) "LATE");
        ((Field) term5986).setAccessible(true);
        Object enum17 = ((Field) term5986).get((Object) null);
        term5910 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term5937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5952 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5910, term5910.getClass(), "id", term5911);
        setField(term5910, term5910.getClass(), "title", "kuTXqwMtDB");
        setField(term5910, term5910.getClass(), "description", "Ghbwtircqb");
        setIntField(term5938, term5938.getClass(), "year", 2010);
        setShortField(term5938, term5938.getClass(), "month", (short) 5);
        setShortField(term5938, term5938.getClass(), "day", (short) 2);
        setField(term5937, term5937.getClass(), "date", term5938);
        setByteField(term5942, term5942.getClass(), "hour", (byte) 2);
        setByteField(term5942, term5942.getClass(), "minute", (byte) 22);
        setByteField(term5942, term5942.getClass(), "second", (byte) 33);
        setIntField(term5942, term5942.getClass(), "nano", 530835039);
        setField(term5937, term5937.getClass(), "time", term5942);
        setField(term5910, term5910.getClass(), "createdDate", term5937);
        setIntField(term5948, term5948.getClass(), "year", 2024);
        setShortField(term5948, term5948.getClass(), "month", (short) 4);
        setShortField(term5948, term5948.getClass(), "day", (short) 24);
        setField(term5947, term5947.getClass(), "date", term5948);
        setByteField(term5952, term5952.getClass(), "hour", (byte) 7);
        setByteField(term5952, term5952.getClass(), "minute", (byte) 2);
        setByteField(term5952, term5952.getClass(), "second", (byte) 51);
        setIntField(term5952, term5952.getClass(), "nano", 635502964);
        setField(term5947, term5947.getClass(), "time", term5952);
        setField(term5910, term5910.getClass(), "eta", term5947);
        setBooleanField(term5910, term5910.getClass(), "finished", true);
        setField(term5910, term5910.getClass(), "taskStatus", enum17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5910, args);
    }

};


