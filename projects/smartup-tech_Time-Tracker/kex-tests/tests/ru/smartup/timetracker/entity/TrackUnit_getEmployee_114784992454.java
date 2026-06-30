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

public class TrackUnit_getEmployee_114784992454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99881;

    public TrackUnit_getEmployee_114784992454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99881 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99881, term99881.getClass(), "id", 0L);
        setField(term99881, term99881.getClass(), "workDay", null);
        setField(term99881, term99881.getClass(), "status", null);
        setFloatField(term99881, term99881.getClass(), "hours", 0.0F);
        setField(term99881, term99881.getClass(), "comment", null);
        setField(term99881, term99881.getClass(), "rejectReason", null);
        setFloatField(term99881, term99881.getClass(), "rate", 0.0F);
        setBooleanField(term99881, term99881.getClass(), "billable", false);
        setLongField(term99881, term99881.getClass(), "taskId", 0L);
        setIntField(term99881, term99881.getClass(), "employeeId", 0);
        setField(term99881, term99881.getClass(), "createdDate", null);
        setField(term99881, term99881.getClass(), "lastModifiedDate", null);
        setBooleanField(term99881, term99881.getClass(), "frozen", false);
        setField(term99881, term99881.getClass(), "employee", null);
        setField(term99881, term99881.getClass(), "project", null);
        setField(term99881, term99881.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployee", argTypes, term99881, args);
    }

};


