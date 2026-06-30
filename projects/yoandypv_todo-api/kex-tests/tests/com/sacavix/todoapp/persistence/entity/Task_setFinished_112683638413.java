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
import java.lang.Boolean;

public class Task_setFinished_112683638413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;
     Object term4297;

    public Task_setFinished_112683638413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4239 = new Long(2535595959091595249L);
        Class<? extends Object> term4320 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term4319 = ((Class) term4320).getDeclaredField((String) "ON_TIME");
        ((Field) term4319).setAccessible(true);
        Object enum12 = ((Field) term4319).get((Object) null);
        term4238 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term4265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4280 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4238, term4238.getClass(), "id", term4239);
        setField(term4238, term4238.getClass(), "title", "flxyYxBRtu");
        setField(term4238, term4238.getClass(), "description", "OclPbYPkcH");
        setIntField(term4266, term4266.getClass(), "year", 2028);
        setShortField(term4266, term4266.getClass(), "month", (short) 10);
        setShortField(term4266, term4266.getClass(), "day", (short) 1);
        setField(term4265, term4265.getClass(), "date", term4266);
        setByteField(term4270, term4270.getClass(), "hour", (byte) 17);
        setByteField(term4270, term4270.getClass(), "minute", (byte) 29);
        setByteField(term4270, term4270.getClass(), "second", (byte) 30);
        setIntField(term4270, term4270.getClass(), "nano", 845472306);
        setField(term4265, term4265.getClass(), "time", term4270);
        setField(term4238, term4238.getClass(), "createdDate", term4265);
        setIntField(term4276, term4276.getClass(), "year", 2027);
        setShortField(term4276, term4276.getClass(), "month", (short) 2);
        setShortField(term4276, term4276.getClass(), "day", (short) 19);
        setField(term4275, term4275.getClass(), "date", term4276);
        setByteField(term4280, term4280.getClass(), "hour", (byte) 17);
        setByteField(term4280, term4280.getClass(), "minute", (byte) 37);
        setByteField(term4280, term4280.getClass(), "second", (byte) 27);
        setIntField(term4280, term4280.getClass(), "nano", 920380537);
        setField(term4275, term4275.getClass(), "time", term4280);
        setField(term4238, term4238.getClass(), "eta", term4275);
        setBooleanField(term4238, term4238.getClass(), "finished", false);
        setField(term4238, term4238.getClass(), "taskStatus", enum12);
        term4297 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4297;
        callMethod(klass, "setFinished", argTypes, term4238, args);
    }

};


