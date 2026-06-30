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

public class ReportHoursForEmployeesDto_setBillableHoursFrozen_134647699326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4105;
     Object term4177;

    public ReportHoursForEmployeesDto_setBillableHoursFrozen_134647699326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4166 = new HashMap();
        term4105 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4105, term4105.getClass(), "projectId", -478195677);
        setField(term4105, term4105.getClass(), "projectName", "HHmNoYxIGj");
        setLongField(term4105, term4105.getClass(), "taskId", -7672528020740371001L);
        setField(term4105, term4105.getClass(), "taskName", "PtirvZmsGt");
        setIntField(term4105, term4105.getClass(), "employeeId", 972867650);
        setField(term4105, term4105.getClass(), "employeeFirstName", "HWkpTmtlrc");
        setField(term4105, term4105.getClass(), "employeeLastName", "hMmaoREuCK");
        setFloatField(term4105, term4105.getClass(), "billableHours", 0.18919116F);
        setFloatField(term4105, term4105.getClass(), "billableHoursFrozen", 0.6533294F);
        setFloatField(term4105, term4105.getClass(), "billableHoursNotFrozen", 0.44623017F);
        setFloatField(term4105, term4105.getClass(), "unbillableHours", 0.73610836F);
        setFloatField(term4105, term4105.getClass(), "unbillableHoursFrozen", 0.30029124F);
        setFloatField(term4105, term4105.getClass(), "unbillableHoursNotFrozen", 0.056643248F);
        setFloatField(term4105, term4105.getClass(), "totalHours", 0.8308064F);
        setFloatField(term4105, term4105.getClass(), "totalHoursFrozen", 0.59848636F);
        setFloatField(term4105, term4105.getClass(), "totalHoursNotFrozen", 0.97008336F);
        setField(term4105, term4105.getClass(), "workHoursMap", term4166);
        term4177 = new Float(0.04708159F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4177;
        callMethod(klass, "setBillableHoursFrozen", argTypes, term4105, args);
    }

};


