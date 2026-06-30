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

public class ReportHoursForEmployeesDto_setTotalHoursFrozen_158614348871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6066;
     Object term6079;

    public ReportHoursForEmployeesDto_setTotalHoursFrozen_158614348871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6066 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term6066, term6066.getClass(), "projectId", 0);
        setField(term6066, term6066.getClass(), "projectName", null);
        setLongField(term6066, term6066.getClass(), "taskId", 0L);
        setField(term6066, term6066.getClass(), "taskName", null);
        setIntField(term6066, term6066.getClass(), "employeeId", 0);
        setField(term6066, term6066.getClass(), "employeeFirstName", null);
        setField(term6066, term6066.getClass(), "employeeLastName", null);
        setFloatField(term6066, term6066.getClass(), "billableHours", 0.0F);
        setFloatField(term6066, term6066.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term6066, term6066.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term6066, term6066.getClass(), "unbillableHours", 0.0F);
        setFloatField(term6066, term6066.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term6066, term6066.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term6066, term6066.getClass(), "totalHours", 0.0F);
        setFloatField(term6066, term6066.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term6066, term6066.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term6066, term6066.getClass(), "workHoursMap", null);
        term6079 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term6079;
        callMethod(klass, "setTotalHoursFrozen", argTypes, term6066, args);
    }

};


