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

public class ReportHoursForEmployeesDto_setUnbillableHoursNotFrozen_197521374730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4561;
     Object term4633;

    public ReportHoursForEmployeesDto_setUnbillableHoursNotFrozen_197521374730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4622 = new HashMap();
        term4561 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4561, term4561.getClass(), "projectId", 1442160736);
        setField(term4561, term4561.getClass(), "projectName", "lihXWlGDxk");
        setLongField(term4561, term4561.getClass(), "taskId", 6855071767938501807L);
        setField(term4561, term4561.getClass(), "taskName", "JmcmxoGhIK");
        setIntField(term4561, term4561.getClass(), "employeeId", 1114000454);
        setField(term4561, term4561.getClass(), "employeeFirstName", "jXzmYyrnnT");
        setField(term4561, term4561.getClass(), "employeeLastName", "igCAtimmYB");
        setFloatField(term4561, term4561.getClass(), "billableHours", 0.99349374F);
        setFloatField(term4561, term4561.getClass(), "billableHoursFrozen", 0.9952003F);
        setFloatField(term4561, term4561.getClass(), "billableHoursNotFrozen", 0.26231134F);
        setFloatField(term4561, term4561.getClass(), "unbillableHours", 0.22059524F);
        setFloatField(term4561, term4561.getClass(), "unbillableHoursFrozen", 0.8221641F);
        setFloatField(term4561, term4561.getClass(), "unbillableHoursNotFrozen", 0.28105962F);
        setFloatField(term4561, term4561.getClass(), "totalHours", 0.795941F);
        setFloatField(term4561, term4561.getClass(), "totalHoursFrozen", 0.04978639F);
        setFloatField(term4561, term4561.getClass(), "totalHoursNotFrozen", 0.076844275F);
        setField(term4561, term4561.getClass(), "workHoursMap", term4622);
        term4633 = new Float(0.88140786F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4633;
        callMethod(klass, "setUnbillableHoursNotFrozen", argTypes, term4561, args);
    }

};


