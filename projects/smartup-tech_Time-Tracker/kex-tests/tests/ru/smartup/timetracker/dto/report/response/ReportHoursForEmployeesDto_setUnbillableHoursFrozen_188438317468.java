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

public class ReportHoursForEmployeesDto_setUnbillableHoursFrozen_188438317468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6021;
     Object term6034;

    public ReportHoursForEmployeesDto_setUnbillableHoursFrozen_188438317468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6021 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term6021, term6021.getClass(), "projectId", 0);
        setField(term6021, term6021.getClass(), "projectName", null);
        setLongField(term6021, term6021.getClass(), "taskId", 0L);
        setField(term6021, term6021.getClass(), "taskName", null);
        setIntField(term6021, term6021.getClass(), "employeeId", 0);
        setField(term6021, term6021.getClass(), "employeeFirstName", null);
        setField(term6021, term6021.getClass(), "employeeLastName", null);
        setFloatField(term6021, term6021.getClass(), "billableHours", 0.0F);
        setFloatField(term6021, term6021.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term6021, term6021.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term6021, term6021.getClass(), "unbillableHours", 0.0F);
        setFloatField(term6021, term6021.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term6021, term6021.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term6021, term6021.getClass(), "totalHours", 0.0F);
        setFloatField(term6021, term6021.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term6021, term6021.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term6021, term6021.getClass(), "workHoursMap", null);
        term6034 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term6034;
        callMethod(klass, "setUnbillableHoursFrozen", argTypes, term6021, args);
    }

};


