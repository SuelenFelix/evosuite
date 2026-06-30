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
import java.lang.Long;

public class TrackUnit_setTaskId_16309672965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99977;
     Object term99985;

    public TrackUnit_setTaskId_16309672965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99977 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99977, term99977.getClass(), "id", 0L);
        setField(term99977, term99977.getClass(), "workDay", null);
        setField(term99977, term99977.getClass(), "status", null);
        setFloatField(term99977, term99977.getClass(), "hours", 0.0F);
        setField(term99977, term99977.getClass(), "comment", null);
        setField(term99977, term99977.getClass(), "rejectReason", null);
        setFloatField(term99977, term99977.getClass(), "rate", 0.0F);
        setBooleanField(term99977, term99977.getClass(), "billable", false);
        setLongField(term99977, term99977.getClass(), "taskId", 0L);
        setIntField(term99977, term99977.getClass(), "employeeId", 0);
        setField(term99977, term99977.getClass(), "createdDate", null);
        setField(term99977, term99977.getClass(), "lastModifiedDate", null);
        setBooleanField(term99977, term99977.getClass(), "frozen", false);
        setField(term99977, term99977.getClass(), "employee", null);
        setField(term99977, term99977.getClass(), "project", null);
        setField(term99977, term99977.getClass(), "task", null);
        term99985 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term99985;
        callMethod(klass, "setTaskId", argTypes, term99977, args);
    }

};


