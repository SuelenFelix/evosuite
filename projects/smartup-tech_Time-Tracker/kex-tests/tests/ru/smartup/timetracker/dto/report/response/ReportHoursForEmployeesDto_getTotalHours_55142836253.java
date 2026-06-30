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

public class ReportHoursForEmployeesDto_getTotalHours_55142836253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5812;

    public ReportHoursForEmployeesDto_getTotalHours_55142836253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5812 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5812, term5812.getClass(), "projectId", 0);
        setField(term5812, term5812.getClass(), "projectName", null);
        setLongField(term5812, term5812.getClass(), "taskId", 0L);
        setField(term5812, term5812.getClass(), "taskName", null);
        setIntField(term5812, term5812.getClass(), "employeeId", 0);
        setField(term5812, term5812.getClass(), "employeeFirstName", null);
        setField(term5812, term5812.getClass(), "employeeLastName", null);
        setFloatField(term5812, term5812.getClass(), "billableHours", 0.0F);
        setFloatField(term5812, term5812.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5812, term5812.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5812, term5812.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5812, term5812.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5812, term5812.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5812, term5812.getClass(), "totalHours", 0.0F);
        setFloatField(term5812, term5812.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5812, term5812.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5812, term5812.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHours", argTypes, term5812, args);
    }

};


