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
import java.lang.Float;

public class ReportHoursForEmployeesDto_setBillableHoursNotFrozen_163708201027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219;
     Object term4291;

    public ReportHoursForEmployeesDto_setBillableHoursNotFrozen_163708201027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4280 = new HashMap();
        term4219 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4219, term4219.getClass(), "projectId", 1655935355);
        setField(term4219, term4219.getClass(), "projectName", "aWYOWZFyaX");
        setLongField(term4219, term4219.getClass(), "taskId", -4502405999831680926L);
        setField(term4219, term4219.getClass(), "taskName", "BRIVNtfUWU");
        setIntField(term4219, term4219.getClass(), "employeeId", -481533957);
        setField(term4219, term4219.getClass(), "employeeFirstName", "DbiCVtPPCT");
        setField(term4219, term4219.getClass(), "employeeLastName", "WzFopsaDuG");
        setFloatField(term4219, term4219.getClass(), "billableHours", 0.35927898F);
        setFloatField(term4219, term4219.getClass(), "billableHoursFrozen", 0.8223115F);
        setFloatField(term4219, term4219.getClass(), "billableHoursNotFrozen", 0.9480923F);
        setFloatField(term4219, term4219.getClass(), "unbillableHours", 0.06795502F);
        setFloatField(term4219, term4219.getClass(), "unbillableHoursFrozen", 0.63920385F);
        setFloatField(term4219, term4219.getClass(), "unbillableHoursNotFrozen", 0.1987465F);
        setFloatField(term4219, term4219.getClass(), "totalHours", 0.9539412F);
        setFloatField(term4219, term4219.getClass(), "totalHoursFrozen", 0.16852564F);
        setFloatField(term4219, term4219.getClass(), "totalHoursNotFrozen", 0.38171387F);
        setField(term4219, term4219.getClass(), "workHoursMap", term4280);
        term4291 = new Float(0.20341456F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4291;
        callMethod(klass, "setBillableHoursNotFrozen", argTypes, term4219, args);
    }

};


