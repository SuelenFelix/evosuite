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

public class ReportHoursForProjectsDto_setBillableHours_85122036441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1048;
     Object term1059;

    public ReportHoursForProjectsDto_setBillableHours_85122036441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1048 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1048, term1048.getClass(), "projectId", 0);
        setField(term1048, term1048.getClass(), "projectName", null);
        setFloatField(term1048, term1048.getClass(), "billableHours", 0.0F);
        setFloatField(term1048, term1048.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term1048, term1048.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term1048, term1048.getClass(), "unbillableHours", 0.0F);
        setFloatField(term1048, term1048.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term1048, term1048.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term1048, term1048.getClass(), "totalHours", 0.0F);
        setFloatField(term1048, term1048.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term1048, term1048.getClass(), "totalHoursNotFrozen", 0.0F);
        term1059 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term1059;
        callMethod(klass, "setBillableHours", argTypes, term1048, args);
    }

};


