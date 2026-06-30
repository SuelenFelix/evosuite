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

public class ReportHoursForEmployeesDto_canEqual_181938862075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public ReportHoursForEmployeesDto_canEqual_181938862075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6122 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term6122, term6122.getClass(), "projectId", 0);
        setField(term6122, term6122.getClass(), "projectName", null);
        setLongField(term6122, term6122.getClass(), "taskId", 0L);
        setField(term6122, term6122.getClass(), "taskName", null);
        setIntField(term6122, term6122.getClass(), "employeeId", 0);
        setField(term6122, term6122.getClass(), "employeeFirstName", null);
        setField(term6122, term6122.getClass(), "employeeLastName", null);
        setFloatField(term6122, term6122.getClass(), "billableHours", 0.0F);
        setFloatField(term6122, term6122.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term6122, term6122.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term6122, term6122.getClass(), "unbillableHours", 0.0F);
        setFloatField(term6122, term6122.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term6122, term6122.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term6122, term6122.getClass(), "totalHours", 0.0F);
        setFloatField(term6122, term6122.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term6122, term6122.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term6122, term6122.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term6122, args);
    }

};


