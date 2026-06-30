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

public class Task_isFinished_14768675346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1768;

    public Task_isFinished_14768675346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1769 = new Long(7411271909051562686L);
        Class<? extends Object> term1845 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term1844 = ((Class) term1845).getDeclaredField((String) "LATE");
        ((Field) term1844).setAccessible(true);
        Object enum5 = ((Field) term1844).get((Object) null);
        term1768 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term1795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1810 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1768, term1768.getClass(), "id", term1769);
        setField(term1768, term1768.getClass(), "title", "NRdvgJlhkX");
        setField(term1768, term1768.getClass(), "description", "uuaPigETmJ");
        setIntField(term1796, term1796.getClass(), "year", 2019);
        setShortField(term1796, term1796.getClass(), "month", (short) 2);
        setShortField(term1796, term1796.getClass(), "day", (short) 21);
        setField(term1795, term1795.getClass(), "date", term1796);
        setByteField(term1800, term1800.getClass(), "hour", (byte) 5);
        setByteField(term1800, term1800.getClass(), "minute", (byte) 41);
        setByteField(term1800, term1800.getClass(), "second", (byte) 11);
        setIntField(term1800, term1800.getClass(), "nano", 859829782);
        setField(term1795, term1795.getClass(), "time", term1800);
        setField(term1768, term1768.getClass(), "createdDate", term1795);
        setIntField(term1806, term1806.getClass(), "year", 2018);
        setShortField(term1806, term1806.getClass(), "month", (short) 9);
        setShortField(term1806, term1806.getClass(), "day", (short) 28);
        setField(term1805, term1805.getClass(), "date", term1806);
        setByteField(term1810, term1810.getClass(), "hour", (byte) 3);
        setByteField(term1810, term1810.getClass(), "minute", (byte) 37);
        setByteField(term1810, term1810.getClass(), "second", (byte) 46);
        setIntField(term1810, term1810.getClass(), "nano", 763326845);
        setField(term1805, term1805.getClass(), "time", term1810);
        setField(term1768, term1768.getClass(), "eta", term1805);
        setBooleanField(term1768, term1768.getClass(), "finished", true);
        setField(term1768, term1768.getClass(), "taskStatus", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFinished", argTypes, term1768, args);
    }

};


