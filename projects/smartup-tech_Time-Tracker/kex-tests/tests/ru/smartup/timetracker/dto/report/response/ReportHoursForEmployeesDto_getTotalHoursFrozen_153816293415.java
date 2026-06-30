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

public class ReportHoursForEmployeesDto_getTotalHoursFrozen_153816293415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2777;

    public ReportHoursForEmployeesDto_getTotalHoursFrozen_153816293415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2838 = new HashMap();
        term2777 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2777, term2777.getClass(), "projectId", 292681826);
        setField(term2777, term2777.getClass(), "projectName", "JiVRgTZvKc");
        setLongField(term2777, term2777.getClass(), "taskId", -5476826692763582090L);
        setField(term2777, term2777.getClass(), "taskName", "XPKmummaqg");
        setIntField(term2777, term2777.getClass(), "employeeId", 458147407);
        setField(term2777, term2777.getClass(), "employeeFirstName", "BKLfkLiZTH");
        setField(term2777, term2777.getClass(), "employeeLastName", "SPpkrGcPRr");
        setFloatField(term2777, term2777.getClass(), "billableHours", 0.3954653F);
        setFloatField(term2777, term2777.getClass(), "billableHoursFrozen", 0.638206F);
        setFloatField(term2777, term2777.getClass(), "billableHoursNotFrozen", 0.3034814F);
        setFloatField(term2777, term2777.getClass(), "unbillableHours", 0.18499982F);
        setFloatField(term2777, term2777.getClass(), "unbillableHoursFrozen", 0.8988424F);
        setFloatField(term2777, term2777.getClass(), "unbillableHoursNotFrozen", 0.36312395F);
        setFloatField(term2777, term2777.getClass(), "totalHours", 0.26696402F);
        setFloatField(term2777, term2777.getClass(), "totalHoursFrozen", 0.54856896F);
        setFloatField(term2777, term2777.getClass(), "totalHoursNotFrozen", 0.6206213F);
        setField(term2777, term2777.getClass(), "workHoursMap", term2838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursFrozen", argTypes, term2777, args);
    }

};


