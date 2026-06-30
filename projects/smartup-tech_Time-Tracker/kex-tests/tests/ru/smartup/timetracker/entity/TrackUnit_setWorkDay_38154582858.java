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

public class TrackUnit_setWorkDay_38154582858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99915;

    public TrackUnit_setWorkDay_38154582858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99915 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99915, term99915.getClass(), "id", 0L);
        setField(term99915, term99915.getClass(), "workDay", null);
        setField(term99915, term99915.getClass(), "status", null);
        setFloatField(term99915, term99915.getClass(), "hours", 0.0F);
        setField(term99915, term99915.getClass(), "comment", null);
        setField(term99915, term99915.getClass(), "rejectReason", null);
        setFloatField(term99915, term99915.getClass(), "rate", 0.0F);
        setBooleanField(term99915, term99915.getClass(), "billable", false);
        setLongField(term99915, term99915.getClass(), "taskId", 0L);
        setIntField(term99915, term99915.getClass(), "employeeId", 0);
        setField(term99915, term99915.getClass(), "createdDate", null);
        setField(term99915, term99915.getClass(), "lastModifiedDate", null);
        setBooleanField(term99915, term99915.getClass(), "frozen", false);
        setField(term99915, term99915.getClass(), "employee", null);
        setField(term99915, term99915.getClass(), "project", null);
        setField(term99915, term99915.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWorkDay", argTypes, term99915, args);
    }

};


