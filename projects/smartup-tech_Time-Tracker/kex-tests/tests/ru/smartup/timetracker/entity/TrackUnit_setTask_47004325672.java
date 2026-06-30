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

public class TrackUnit_setTask_47004325672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100039;

    public TrackUnit_setTask_47004325672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100039 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100039, term100039.getClass(), "id", 0L);
        setField(term100039, term100039.getClass(), "workDay", null);
        setField(term100039, term100039.getClass(), "status", null);
        setFloatField(term100039, term100039.getClass(), "hours", 0.0F);
        setField(term100039, term100039.getClass(), "comment", null);
        setField(term100039, term100039.getClass(), "rejectReason", null);
        setFloatField(term100039, term100039.getClass(), "rate", 0.0F);
        setBooleanField(term100039, term100039.getClass(), "billable", false);
        setLongField(term100039, term100039.getClass(), "taskId", 0L);
        setIntField(term100039, term100039.getClass(), "employeeId", 0);
        setField(term100039, term100039.getClass(), "createdDate", null);
        setField(term100039, term100039.getClass(), "lastModifiedDate", null);
        setBooleanField(term100039, term100039.getClass(), "frozen", false);
        setField(term100039, term100039.getClass(), "employee", null);
        setField(term100039, term100039.getClass(), "project", null);
        setField(term100039, term100039.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTask", argTypes, term100039, args);
    }

};


