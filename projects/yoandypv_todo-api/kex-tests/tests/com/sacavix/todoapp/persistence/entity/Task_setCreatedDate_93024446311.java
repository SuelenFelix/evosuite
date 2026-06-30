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

public class Task_setCreatedDate_93024446311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3526;
     Object term3585;

    public Task_setCreatedDate_93024446311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3527 = new Long(-8885298608300233488L);
        Class<? extends Object> term3616 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term3615 = ((Class) term3616).getDeclaredField((String) "ON_TIME");
        ((Field) term3615).setAccessible(true);
        Object enum10 = ((Field) term3615).get((Object) null);
        term3526 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term3553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3568 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3526, term3526.getClass(), "id", term3527);
        setField(term3526, term3526.getClass(), "title", "xOEqzGAmDU");
        setField(term3526, term3526.getClass(), "description", "eZFUvlxvGV");
        setIntField(term3554, term3554.getClass(), "year", 2014);
        setShortField(term3554, term3554.getClass(), "month", (short) 7);
        setShortField(term3554, term3554.getClass(), "day", (short) 13);
        setField(term3553, term3553.getClass(), "date", term3554);
        setByteField(term3558, term3558.getClass(), "hour", (byte) 21);
        setByteField(term3558, term3558.getClass(), "minute", (byte) 46);
        setByteField(term3558, term3558.getClass(), "second", (byte) 0);
        setIntField(term3558, term3558.getClass(), "nano", 887884128);
        setField(term3553, term3553.getClass(), "time", term3558);
        setField(term3526, term3526.getClass(), "createdDate", term3553);
        setIntField(term3564, term3564.getClass(), "year", 2023);
        setShortField(term3564, term3564.getClass(), "month", (short) 3);
        setShortField(term3564, term3564.getClass(), "day", (short) 7);
        setField(term3563, term3563.getClass(), "date", term3564);
        setByteField(term3568, term3568.getClass(), "hour", (byte) 21);
        setByteField(term3568, term3568.getClass(), "minute", (byte) 15);
        setByteField(term3568, term3568.getClass(), "second", (byte) 43);
        setIntField(term3568, term3568.getClass(), "nano", 639721472);
        setField(term3563, term3563.getClass(), "time", term3568);
        setField(term3526, term3526.getClass(), "eta", term3563);
        setBooleanField(term3526, term3526.getClass(), "finished", false);
        setField(term3526, term3526.getClass(), "taskStatus", enum10);
        term3585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3590 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3586, term3586.getClass(), "year", 2015);
        setShortField(term3586, term3586.getClass(), "month", (short) 3);
        setShortField(term3586, term3586.getClass(), "day", (short) 10);
        setField(term3585, term3585.getClass(), "date", term3586);
        setByteField(term3590, term3590.getClass(), "hour", (byte) 23);
        setByteField(term3590, term3590.getClass(), "minute", (byte) 34);
        setByteField(term3590, term3590.getClass(), "second", (byte) 44);
        setIntField(term3590, term3590.getClass(), "nano", 587322824);
        setField(term3585, term3585.getClass(), "time", term3590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3585;
        callMethod(klass, "setCreatedDate", argTypes, term3526, args);
    }

};


