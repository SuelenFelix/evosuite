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
import java.lang.Integer;

public class SubmittedHoursByWeekAndProjectDto_setEmployeeId_48665451140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13339;
     Object term13345;

    public SubmittedHoursByWeekAndProjectDto_setEmployeeId_48665451140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13339 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13339, term13339.getClass(), "trackUnitId", 0L);
        setIntField(term13339, term13339.getClass(), "employeeId", 0);
        setField(term13339, term13339.getClass(), "firstName", null);
        setField(term13339, term13339.getClass(), "lastName", null);
        setLongField(term13339, term13339.getClass(), "taskId", 0L);
        setField(term13339, term13339.getClass(), "taskName", null);
        setFloatField(term13339, term13339.getClass(), "hours", 0.0F);
        setField(term13339, term13339.getClass(), "status", null);
        setBooleanField(term13339, term13339.getClass(), "billable", false);
        setField(term13339, term13339.getClass(), "workDay", null);
        setField(term13339, term13339.getClass(), "comment", null);
        term13345 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13345;
        callMethod(klass, "setEmployeeId", argTypes, term13339, args);
    }

};


