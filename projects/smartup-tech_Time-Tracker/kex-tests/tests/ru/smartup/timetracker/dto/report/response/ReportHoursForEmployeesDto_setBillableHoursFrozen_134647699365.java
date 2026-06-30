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
import java.lang.Float;

public class ReportHoursForEmployeesDto_setBillableHoursFrozen_134647699365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5976;
     Object term5989;

    public ReportHoursForEmployeesDto_setBillableHoursFrozen_134647699365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5976 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5976, term5976.getClass(), "projectId", 0);
        setField(term5976, term5976.getClass(), "projectName", null);
        setLongField(term5976, term5976.getClass(), "taskId", 0L);
        setField(term5976, term5976.getClass(), "taskName", null);
        setIntField(term5976, term5976.getClass(), "employeeId", 0);
        setField(term5976, term5976.getClass(), "employeeFirstName", null);
        setField(term5976, term5976.getClass(), "employeeLastName", null);
        setFloatField(term5976, term5976.getClass(), "billableHours", 0.0F);
        setFloatField(term5976, term5976.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5976, term5976.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5976, term5976.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5976, term5976.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5976, term5976.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5976, term5976.getClass(), "totalHours", 0.0F);
        setFloatField(term5976, term5976.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5976, term5976.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5976, term5976.getClass(), "workHoursMap", null);
        term5989 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term5989;
        callMethod(klass, "setBillableHoursFrozen", argTypes, term5976, args);
    }

};


