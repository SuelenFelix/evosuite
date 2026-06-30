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

public class SubmittedHoursByWeekAndProjectDto_setWorkDay_1235339948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13395;

    public SubmittedHoursByWeekAndProjectDto_setWorkDay_1235339948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13395 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13395, term13395.getClass(), "trackUnitId", 0L);
        setIntField(term13395, term13395.getClass(), "employeeId", 0);
        setField(term13395, term13395.getClass(), "firstName", null);
        setField(term13395, term13395.getClass(), "lastName", null);
        setLongField(term13395, term13395.getClass(), "taskId", 0L);
        setField(term13395, term13395.getClass(), "taskName", null);
        setFloatField(term13395, term13395.getClass(), "hours", 0.0F);
        setField(term13395, term13395.getClass(), "status", null);
        setBooleanField(term13395, term13395.getClass(), "billable", false);
        setField(term13395, term13395.getClass(), "workDay", null);
        setField(term13395, term13395.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWorkDay", argTypes, term13395, args);
    }

};


