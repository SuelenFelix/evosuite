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

public class TrackUnit_setEmployee_122939901670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100023;

    public TrackUnit_setEmployee_122939901670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100023 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100023, term100023.getClass(), "id", 0L);
        setField(term100023, term100023.getClass(), "workDay", null);
        setField(term100023, term100023.getClass(), "status", null);
        setFloatField(term100023, term100023.getClass(), "hours", 0.0F);
        setField(term100023, term100023.getClass(), "comment", null);
        setField(term100023, term100023.getClass(), "rejectReason", null);
        setFloatField(term100023, term100023.getClass(), "rate", 0.0F);
        setBooleanField(term100023, term100023.getClass(), "billable", false);
        setLongField(term100023, term100023.getClass(), "taskId", 0L);
        setIntField(term100023, term100023.getClass(), "employeeId", 0);
        setField(term100023, term100023.getClass(), "createdDate", null);
        setField(term100023, term100023.getClass(), "lastModifiedDate", null);
        setBooleanField(term100023, term100023.getClass(), "frozen", false);
        setField(term100023, term100023.getClass(), "employee", null);
        setField(term100023, term100023.getClass(), "project", null);
        setField(term100023, term100023.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmployee", argTypes, term100023, args);
    }

};


