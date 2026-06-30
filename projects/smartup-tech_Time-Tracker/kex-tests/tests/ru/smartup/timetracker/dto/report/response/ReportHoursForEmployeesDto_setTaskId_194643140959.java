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
import java.lang.Long;

public class ReportHoursForEmployeesDto_setTaskId_194643140959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5892;
     Object term5905;

    public ReportHoursForEmployeesDto_setTaskId_194643140959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5892 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5892, term5892.getClass(), "projectId", 0);
        setField(term5892, term5892.getClass(), "projectName", null);
        setLongField(term5892, term5892.getClass(), "taskId", 0L);
        setField(term5892, term5892.getClass(), "taskName", null);
        setIntField(term5892, term5892.getClass(), "employeeId", 0);
        setField(term5892, term5892.getClass(), "employeeFirstName", null);
        setField(term5892, term5892.getClass(), "employeeLastName", null);
        setFloatField(term5892, term5892.getClass(), "billableHours", 0.0F);
        setFloatField(term5892, term5892.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5892, term5892.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5892, term5892.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5892, term5892.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5892, term5892.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5892, term5892.getClass(), "totalHours", 0.0F);
        setFloatField(term5892, term5892.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5892, term5892.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5892, term5892.getClass(), "workHoursMap", null);
        term5905 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5905;
        callMethod(klass, "setTaskId", argTypes, term5892, args);
    }

};


