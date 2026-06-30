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

public class ReportHoursForEmployeesDto_setWorkHoursMap_151399630173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6096;

    public ReportHoursForEmployeesDto_setWorkHoursMap_151399630173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6096 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term6096, term6096.getClass(), "projectId", 0);
        setField(term6096, term6096.getClass(), "projectName", null);
        setLongField(term6096, term6096.getClass(), "taskId", 0L);
        setField(term6096, term6096.getClass(), "taskName", null);
        setIntField(term6096, term6096.getClass(), "employeeId", 0);
        setField(term6096, term6096.getClass(), "employeeFirstName", null);
        setField(term6096, term6096.getClass(), "employeeLastName", null);
        setFloatField(term6096, term6096.getClass(), "billableHours", 0.0F);
        setFloatField(term6096, term6096.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term6096, term6096.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term6096, term6096.getClass(), "unbillableHours", 0.0F);
        setFloatField(term6096, term6096.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term6096, term6096.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term6096, term6096.getClass(), "totalHours", 0.0F);
        setFloatField(term6096, term6096.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term6096, term6096.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term6096, term6096.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWorkHoursMap", argTypes, term6096, args);
    }

};


