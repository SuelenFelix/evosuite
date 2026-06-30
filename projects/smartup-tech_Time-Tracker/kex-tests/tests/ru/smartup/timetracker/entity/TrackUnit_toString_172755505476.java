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

public class TrackUnit_toString_172755505476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100071;

    public TrackUnit_toString_172755505476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100071 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100071, term100071.getClass(), "id", 0L);
        setField(term100071, term100071.getClass(), "workDay", null);
        setField(term100071, term100071.getClass(), "status", null);
        setFloatField(term100071, term100071.getClass(), "hours", 0.0F);
        setField(term100071, term100071.getClass(), "comment", null);
        setField(term100071, term100071.getClass(), "rejectReason", null);
        setFloatField(term100071, term100071.getClass(), "rate", 0.0F);
        setBooleanField(term100071, term100071.getClass(), "billable", false);
        setLongField(term100071, term100071.getClass(), "taskId", 0L);
        setIntField(term100071, term100071.getClass(), "employeeId", 0);
        setField(term100071, term100071.getClass(), "createdDate", null);
        setField(term100071, term100071.getClass(), "lastModifiedDate", null);
        setBooleanField(term100071, term100071.getClass(), "frozen", false);
        setField(term100071, term100071.getClass(), "employee", null);
        setField(term100071, term100071.getClass(), "project", null);
        setField(term100071, term100071.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term100071, args);
    }

};


