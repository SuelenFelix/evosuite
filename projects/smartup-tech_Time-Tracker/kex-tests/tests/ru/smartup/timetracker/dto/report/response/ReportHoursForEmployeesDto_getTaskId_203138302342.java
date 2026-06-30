package ru.smartup.timetracker.dto.report.response;

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
import static ru.smartup.timetracker.dto.report.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReportHoursForEmployeesDto_getTaskId_203138302342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5669;

    public ReportHoursForEmployeesDto_getTaskId_203138302342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5669 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5669, term5669.getClass(), "projectId", 0);
        setField(term5669, term5669.getClass(), "projectName", null);
        setLongField(term5669, term5669.getClass(), "taskId", 0L);
        setField(term5669, term5669.getClass(), "taskName", null);
        setIntField(term5669, term5669.getClass(), "employeeId", 0);
        setField(term5669, term5669.getClass(), "employeeFirstName", null);
        setField(term5669, term5669.getClass(), "employeeLastName", null);
        setFloatField(term5669, term5669.getClass(), "billableHours", 0.0F);
        setFloatField(term5669, term5669.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5669, term5669.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5669, term5669.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5669, term5669.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5669, term5669.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5669, term5669.getClass(), "totalHours", 0.0F);
        setFloatField(term5669, term5669.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5669, term5669.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5669, term5669.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term5669, args);
    }

};


