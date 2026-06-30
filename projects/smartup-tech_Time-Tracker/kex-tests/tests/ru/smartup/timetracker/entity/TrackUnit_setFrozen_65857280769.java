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
import java.lang.Boolean;

public class TrackUnit_setFrozen_65857280769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100013;
     Object term100021;

    public TrackUnit_setFrozen_65857280769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100013 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100013, term100013.getClass(), "id", 0L);
        setField(term100013, term100013.getClass(), "workDay", null);
        setField(term100013, term100013.getClass(), "status", null);
        setFloatField(term100013, term100013.getClass(), "hours", 0.0F);
        setField(term100013, term100013.getClass(), "comment", null);
        setField(term100013, term100013.getClass(), "rejectReason", null);
        setFloatField(term100013, term100013.getClass(), "rate", 0.0F);
        setBooleanField(term100013, term100013.getClass(), "billable", false);
        setLongField(term100013, term100013.getClass(), "taskId", 0L);
        setIntField(term100013, term100013.getClass(), "employeeId", 0);
        setField(term100013, term100013.getClass(), "createdDate", null);
        setField(term100013, term100013.getClass(), "lastModifiedDate", null);
        setBooleanField(term100013, term100013.getClass(), "frozen", false);
        setField(term100013, term100013.getClass(), "employee", null);
        setField(term100013, term100013.getClass(), "project", null);
        setField(term100013, term100013.getClass(), "task", null);
        term100021 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100021;
        callMethod(klass, "setFrozen", argTypes, term100013, args);
    }

};


