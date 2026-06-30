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

public class ReportHoursForEmployeesDto_setTaskName_150090271621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3475;

    public ReportHoursForEmployeesDto_setTaskName_150090271621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3536 = new HashMap();
        term3475 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3475, term3475.getClass(), "projectId", -112921587);
        setField(term3475, term3475.getClass(), "projectName", "xIeFjkHkOe");
        setLongField(term3475, term3475.getClass(), "taskId", -2585684163342970173L);
        setField(term3475, term3475.getClass(), "taskName", "SdCKLMIYnX");
        setIntField(term3475, term3475.getClass(), "employeeId", 933028652);
        setField(term3475, term3475.getClass(), "employeeFirstName", "OJJtVNPyKZ");
        setField(term3475, term3475.getClass(), "employeeLastName", "AKNapTAfmD");
        setFloatField(term3475, term3475.getClass(), "billableHours", 0.39749312F);
        setFloatField(term3475, term3475.getClass(), "billableHoursFrozen", 0.58265007F);
        setFloatField(term3475, term3475.getClass(), "billableHoursNotFrozen", 0.4248085F);
        setFloatField(term3475, term3475.getClass(), "unbillableHours", 0.116303444F);
        setFloatField(term3475, term3475.getClass(), "unbillableHoursFrozen", 0.34951717F);
        setFloatField(term3475, term3475.getClass(), "unbillableHoursNotFrozen", 0.11878139F);
        setFloatField(term3475, term3475.getClass(), "totalHours", 0.20687163F);
        setFloatField(term3475, term3475.getClass(), "totalHoursFrozen", 0.04662496F);
        setFloatField(term3475, term3475.getClass(), "totalHoursNotFrozen", 0.57349455F);
        setField(term3475, term3475.getClass(), "workHoursMap", term3536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        callMethod(klass, "setTaskName", argTypes, term3475, args);
    }

};


