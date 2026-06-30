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

public class TrackUnit_getTask_114728647856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99897;

    public TrackUnit_getTask_114728647856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99897 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99897, term99897.getClass(), "id", 0L);
        setField(term99897, term99897.getClass(), "workDay", null);
        setField(term99897, term99897.getClass(), "status", null);
        setFloatField(term99897, term99897.getClass(), "hours", 0.0F);
        setField(term99897, term99897.getClass(), "comment", null);
        setField(term99897, term99897.getClass(), "rejectReason", null);
        setFloatField(term99897, term99897.getClass(), "rate", 0.0F);
        setBooleanField(term99897, term99897.getClass(), "billable", false);
        setLongField(term99897, term99897.getClass(), "taskId", 0L);
        setIntField(term99897, term99897.getClass(), "employeeId", 0);
        setField(term99897, term99897.getClass(), "createdDate", null);
        setField(term99897, term99897.getClass(), "lastModifiedDate", null);
        setBooleanField(term99897, term99897.getClass(), "frozen", false);
        setField(term99897, term99897.getClass(), "employee", null);
        setField(term99897, term99897.getClass(), "project", null);
        setField(term99897, term99897.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTask", argTypes, term99897, args);
    }

};


