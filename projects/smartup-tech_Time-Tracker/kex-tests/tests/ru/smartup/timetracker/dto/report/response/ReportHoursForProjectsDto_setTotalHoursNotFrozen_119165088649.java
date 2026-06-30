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

public class ReportHoursForProjectsDto_setTotalHoursNotFrozen_119165088649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;
     Object term1163;

    public ReportHoursForProjectsDto_setTotalHoursNotFrozen_119165088649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1152, term1152.getClass(), "projectId", 0);
        setField(term1152, term1152.getClass(), "projectName", null);
        setFloatField(term1152, term1152.getClass(), "billableHours", 0.0F);
        setFloatField(term1152, term1152.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1152, term1152.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1152, term1152.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1152, term1152.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1152, term1152.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1152, term1152.getClass(), "totalHours", 0.0F);
        setFloatField(term1152, term1152.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1152, term1152.getClass(), "totalHoursNotFrozen", 0.0F);
        term1163 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1163;
        callMethod(klass, "setTotalHoursNotFrozen", argTypes, term1152, args);
    }

};


