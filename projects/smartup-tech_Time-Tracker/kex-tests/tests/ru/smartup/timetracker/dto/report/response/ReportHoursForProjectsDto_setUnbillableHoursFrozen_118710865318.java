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

public class ReportHoursForProjectsDto_setUnbillableHoursFrozen_118710865318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594;
     Object term617;

    public ReportHoursForProjectsDto_setUnbillableHoursFrozen_118710865318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term594, term594.getClass(), "projectId", 1622346318);
        setField(term594, term594.getClass(), "projectName", "HyxfbSQYBe");
        setFloatField(term594, term594.getClass(), "billableHours", 0.94706243F);
        setFloatField(term594, term594.getClass(), "billableHoursFrozen", 0.0027298927F);
        setFloatField(term594, term594.getClass(), "billableHoursNotFrozen", 0.45478272F);
        setFloatField(term594, term594.getClass(), "unbillableHours", 0.29874015F);
        setFloatField(term594, term594.getClass(), "unbillableHoursFrozen", 0.8780084F);
        setFloatField(term594, term594.getClass(), "unbillableHoursNotFrozen", 0.32554477F);
        setFloatField(term594, term594.getClass(), "totalHours", 0.053365767F);
        setFloatField(term594, term594.getClass(), "totalHoursFrozen", 0.8924855F);
        setFloatField(term594, term594.getClass(), "totalHoursNotFrozen", 0.94332385F);
        term617 = new Float(0.32237554F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term617;
        callMethod(klass, "setUnbillableHoursFrozen", argTypes, term594, args);
    }

};


