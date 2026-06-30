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

public class SubmittedHoursByWeekAndProjectDto_setStatus_187754812946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13381;

    public SubmittedHoursByWeekAndProjectDto_setStatus_187754812946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13381 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13381, term13381.getClass(), "trackUnitId", 0L);
        setIntField(term13381, term13381.getClass(), "employeeId", 0);
        setField(term13381, term13381.getClass(), "firstName", null);
        setField(term13381, term13381.getClass(), "lastName", null);
        setLongField(term13381, term13381.getClass(), "taskId", 0L);
        setField(term13381, term13381.getClass(), "taskName", null);
        setFloatField(term13381, term13381.getClass(), "hours", 0.0F);
        setField(term13381, term13381.getClass(), "status", null);
        setBooleanField(term13381, term13381.getClass(), "billable", false);
        setField(term13381, term13381.getClass(), "workDay", null);
        setField(term13381, term13381.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatus", argTypes, term13381, args);
    }

};


