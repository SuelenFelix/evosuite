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

public class Task_canEqual_95023348116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5569;
     Object term5625;

    public Task_canEqual_95023348116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5570 = new Long(-316468845751588286L);
        Class<? extends Object> term5647 = Class.forName((String) "com.sacavix.todoapp.persistence.entity.TaskStatus");
        Field term5646 = ((Class) term5647).getDeclaredField((String) "LATE");
        ((Field) term5646).setAccessible(true);
        Object enum16 = ((Field) term5646).get((Object) null);
        term5569 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        Object term5596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5611 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5569, term5569.getClass(), "id", term5570);
        setField(term5569, term5569.getClass(), "title", "AijpHYOFuy");
        setField(term5569, term5569.getClass(), "description", "SbAoxhfrkn");
        setIntField(term5597, term5597.getClass(), "year", 2012);
        setShortField(term5597, term5597.getClass(), "month", (short) 3);
        setShortField(term5597, term5597.getClass(), "day", (short) 27);
        setField(term5596, term5596.getClass(), "date", term5597);
        setByteField(term5601, term5601.getClass(), "hour", (byte) 17);
        setByteField(term5601, term5601.getClass(), "minute", (byte) 49);
        setByteField(term5601, term5601.getClass(), "second", (byte) 24);
        setIntField(term5601, term5601.getClass(), "nano", 530647398);
        setField(term5596, term5596.getClass(), "time", term5601);
        setField(term5569, term5569.getClass(), "createdDate", term5596);
        setIntField(term5607, term5607.getClass(), "year", 2010);
        setShortField(term5607, term5607.getClass(), "month", (short) 6);
        setShortField(term5607, term5607.getClass(), "day", (short) 14);
        setField(term5606, term5606.getClass(), "date", term5607);
        setByteField(term5611, term5611.getClass(), "hour", (byte) 6);
        setByteField(term5611, term5611.getClass(), "minute", (byte) 22);
        setByteField(term5611, term5611.getClass(), "second", (byte) 20);
        setIntField(term5611, term5611.getClass(), "nano", 25133051);
        setField(term5606, term5606.getClass(), "time", term5611);
        setField(term5569, term5569.getClass(), "eta", term5606);
        setBooleanField(term5569, term5569.getClass(), "finished", true);
        setField(term5569, term5569.getClass(), "taskStatus", enum16);
        term5625 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5625;
        callMethod(klass, "canEqual", argTypes, term5569, args);
    }

};


