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

public class ReportHoursForProjectsDto_setUnbillableHoursFrozen_118710865345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term1111;

    public ReportHoursForProjectsDto_setUnbillableHoursFrozen_118710865345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1100 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1100, term1100.getClass(), "projectId", 0);
        setField(term1100, term1100.getClass(), "projectName", null);
        setFloatField(term1100, term1100.getClass(), "billableHours", 0.0F);
        setFloatField(term1100, term1100.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1100, term1100.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1100, term1100.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1100, term1100.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1100, term1100.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1100, term1100.getClass(), "totalHours", 0.0F);
        setFloatField(term1100, term1100.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1100, term1100.getClass(), "totalHoursNotFrozen", 0.0F);
        term1111 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1111;
        callMethod(klass, "setUnbillableHoursFrozen", argTypes, term1100, args);
    }

};


