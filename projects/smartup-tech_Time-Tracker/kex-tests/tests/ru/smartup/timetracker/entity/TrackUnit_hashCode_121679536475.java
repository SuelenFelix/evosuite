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

public class TrackUnit_hashCode_121679536475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100063;

    public TrackUnit_hashCode_121679536475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100063 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term100063, term100063.getClass(), "id", 0L);
        setField(term100063, term100063.getClass(), "workDay", null);
        setField(term100063, term100063.getClass(), "status", null);
        setFloatField(term100063, term100063.getClass(), "hours", 0.0F);
        setField(term100063, term100063.getClass(), "comment", null);
        setField(term100063, term100063.getClass(), "rejectReason", null);
        setFloatField(term100063, term100063.getClass(), "rate", 0.0F);
        setBooleanField(term100063, term100063.getClass(), "billable", false);
        setLongField(term100063, term100063.getClass(), "taskId", 0L);
        setIntField(term100063, term100063.getClass(), "employeeId", 0);
        setField(term100063, term100063.getClass(), "createdDate", null);
        setField(term100063, term100063.getClass(), "lastModifiedDate", null);
        setBooleanField(term100063, term100063.getClass(), "frozen", false);
        setField(term100063, term100063.getClass(), "employee", null);
        setField(term100063, term100063.getClass(), "project", null);
        setField(term100063, term100063.getClass(), "task", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term100063, args);
    }

};


