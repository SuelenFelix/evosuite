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
import java.lang.Float;

public class TrackUnit_setRate_214410704363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99957;
     Object term99965;

    public TrackUnit_setRate_214410704363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99957 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99957, term99957.getClass(), "id", 0L);
        setField(term99957, term99957.getClass(), "workDay", null);
        setField(term99957, term99957.getClass(), "status", null);
        setFloatField(term99957, term99957.getClass(), "hours", 0.0F);
        setField(term99957, term99957.getClass(), "comment", null);
        setField(term99957, term99957.getClass(), "rejectReason", null);
        setFloatField(term99957, term99957.getClass(), "rate", 0.0F);
        setBooleanField(term99957, term99957.getClass(), "billable", false);
        setLongField(term99957, term99957.getClass(), "taskId", 0L);
        setIntField(term99957, term99957.getClass(), "employeeId", 0);
        setField(term99957, term99957.getClass(), "createdDate", null);
        setField(term99957, term99957.getClass(), "lastModifiedDate", null);
        setBooleanField(term99957, term99957.getClass(), "frozen", false);
        setField(term99957, term99957.getClass(), "employee", null);
        setField(term99957, term99957.getClass(), "project", null);
        setField(term99957, term99957.getClass(), "task", null);
        term99965 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term99965;
        callMethod(klass, "setRate", argTypes, term99957, args);
    }

};


