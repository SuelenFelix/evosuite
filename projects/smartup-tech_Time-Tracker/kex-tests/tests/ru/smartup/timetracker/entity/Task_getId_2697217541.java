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

public class Task_getId_2697217541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100103;

    public Task_getId_2697217541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100103 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100120 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100123 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100103, term100103.getClass(), "id", -6301101997917060727L);
        setField(term100103, term100103.getClass(), "name", "qbUMcIvEXH");
        setIntField(term100103, term100103.getClass(), "projectId", -865722613);
        setBooleanField(term100103, term100103.getClass(), "billable", false);
        setBooleanField(term100103, term100103.getClass(), "isArchived", true);
        setIntField(term100120, term100120.getClass(), "nanos", 25000000);
        setLongField(term100120, term100120.getClass(), "fastTime", 1557935878000L);
        setField(term100120, term100120.getClass(), "cdate", null);
        setField(term100103, term100103.getClass(), "createdDate", term100120);
        setIntField(term100123, term100123.getClass(), "nanos", 63000000);
        setLongField(term100123, term100123.getClass(), "fastTime", 1751912485000L);
        setField(term100123, term100123.getClass(), "cdate", null);
        setField(term100103, term100103.getClass(), "lastModifiedDate", term100123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term100103, args);
    }

};


