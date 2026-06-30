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

public class ReportHoursForEmployeesDto_getBillableHours_732613258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;

    public ReportHoursForEmployeesDto_getBillableHours_732613258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2054 = new HashMap();
        term1993 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1993, term1993.getClass(), "projectId", 767834723);
        setField(term1993, term1993.getClass(), "projectName", "hoicvmsovO");
        setLongField(term1993, term1993.getClass(), "taskId", 6811161968424632369L);
        setField(term1993, term1993.getClass(), "taskName", "eqJfYWRaEL");
        setIntField(term1993, term1993.getClass(), "employeeId", -602026508);
        setField(term1993, term1993.getClass(), "employeeFirstName", "fhkbdRViHi");
        setField(term1993, term1993.getClass(), "employeeLastName", "uWHnvSvaPl");
        setFloatField(term1993, term1993.getClass(), "billableHours", 0.18717843F);
        setFloatField(term1993, term1993.getClass(), "billableHoursFrozen", 0.017911553F);
        setFloatField(term1993, term1993.getClass(), "billableHoursNotFrozen", 0.53359526F);
        setFloatField(term1993, term1993.getClass(), "unbillableHours", 0.6826852F);
        setFloatField(term1993, term1993.getClass(), "unbillableHoursFrozen", 0.5725602F);
        setFloatField(term1993, term1993.getClass(), "unbillableHoursNotFrozen", 0.6730242F);
        setFloatField(term1993, term1993.getClass(), "totalHours", 0.5310967F);
        setFloatField(term1993, term1993.getClass(), "totalHoursFrozen", 0.13481039F);
        setFloatField(term1993, term1993.getClass(), "totalHoursNotFrozen", 0.6054109F);
        setField(term1993, term1993.getClass(), "workHoursMap", term2054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHours", argTypes, term1993, args);
    }

};


