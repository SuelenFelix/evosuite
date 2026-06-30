package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Task_setId_19615077488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100334;
     Object term100357;

    public Task_setId_19615077488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100334 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100351 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100354 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100334, term100334.getClass(), "id", 1457594663983990440L);
        setField(term100334, term100334.getClass(), "name", "dQxXGBtDLZ");
        setIntField(term100334, term100334.getClass(), "projectId", -752870423);
        setBooleanField(term100334, term100334.getClass(), "billable", false);
        setBooleanField(term100334, term100334.getClass(), "isArchived", false);
        setIntField(term100351, term100351.getClass(), "nanos", 64000000);
        setLongField(term100351, term100351.getClass(), "fastTime", 1890068121000L);
        setField(term100351, term100351.getClass(), "cdate", null);
        setField(term100334, term100334.getClass(), "createdDate", term100351);
        setIntField(term100354, term100354.getClass(), "nanos", 461000000);
        setLongField(term100354, term100354.getClass(), "fastTime", 1289600523000L);
        setField(term100354, term100354.getClass(), "cdate", null);
        setField(term100334, term100334.getClass(), "lastModifiedDate", term100354);
        term100357 = new Long(3452833434644634217L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term100357;
        callMethod(klass, "setId", argTypes, term100334, args);
    }

};


