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
import java.lang.Integer;

public class ReportHoursForEmployeesDto_setEmployeeId_117617855461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5920;
     Object term5933;

    public ReportHoursForEmployeesDto_setEmployeeId_117617855461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5920 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5920, term5920.getClass(), "projectId", 0);
        setField(term5920, term5920.getClass(), "projectName", null);
        setLongField(term5920, term5920.getClass(), "taskId", 0L);
        setField(term5920, term5920.getClass(), "taskName", null);
        setIntField(term5920, term5920.getClass(), "employeeId", 0);
        setField(term5920, term5920.getClass(), "employeeFirstName", null);
        setField(term5920, term5920.getClass(), "employeeLastName", null);
        setFloatField(term5920, term5920.getClass(), "billableHours", 0.0F);
        setFloatField(term5920, term5920.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5920, term5920.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5920, term5920.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5920, term5920.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5920, term5920.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5920, term5920.getClass(), "totalHours", 0.0F);
        setFloatField(term5920, term5920.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5920, term5920.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5920, term5920.getClass(), "workHoursMap", null);
        term5933 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5933;
        callMethod(klass, "setEmployeeId", argTypes, term5920, args);
    }

};


