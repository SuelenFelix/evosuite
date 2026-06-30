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

public class SubmittedHoursByWeekAndProjectDto_setLastName_178108525042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13353;

    public SubmittedHoursByWeekAndProjectDto_setLastName_178108525042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13353 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13353, term13353.getClass(), "trackUnitId", 0L);
        setIntField(term13353, term13353.getClass(), "employeeId", 0);
        setField(term13353, term13353.getClass(), "firstName", null);
        setField(term13353, term13353.getClass(), "lastName", null);
        setLongField(term13353, term13353.getClass(), "taskId", 0L);
        setField(term13353, term13353.getClass(), "taskName", null);
        setFloatField(term13353, term13353.getClass(), "hours", 0.0F);
        setField(term13353, term13353.getClass(), "status", null);
        setBooleanField(term13353, term13353.getClass(), "billable", false);
        setField(term13353, term13353.getClass(), "workDay", null);
        setField(term13353, term13353.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term13353, args);
    }

};


