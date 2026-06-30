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
import java.lang.Boolean;

public class SubmittedHoursByWeekAndProjectDto_setBillable_74875552747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13387;
     Object term13393;

    public SubmittedHoursByWeekAndProjectDto_setBillable_74875552747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13387 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13387, term13387.getClass(), "trackUnitId", 0L);
        setIntField(term13387, term13387.getClass(), "employeeId", 0);
        setField(term13387, term13387.getClass(), "firstName", null);
        setField(term13387, term13387.getClass(), "lastName", null);
        setLongField(term13387, term13387.getClass(), "taskId", 0L);
        setField(term13387, term13387.getClass(), "taskName", null);
        setFloatField(term13387, term13387.getClass(), "hours", 0.0F);
        setField(term13387, term13387.getClass(), "status", null);
        setBooleanField(term13387, term13387.getClass(), "billable", false);
        setField(term13387, term13387.getClass(), "workDay", null);
        setField(term13387, term13387.getClass(), "comment", null);
        term13393 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13393;
        callMethod(klass, "setBillable", argTypes, term13387, args);
    }

};


