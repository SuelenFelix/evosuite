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
import java.lang.Long;

public class SubmittedHoursByWeekAndProjectDto_setTaskId_125690736643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13359;
     Object term13365;

    public SubmittedHoursByWeekAndProjectDto_setTaskId_125690736643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13359 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13359, term13359.getClass(), "trackUnitId", 0L);
        setIntField(term13359, term13359.getClass(), "employeeId", 0);
        setField(term13359, term13359.getClass(), "firstName", null);
        setField(term13359, term13359.getClass(), "lastName", null);
        setLongField(term13359, term13359.getClass(), "taskId", 0L);
        setField(term13359, term13359.getClass(), "taskName", null);
        setFloatField(term13359, term13359.getClass(), "hours", 0.0F);
        setField(term13359, term13359.getClass(), "status", null);
        setBooleanField(term13359, term13359.getClass(), "billable", false);
        setField(term13359, term13359.getClass(), "workDay", null);
        setField(term13359, term13359.getClass(), "comment", null);
        term13365 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13365;
        callMethod(klass, "setTaskId", argTypes, term13359, args);
    }

};


