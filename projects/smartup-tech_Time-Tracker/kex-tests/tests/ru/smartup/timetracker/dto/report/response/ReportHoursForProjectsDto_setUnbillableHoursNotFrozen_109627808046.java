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
import java.lang.Float;

public class ReportHoursForProjectsDto_setUnbillableHoursNotFrozen_109627808046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;
     Object term1124;

    public ReportHoursForProjectsDto_setUnbillableHoursNotFrozen_109627808046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1113 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1113, term1113.getClass(), "projectId", 0);
        setField(term1113, term1113.getClass(), "projectName", null);
        setFloatField(term1113, term1113.getClass(), "billableHours", 0.0F);
        setFloatField(term1113, term1113.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1113, term1113.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1113, term1113.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1113, term1113.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1113, term1113.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1113, term1113.getClass(), "totalHours", 0.0F);
        setFloatField(term1113, term1113.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1113, term1113.getClass(), "totalHoursNotFrozen", 0.0F);
        term1124 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1124;
        callMethod(klass, "setUnbillableHoursNotFrozen", argTypes, term1113, args);
    }

};


