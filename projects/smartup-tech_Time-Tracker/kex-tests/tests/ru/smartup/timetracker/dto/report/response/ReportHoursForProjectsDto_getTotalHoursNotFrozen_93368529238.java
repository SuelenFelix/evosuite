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

public class ReportHoursForProjectsDto_getTotalHoursNotFrozen_93368529238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;

    public ReportHoursForProjectsDto_getTotalHoursNotFrozen_93368529238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1013 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1013, term1013.getClass(), "projectId", 0);
        setField(term1013, term1013.getClass(), "projectName", null);
        setFloatField(term1013, term1013.getClass(), "billableHours", 0.0F);
        setFloatField(term1013, term1013.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1013, term1013.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1013, term1013.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1013, term1013.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1013, term1013.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1013, term1013.getClass(), "totalHours", 0.0F);
        setFloatField(term1013, term1013.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1013, term1013.getClass(), "totalHoursNotFrozen", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursNotFrozen", argTypes, term1013, args);
    }

};


