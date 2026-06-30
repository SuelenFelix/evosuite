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
import java.lang.Object;

public class SubmittedWorkDaysForEmployeesDto_getTrackUnitWorkDay_221885904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14888;

    public SubmittedWorkDaysForEmployeesDto_getTrackUnitWorkDay_221885904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14888 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term14914 = newInstance(Class.forName("java.util.Date"));
        setIntField(term14888, term14888.getClass(), "employeeId", 1632125673);
        setField(term14888, term14888.getClass(), "firstName", "HHmNoYxIGj");
        setField(term14888, term14888.getClass(), "lastName", "PtirvZmsGt");
        setLongField(term14914, term14914.getClass(), "fastTime", 1466008719289L);
        setField(term14914, term14914.getClass(), "cdate", null);
        setField(term14888, term14888.getClass(), "trackUnitWorkDay", term14914);
        setIntField(term14888, term14888.getClass(), "projectId", 454281060);
        setField(term14888, term14888.getClass(), "projectName", "HWkpTmtlrc");
        setLongField(term14888, term14888.getClass(), "trackUnitId", 8313800941204938919L);
        setLongField(term14888, term14888.getClass(), "taskId", -1214968196781083707L);
        setField(term14888, term14888.getClass(), "taskName", "hMmaoREuCK");
        setFloatField(term14888, term14888.getClass(), "trackUnitHours", 0.25937343F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitWorkDay", argTypes, term14888, args);
    }

};


