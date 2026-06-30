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

public class ReportHoursForProjectsDto_getTotalHoursFrozen_153332889337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1002;

    public ReportHoursForProjectsDto_getTotalHoursFrozen_153332889337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1002 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1002, term1002.getClass(), "projectId", 0);
        setField(term1002, term1002.getClass(), "projectName", null);
        setFloatField(term1002, term1002.getClass(), "billableHours", 0.0F);
        setFloatField(term1002, term1002.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1002, term1002.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1002, term1002.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1002, term1002.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1002, term1002.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1002, term1002.getClass(), "totalHours", 0.0F);
        setFloatField(term1002, term1002.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1002, term1002.getClass(), "totalHoursNotFrozen", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursFrozen", argTypes, term1002, args);
    }

};


