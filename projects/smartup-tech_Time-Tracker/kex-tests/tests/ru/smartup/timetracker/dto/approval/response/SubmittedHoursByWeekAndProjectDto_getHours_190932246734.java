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

public class SubmittedHoursByWeekAndProjectDto_getHours_190932246734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13301;

    public SubmittedHoursByWeekAndProjectDto_getHours_190932246734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13301 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        setLongField(term13301, term13301.getClass(), "trackUnitId", 0L);
        setIntField(term13301, term13301.getClass(), "employeeId", 0);
        setField(term13301, term13301.getClass(), "firstName", null);
        setField(term13301, term13301.getClass(), "lastName", null);
        setLongField(term13301, term13301.getClass(), "taskId", 0L);
        setField(term13301, term13301.getClass(), "taskName", null);
        setFloatField(term13301, term13301.getClass(), "hours", 0.0F);
        setField(term13301, term13301.getClass(), "status", null);
        setBooleanField(term13301, term13301.getClass(), "billable", false);
        setField(term13301, term13301.getClass(), "workDay", null);
        setField(term13301, term13301.getClass(), "comment", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term13301, args);
    }

};


