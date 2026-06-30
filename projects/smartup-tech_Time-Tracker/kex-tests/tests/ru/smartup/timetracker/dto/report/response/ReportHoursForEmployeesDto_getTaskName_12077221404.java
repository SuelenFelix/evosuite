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

public class ReportHoursForEmployeesDto_getTaskName_12077221404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;

    public ReportHoursForEmployeesDto_getTaskName_12077221404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1606 = new HashMap();
        term1545 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1545, term1545.getClass(), "projectId", -226514366);
        setField(term1545, term1545.getClass(), "projectName", "gGSMzuGICf");
        setLongField(term1545, term1545.getClass(), "taskId", -8400487765614892086L);
        setField(term1545, term1545.getClass(), "taskName", "hxCBltsObl");
        setIntField(term1545, term1545.getClass(), "employeeId", 1193880199);
        setField(term1545, term1545.getClass(), "employeeFirstName", "BndsHwAFMv");
        setField(term1545, term1545.getClass(), "employeeLastName", "GzFkzHGYFt");
        setFloatField(term1545, term1545.getClass(), "billableHours", 0.04640019F);
        setFloatField(term1545, term1545.getClass(), "billableHoursFrozen", 0.7216883F);
        setFloatField(term1545, term1545.getClass(), "billableHoursNotFrozen", 0.9123573F);
        setFloatField(term1545, term1545.getClass(), "unbillableHours", 0.07144344F);
        setFloatField(term1545, term1545.getClass(), "unbillableHoursFrozen", 0.4063537F);
        setFloatField(term1545, term1545.getClass(), "unbillableHoursNotFrozen", 0.46776146F);
        setFloatField(term1545, term1545.getClass(), "totalHours", 0.47720432F);
        setFloatField(term1545, term1545.getClass(), "totalHoursFrozen", 0.2877797F);
        setFloatField(term1545, term1545.getClass(), "totalHoursNotFrozen", 0.24465042F);
        setField(term1545, term1545.getClass(), "workHoursMap", term1606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term1545, args);
    }

};


