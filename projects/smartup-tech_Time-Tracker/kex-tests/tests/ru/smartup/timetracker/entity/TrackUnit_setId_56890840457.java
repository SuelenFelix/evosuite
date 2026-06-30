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

public class TrackUnit_setId_56890840457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99905;
     Object term99913;

    public TrackUnit_setId_56890840457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99905 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99905, term99905.getClass(), "id", 0L);
        setField(term99905, term99905.getClass(), "workDay", null);
        setField(term99905, term99905.getClass(), "status", null);
        setFloatField(term99905, term99905.getClass(), "hours", 0.0F);
        setField(term99905, term99905.getClass(), "comment", null);
        setField(term99905, term99905.getClass(), "rejectReason", null);
        setFloatField(term99905, term99905.getClass(), "rate", 0.0F);
        setBooleanField(term99905, term99905.getClass(), "billable", false);
        setLongField(term99905, term99905.getClass(), "taskId", 0L);
        setIntField(term99905, term99905.getClass(), "employeeId", 0);
        setField(term99905, term99905.getClass(), "createdDate", null);
        setField(term99905, term99905.getClass(), "lastModifiedDate", null);
        setBooleanField(term99905, term99905.getClass(), "frozen", false);
        setField(term99905, term99905.getClass(), "employee", null);
        setField(term99905, term99905.getClass(), "project", null);
        setField(term99905, term99905.getClass(), "task", null);
        term99913 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term99913;
        callMethod(klass, "setId", argTypes, term99905, args);
    }

};


