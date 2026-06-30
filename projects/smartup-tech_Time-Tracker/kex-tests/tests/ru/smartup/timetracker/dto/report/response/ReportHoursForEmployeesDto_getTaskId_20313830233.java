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

public class ReportHoursForEmployeesDto_getTaskId_20313830233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433;

    public ReportHoursForEmployeesDto_getTaskId_20313830233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1494 = new HashMap();
        term1433 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1433, term1433.getClass(), "projectId", -1179120542);
        setField(term1433, term1433.getClass(), "projectName", "IDCWpPLRkE");
        setLongField(term1433, term1433.getClass(), "taskId", -8257434502486459194L);
        setField(term1433, term1433.getClass(), "taskName", "nyiiPDVjAc");
        setIntField(term1433, term1433.getClass(), "employeeId", -73683645);
        setField(term1433, term1433.getClass(), "employeeFirstName", "aKnKipADSo");
        setField(term1433, term1433.getClass(), "employeeLastName", "wSQxaModmm");
        setFloatField(term1433, term1433.getClass(), "billableHours", 0.034274876F);
        setFloatField(term1433, term1433.getClass(), "billableHoursFrozen", 0.008025646F);
        setFloatField(term1433, term1433.getClass(), "billableHoursNotFrozen", 0.47933108F);
        setFloatField(term1433, term1433.getClass(), "unbillableHours", 0.40598297F);
        setFloatField(term1433, term1433.getClass(), "unbillableHoursFrozen", 0.7799478F);
        setFloatField(term1433, term1433.getClass(), "unbillableHoursNotFrozen", 0.37100673F);
        setFloatField(term1433, term1433.getClass(), "totalHours", 0.119950235F);
        setFloatField(term1433, term1433.getClass(), "totalHoursFrozen", 0.78186196F);
        setFloatField(term1433, term1433.getClass(), "totalHoursNotFrozen", 0.9698374F);
        setField(term1433, term1433.getClass(), "workHoursMap", term1494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term1433, args);
    }

};


