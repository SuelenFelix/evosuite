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
import java.lang.Integer;

public class ReportHoursForProjectsDto_setProjectId_176113557039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1024;
     Object term1035;

    public ReportHoursForProjectsDto_setProjectId_176113557039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1024 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1024, term1024.getClass(), "projectId", 0);
        setField(term1024, term1024.getClass(), "projectName", null);
        setFloatField(term1024, term1024.getClass(), "billableHours", 0.0F);
        setFloatField(term1024, term1024.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1024, term1024.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1024, term1024.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1024, term1024.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1024, term1024.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1024, term1024.getClass(), "totalHours", 0.0F);
        setFloatField(term1024, term1024.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1024, term1024.getClass(), "totalHoursNotFrozen", 0.0F);
        term1035 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1035;
        callMethod(klass, "setProjectId", argTypes, term1024, args);
    }

};


