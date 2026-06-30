package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ReportHours_setTaskId_121251233255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21933;
     Object term21946;

    public ReportHours_setTaskId_121251233255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21933 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21933, term21933.getClass(), "projectId", 0);
        setField(term21933, term21933.getClass(), "projectName", null);
        setLongField(term21933, term21933.getClass(), "taskId", 0L);
        setField(term21933, term21933.getClass(), "taskName", null);
        setIntField(term21933, term21933.getClass(), "employeeId", 0);
        setField(term21933, term21933.getClass(), "employeeFirstName", null);
        setField(term21933, term21933.getClass(), "employeeLastName", null);
        setFloatField(term21933, term21933.getClass(), "billableHours", 0.0F);
        setFloatField(term21933, term21933.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21933, term21933.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21933, term21933.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21933, term21933.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21933, term21933.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21933, term21933.getClass(), "totalHours", 0.0F);
        setFloatField(term21933, term21933.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21933, term21933.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21933, term21933.getClass(), "workHoursMap", null);
        term21946 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term21946;
        callMethod(klass, "setTaskId", argTypes, term21933, args);
    }

};


