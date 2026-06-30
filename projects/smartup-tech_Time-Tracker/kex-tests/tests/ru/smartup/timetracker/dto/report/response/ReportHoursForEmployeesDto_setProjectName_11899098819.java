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

public class ReportHoursForEmployeesDto_setProjectName_11899098819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3227;

    public ReportHoursForEmployeesDto_setProjectName_11899098819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3288 = new HashMap();
        term3227 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3227, term3227.getClass(), "projectId", 1225272962);
        setField(term3227, term3227.getClass(), "projectName", "XylxrMBraH");
        setLongField(term3227, term3227.getClass(), "taskId", -6573104506744284592L);
        setField(term3227, term3227.getClass(), "taskName", "pORebkoRdD");
        setIntField(term3227, term3227.getClass(), "employeeId", 1324040357);
        setField(term3227, term3227.getClass(), "employeeFirstName", "mXGCWJDOqA");
        setField(term3227, term3227.getClass(), "employeeLastName", "dpNsDgfPso");
        setFloatField(term3227, term3227.getClass(), "billableHours", 0.21362513F);
        setFloatField(term3227, term3227.getClass(), "billableHoursFrozen", 0.18330246F);
        setFloatField(term3227, term3227.getClass(), "billableHoursNotFrozen", 0.51947397F);
        setFloatField(term3227, term3227.getClass(), "unbillableHours", 0.19412553F);
        setFloatField(term3227, term3227.getClass(), "unbillableHoursFrozen", 0.07467145F);
        setFloatField(term3227, term3227.getClass(), "unbillableHoursNotFrozen", 0.28898114F);
        setFloatField(term3227, term3227.getClass(), "totalHours", 0.40120173F);
        setFloatField(term3227, term3227.getClass(), "totalHoursFrozen", 0.7856101F);
        setFloatField(term3227, term3227.getClass(), "totalHoursNotFrozen", 0.6200908F);
        setField(term3227, term3227.getClass(), "workHoursMap", term3288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzMEhMXkKx";
        callMethod(klass, "setProjectName", argTypes, term3227, args);
    }

};


