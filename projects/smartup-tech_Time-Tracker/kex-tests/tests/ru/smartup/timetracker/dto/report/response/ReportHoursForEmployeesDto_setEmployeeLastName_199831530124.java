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
import java.util.HashMap;

public class ReportHoursForEmployeesDto_setEmployeeLastName_199831530124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3857;

    public ReportHoursForEmployeesDto_setEmployeeLastName_199831530124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3918 = new HashMap();
        term3857 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3857, term3857.getClass(), "projectId", 1551099402);
        setField(term3857, term3857.getClass(), "projectName", "EeBVbzjcCI");
        setLongField(term3857, term3857.getClass(), "taskId", 2486810210675247493L);
        setField(term3857, term3857.getClass(), "taskName", "UfQtPRyWRC");
        setIntField(term3857, term3857.getClass(), "employeeId", -2027534003);
        setField(term3857, term3857.getClass(), "employeeFirstName", "FPvxVzzSvD");
        setField(term3857, term3857.getClass(), "employeeLastName", "WHcwFgsGFC");
        setFloatField(term3857, term3857.getClass(), "billableHours", 0.37417793F);
        setFloatField(term3857, term3857.getClass(), "billableHoursFrozen", 0.44014287F);
        setFloatField(term3857, term3857.getClass(), "billableHoursNotFrozen", 0.5652495F);
        setFloatField(term3857, term3857.getClass(), "unbillableHours", 0.22185719F);
        setFloatField(term3857, term3857.getClass(), "unbillableHoursFrozen", 0.021410823F);
        setFloatField(term3857, term3857.getClass(), "unbillableHoursNotFrozen", 0.8497243F);
        setFloatField(term3857, term3857.getClass(), "totalHours", 0.8397628F);
        setFloatField(term3857, term3857.getClass(), "totalHoursFrozen", 0.14997876F);
        setFloatField(term3857, term3857.getClass(), "totalHoursNotFrozen", 0.017846644F);
        setField(term3857, term3857.getClass(), "workHoursMap", term3918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jwsfVjMoJT";
        callMethod(klass, "setEmployeeLastName", argTypes, term3857, args);
    }

};


