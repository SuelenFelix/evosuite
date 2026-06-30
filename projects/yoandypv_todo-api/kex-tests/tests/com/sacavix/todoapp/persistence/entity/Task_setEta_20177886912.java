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

public class Task_setEta_20177886912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3888;
     Object term3944;

    public Task_setEta_20177886912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3889 = new Long(-4325723315152823407L);
        Class<? extends Object> term3975 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term3974 = ((Class) term3975).getDeclaredField((String) "LATE");
        ((Field) term3974).setAccessible(true);
        Object enum11 = ((Field) term3974).get((Object) null);
        term3888 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term3915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3920 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3930 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3888, term3888.getClass(), "id", term3889);
        setField(term3888, term3888.getClass(), "title", "BYqFIqCKAV");
        setField(term3888, term3888.getClass(), "description", "vrQLuWIDJX");
        setIntField(term3916, term3916.getClass(), "year", 2027);
        setShortField(term3916, term3916.getClass(), "month", (short) 8);
        setShortField(term3916, term3916.getClass(), "day", (short) 26);
        setField(term3915, term3915.getClass(), "date", term3916);
        setByteField(term3920, term3920.getClass(), "hour", (byte) 5);
        setByteField(term3920, term3920.getClass(), "minute", (byte) 11);
        setByteField(term3920, term3920.getClass(), "second", (byte) 9);
        setIntField(term3920, term3920.getClass(), "nano", 219245092);
        setField(term3915, term3915.getClass(), "time", term3920);
        setField(term3888, term3888.getClass(), "createdDate", term3915);
        setIntField(term3926, term3926.getClass(), "year", 2025);
        setShortField(term3926, term3926.getClass(), "month", (short) 3);
        setShortField(term3926, term3926.getClass(), "day", (short) 9);
        setField(term3925, term3925.getClass(), "date", term3926);
        setByteField(term3930, term3930.getClass(), "hour", (byte) 5);
        setByteField(term3930, term3930.getClass(), "minute", (byte) 49);
        setByteField(term3930, term3930.getClass(), "second", (byte) 12);
        setIntField(term3930, term3930.getClass(), "nano", 791695028);
        setField(term3925, term3925.getClass(), "time", term3930);
        setField(term3888, term3888.getClass(), "eta", term3925);
        setBooleanField(term3888, term3888.getClass(), "finished", true);
        setField(term3888, term3888.getClass(), "taskStatus", enum11);
        term3944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3949 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3945, term3945.getClass(), "year", 2023);
        setShortField(term3945, term3945.getClass(), "month", (short) 9);
        setShortField(term3945, term3945.getClass(), "day", (short) 23);
        setField(term3944, term3944.getClass(), "date", term3945);
        setByteField(term3949, term3949.getClass(), "hour", (byte) 12);
        setByteField(term3949, term3949.getClass(), "minute", (byte) 55);
        setByteField(term3949, term3949.getClass(), "second", (byte) 58);
        setIntField(term3949, term3949.getClass(), "nano", 159178396);
        setField(term3944, term3944.getClass(), "time", term3949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3944;
        callMethod(klass, "setEta", argTypes, term3888, args);
    }

};


