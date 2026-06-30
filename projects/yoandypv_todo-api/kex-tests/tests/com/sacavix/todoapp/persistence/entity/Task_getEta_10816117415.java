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

public class Task_getEta_10816117415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;

    public Task_getEta_10816117415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1429 = new Long(5270370404989704783L);
        Class<? extends Object> term1505 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term1504 = ((Class) term1505).getDeclaredField((String) "LATE");
        ((Field) term1504).setAccessible(true);
        Object enum4 = ((Field) term1504).get((Object) null);
        term1428 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term1455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1470 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1428, term1428.getClass(), "id", term1429);
        setField(term1428, term1428.getClass(), "title", "hRNSzYYIrc");
        setField(term1428, term1428.getClass(), "description", "RMFIsYGgne");
        setIntField(term1456, term1456.getClass(), "year", 2029);
        setShortField(term1456, term1456.getClass(), "month", (short) 8);
        setShortField(term1456, term1456.getClass(), "day", (short) 29);
        setField(term1455, term1455.getClass(), "date", term1456);
        setByteField(term1460, term1460.getClass(), "hour", (byte) 15);
        setByteField(term1460, term1460.getClass(), "minute", (byte) 50);
        setByteField(term1460, term1460.getClass(), "second", (byte) 1);
        setIntField(term1460, term1460.getClass(), "nano", 277971904);
        setField(term1455, term1455.getClass(), "time", term1460);
        setField(term1428, term1428.getClass(), "createdDate", term1455);
        setIntField(term1466, term1466.getClass(), "year", 2022);
        setShortField(term1466, term1466.getClass(), "month", (short) 11);
        setShortField(term1466, term1466.getClass(), "day", (short) 16);
        setField(term1465, term1465.getClass(), "date", term1466);
        setByteField(term1470, term1470.getClass(), "hour", (byte) 15);
        setByteField(term1470, term1470.getClass(), "minute", (byte) 54);
        setByteField(term1470, term1470.getClass(), "second", (byte) 2);
        setIntField(term1470, term1470.getClass(), "nano", 733274103);
        setField(term1465, term1465.getClass(), "time", term1470);
        setField(term1428, term1428.getClass(), "eta", term1465);
        setBooleanField(term1428, term1428.getClass(), "finished", true);
        setField(term1428, term1428.getClass(), "taskStatus", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEta", argTypes, term1428, args);
    }

};


