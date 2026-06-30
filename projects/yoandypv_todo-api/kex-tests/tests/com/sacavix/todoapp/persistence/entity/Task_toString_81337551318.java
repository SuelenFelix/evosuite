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

public class Task_toString_81337551318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6250;

    public Task_toString_81337551318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6251 = new Long(-6573104506744284592L);
        Class<? extends Object> term6330 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term6329 = ((Class) term6330).getDeclaredField((String) "ON_TIME");
        ((Field) term6329).setAccessible(true);
        Object enum18 = ((Field) term6329).get((Object) null);
        term6250 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term6277 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6278 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6282 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6292 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6250, term6250.getClass(), "id", term6251);
        setField(term6250, term6250.getClass(), "title", "xrwlQZdwCp");
        setField(term6250, term6250.getClass(), "description", "IDCWpPLRkE");
        setIntField(term6278, term6278.getClass(), "year", 2010);
        setShortField(term6278, term6278.getClass(), "month", (short) 1);
        setShortField(term6278, term6278.getClass(), "day", (short) 17);
        setField(term6277, term6277.getClass(), "date", term6278);
        setByteField(term6282, term6282.getClass(), "hour", (byte) 13);
        setByteField(term6282, term6282.getClass(), "minute", (byte) 5);
        setByteField(term6282, term6282.getClass(), "second", (byte) 51);
        setIntField(term6282, term6282.getClass(), "nano", 362260580);
        setField(term6277, term6277.getClass(), "time", term6282);
        setField(term6250, term6250.getClass(), "createdDate", term6277);
        setIntField(term6288, term6288.getClass(), "year", 2010);
        setShortField(term6288, term6288.getClass(), "month", (short) 9);
        setShortField(term6288, term6288.getClass(), "day", (short) 28);
        setField(term6287, term6287.getClass(), "date", term6288);
        setByteField(term6292, term6292.getClass(), "hour", (byte) 6);
        setByteField(term6292, term6292.getClass(), "minute", (byte) 4);
        setByteField(term6292, term6292.getClass(), "second", (byte) 54);
        setIntField(term6292, term6292.getClass(), "nano", 604713782);
        setField(term6287, term6287.getClass(), "time", term6292);
        setField(term6250, term6250.getClass(), "eta", term6287);
        setBooleanField(term6250, term6250.getClass(), "finished", false);
        setField(term6250, term6250.getClass(), "taskStatus", enum18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6250, args);
    }

};


