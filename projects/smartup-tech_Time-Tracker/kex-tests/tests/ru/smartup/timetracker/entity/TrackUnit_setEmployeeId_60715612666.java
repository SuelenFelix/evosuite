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
import java.lang.Integer;

public class TrackUnit_setEmployeeId_60715612666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99987;
     Object term99995;

    public TrackUnit_setEmployeeId_60715612666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99987 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackUnit"));
        setLongField(term99987, term99987.getClass(), "id", 0L);
        setField(term99987, term99987.getClass(), "workDay", null);
        setField(term99987, term99987.getClass(), "status", null);
        setFloatField(term99987, term99987.getClass(), "hours", 0.0F);
        setField(term99987, term99987.getClass(), "comment", null);
        setField(term99987, term99987.getClass(), "rejectReason", null);
        setFloatField(term99987, term99987.getClass(), "rate", 0.0F);
        setBooleanField(term99987, term99987.getClass(), "billable", false);
        setLongField(term99987, term99987.getClass(), "taskId", 0L);
        setIntField(term99987, term99987.getClass(), "employeeId", 0);
        setField(term99987, term99987.getClass(), "createdDate", null);
        setField(term99987, term99987.getClass(), "lastModifiedDate", null);
        setBooleanField(term99987, term99987.getClass(), "frozen", false);
        setField(term99987, term99987.getClass(), "employee", null);
        setField(term99987, term99987.getClass(), "project", null);
        setField(term99987, term99987.getClass(), "task", null);
        term99995 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99995;
        callMethod(klass, "setEmployeeId", argTypes, term99987, args);
    }

};


