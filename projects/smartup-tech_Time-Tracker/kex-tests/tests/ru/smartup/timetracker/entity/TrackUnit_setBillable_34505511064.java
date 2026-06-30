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

public class TrackUnit_setBillable_34505511064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99967;
     Object term99975;

    public TrackUnit_setBillable_34505511064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99967 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99967, term99967.getClass(), "id", 0L);
        setField(term99967, term99967.getClass(), "workDay", null);
        setField(term99967, term99967.getClass(), "status", null);
        setFloatField(term99967, term99967.getClass(), "hours", 0.0F);
        setField(term99967, term99967.getClass(), "comment", null);
        setField(term99967, term99967.getClass(), "rejectReason", null);
        setFloatField(term99967, term99967.getClass(), "rate", 0.0F);
        setBooleanField(term99967, term99967.getClass(), "billable", false);
        setLongField(term99967, term99967.getClass(), "taskId", 0L);
        setIntField(term99967, term99967.getClass(), "employeeId", 0);
        setField(term99967, term99967.getClass(), "createdDate", null);
        setField(term99967, term99967.getClass(), "lastModifiedDate", null);
        setBooleanField(term99967, term99967.getClass(), "frozen", false);
        setField(term99967, term99967.getClass(), "employee", null);
        setField(term99967, term99967.getClass(), "project", null);
        setField(term99967, term99967.getClass(), "task", null);
        term99975 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term99975;
        callMethod(klass, "setBillable", argTypes, term99967, args);
    }

};


