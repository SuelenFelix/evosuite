package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubmittedHoursByWeekAndProjectDto_equals_32570194850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13407;

    public SubmittedHoursByWeekAndProjectDto_equals_32570194850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13407 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13407, term13407.getClass(), "trackUnitId", 0L);
        setIntField(term13407, term13407.getClass(), "employeeId", 0);
        setField(term13407, term13407.getClass(), "firstName", null);
        setField(term13407, term13407.getClass(), "lastName", null);
        setLongField(term13407, term13407.getClass(), "taskId", 0L);
        setField(term13407, term13407.getClass(), "taskName", null);
        setFloatField(term13407, term13407.getClass(), "hours", 0.0F);
        setField(term13407, term13407.getClass(), "status", null);
        setBooleanField(term13407, term13407.getClass(), "billable", false);
        setField(term13407, term13407.getClass(), "workDay", null);
        setField(term13407, term13407.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term13407, args);
    }

};


