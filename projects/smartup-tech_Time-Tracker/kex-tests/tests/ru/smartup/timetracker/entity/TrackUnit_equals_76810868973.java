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

public class TrackUnit_equals_76810868973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100047;

    public TrackUnit_equals_76810868973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100047 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100047, term100047.getClass(), "id", 0L);
        setField(term100047, term100047.getClass(), "workDay", null);
        setField(term100047, term100047.getClass(), "status", null);
        setFloatField(term100047, term100047.getClass(), "hours", 0.0F);
        setField(term100047, term100047.getClass(), "comment", null);
        setField(term100047, term100047.getClass(), "rejectReason", null);
        setFloatField(term100047, term100047.getClass(), "rate", 0.0F);
        setBooleanField(term100047, term100047.getClass(), "billable", false);
        setLongField(term100047, term100047.getClass(), "taskId", 0L);
        setIntField(term100047, term100047.getClass(), "employeeId", 0);
        setField(term100047, term100047.getClass(), "createdDate", null);
        setField(term100047, term100047.getClass(), "lastModifiedDate", null);
        setBooleanField(term100047, term100047.getClass(), "frozen", false);
        setField(term100047, term100047.getClass(), "employee", null);
        setField(term100047, term100047.getClass(), "project", null);
        setField(term100047, term100047.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term100047, args);
    }

};


