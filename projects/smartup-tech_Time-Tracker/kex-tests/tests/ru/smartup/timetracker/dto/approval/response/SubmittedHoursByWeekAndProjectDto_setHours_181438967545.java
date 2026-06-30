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
import java.lang.Float;

public class SubmittedHoursByWeekAndProjectDto_setHours_181438967545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13373;
     Object term13379;

    public SubmittedHoursByWeekAndProjectDto_setHours_181438967545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13373 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13373, term13373.getClass(), "trackUnitId", 0L);
        setIntField(term13373, term13373.getClass(), "employeeId", 0);
        setField(term13373, term13373.getClass(), "firstName", null);
        setField(term13373, term13373.getClass(), "lastName", null);
        setLongField(term13373, term13373.getClass(), "taskId", 0L);
        setField(term13373, term13373.getClass(), "taskName", null);
        setFloatField(term13373, term13373.getClass(), "hours", 0.0F);
        setField(term13373, term13373.getClass(), "status", null);
        setBooleanField(term13373, term13373.getClass(), "billable", false);
        setField(term13373, term13373.getClass(), "workDay", null);
        setField(term13373, term13373.getClass(), "comment", null);
        term13379 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term13379;
        callMethod(klass, "setHours", argTypes, term13373, args);
    }

};


