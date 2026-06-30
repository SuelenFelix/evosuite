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

public class ReportHoursForEmployeesDto_getProjectId_121650208940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5643;

    public ReportHoursForEmployeesDto_getProjectId_121650208940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5643 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5643, term5643.getClass(), "projectId", 0);
        setField(term5643, term5643.getClass(), "projectName", null);
        setLongField(term5643, term5643.getClass(), "taskId", 0L);
        setField(term5643, term5643.getClass(), "taskName", null);
        setIntField(term5643, term5643.getClass(), "employeeId", 0);
        setField(term5643, term5643.getClass(), "employeeFirstName", null);
        setField(term5643, term5643.getClass(), "employeeLastName", null);
        setFloatField(term5643, term5643.getClass(), "billableHours", 0.0F);
        setFloatField(term5643, term5643.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5643, term5643.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5643, term5643.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5643, term5643.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5643, term5643.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5643, term5643.getClass(), "totalHours", 0.0F);
        setFloatField(term5643, term5643.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5643, term5643.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5643, term5643.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term5643, args);
    }

};


