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

public class ReportHoursForEmployeesDto_setBillableHours_37225510564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5961;
     Object term5974;

    public ReportHoursForEmployeesDto_setBillableHours_37225510564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5961 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5961, term5961.getClass(), "projectId", 0);
        setField(term5961, term5961.getClass(), "projectName", null);
        setLongField(term5961, term5961.getClass(), "taskId", 0L);
        setField(term5961, term5961.getClass(), "taskName", null);
        setIntField(term5961, term5961.getClass(), "employeeId", 0);
        setField(term5961, term5961.getClass(), "employeeFirstName", null);
        setField(term5961, term5961.getClass(), "employeeLastName", null);
        setFloatField(term5961, term5961.getClass(), "billableHours", 0.0F);
        setFloatField(term5961, term5961.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5961, term5961.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5961, term5961.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5961, term5961.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5961, term5961.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5961, term5961.getClass(), "totalHours", 0.0F);
        setFloatField(term5961, term5961.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5961, term5961.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5961, term5961.getClass(), "workHoursMap", null);
        term5974 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term5974;
        callMethod(klass, "setBillableHours", argTypes, term5961, args);
    }

};


