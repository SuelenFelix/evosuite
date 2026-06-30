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

public class Task_getTitle_14362625572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372;

    public Task_getTitle_14362625572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term373 = new Long(6375119433582206027L);
        Class<? extends Object> term452 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term451 = ((Class) term452).getDeclaredField((String) "ON_TIME");
        ((Field) term451).setAccessible(true);
        Object enum1 = ((Field) term451).get((Object) null);
        term372 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term372, term372.getClass(), "id", term373);
        setField(term372, term372.getClass(), "title", "MuLcgQHgqz");
        setField(term372, term372.getClass(), "description", "xxtlPwDYFs");
        setIntField(term400, term400.getClass(), "year", 2015);
        setShortField(term400, term400.getClass(), "month", (short) 9);
        setShortField(term400, term400.getClass(), "day", (short) 19);
        setField(term399, term399.getClass(), "date", term400);
        setByteField(term404, term404.getClass(), "hour", (byte) 9);
        setByteField(term404, term404.getClass(), "minute", (byte) 4);
        setByteField(term404, term404.getClass(), "second", (byte) 10);
        setIntField(term404, term404.getClass(), "nano", 401765865);
        setField(term399, term399.getClass(), "time", term404);
        setField(term372, term372.getClass(), "createdDate", term399);
        setIntField(term410, term410.getClass(), "year", 2015);
        setShortField(term410, term410.getClass(), "month", (short) 4);
        setShortField(term410, term410.getClass(), "day", (short) 14);
        setField(term409, term409.getClass(), "date", term410);
        setByteField(term414, term414.getClass(), "hour", (byte) 18);
        setByteField(term414, term414.getClass(), "minute", (byte) 24);
        setByteField(term414, term414.getClass(), "second", (byte) 32);
        setIntField(term414, term414.getClass(), "nano", 369233818);
        setField(term409, term409.getClass(), "time", term414);
        setField(term372, term372.getClass(), "eta", term409);
        setBooleanField(term372, term372.getClass(), "finished", false);
        setField(term372, term372.getClass(), "taskStatus", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term372, args);
    }

};


