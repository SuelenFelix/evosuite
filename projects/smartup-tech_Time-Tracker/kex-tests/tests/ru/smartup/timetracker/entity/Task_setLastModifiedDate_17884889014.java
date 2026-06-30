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

public class Task_setLastModifiedDate_17884889014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100565;
     Object term100588;

    public Task_setLastModifiedDate_17884889014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100565 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100582 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100585 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100565, term100565.getClass(), "id", 4100236067313034103L);
        setField(term100565, term100565.getClass(), "name", "BOvgwHfoHQ");
        setIntField(term100565, term100565.getClass(), "projectId", 178847646);
        setBooleanField(term100565, term100565.getClass(), "billable", true);
        setBooleanField(term100565, term100565.getClass(), "isArchived", false);
        setIntField(term100582, term100582.getClass(), "nanos", 280000000);
        setLongField(term100582, term100582.getClass(), "fastTime", 1586016086000L);
        setField(term100582, term100582.getClass(), "cdate", null);
        setField(term100565, term100565.getClass(), "createdDate", term100582);
        setIntField(term100585, term100585.getClass(), "nanos", 941000000);
        setLongField(term100585, term100585.getClass(), "fastTime", 1486242942000L);
        setField(term100585, term100585.getClass(), "cdate", null);
        setField(term100565, term100565.getClass(), "lastModifiedDate", term100585);
        term100588 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term100588, term100588.getClass(), "nanos", 466000000);
        setLongField(term100588, term100588.getClass(), "fastTime", 1397498586000L);
        setField(term100588, term100588.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term100588;
        callMethod(klass, "setLastModifiedDate", argTypes, term100565, args);
    }

};


