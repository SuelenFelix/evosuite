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

public class TrackUnit_getWorkDay_108271777442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99785;

    public TrackUnit_getWorkDay_108271777442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99785 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99785, term99785.getClass(), "id", 0L);
        setField(term99785, term99785.getClass(), "workDay", null);
        setField(term99785, term99785.getClass(), "status", null);
        setFloatField(term99785, term99785.getClass(), "hours", 0.0F);
        setField(term99785, term99785.getClass(), "comment", null);
        setField(term99785, term99785.getClass(), "rejectReason", null);
        setFloatField(term99785, term99785.getClass(), "rate", 0.0F);
        setBooleanField(term99785, term99785.getClass(), "billable", false);
        setLongField(term99785, term99785.getClass(), "taskId", 0L);
        setIntField(term99785, term99785.getClass(), "employeeId", 0);
        setField(term99785, term99785.getClass(), "createdDate", null);
        setField(term99785, term99785.getClass(), "lastModifiedDate", null);
        setBooleanField(term99785, term99785.getClass(), "frozen", false);
        setField(term99785, term99785.getClass(), "employee", null);
        setField(term99785, term99785.getClass(), "project", null);
        setField(term99785, term99785.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkDay", argTypes, term99785, args);
    }

};


