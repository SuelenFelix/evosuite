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

public class ReportHoursForProjectsDto_setUnbillableHoursNotFrozen_109627808019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;
     Object term652;

    public ReportHoursForProjectsDto_setUnbillableHoursNotFrozen_109627808019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term629 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term629, term629.getClass(), "projectId", 1048535127);
        setField(term629, term629.getClass(), "projectName", "pCTimMblYc");
        setFloatField(term629, term629.getClass(), "billableHours", 0.7666174F);
        setFloatField(term629, term629.getClass(), "billableHoursFrozen", 0.53094494F);
        setFloatField(term629, term629.getClass(), "billableHoursNotFrozen", 0.301957F);
        setFloatField(term629, term629.getClass(), "unbillableHours", 0.14643145F);
        setFloatField(term629, term629.getClass(), "unbillableHoursFrozen", 0.7032675F);
        setFloatField(term629, term629.getClass(), "unbillableHoursNotFrozen", 0.24259013F);
        setFloatField(term629, term629.getClass(), "totalHours", 0.8598678F);
        setFloatField(term629, term629.getClass(), "totalHoursFrozen", 0.1544348F);
        setFloatField(term629, term629.getClass(), "totalHoursNotFrozen", 0.56109315F);
        term652 = new Float(0.5187846F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term652;
        callMethod(klass, "setUnbillableHoursNotFrozen", argTypes, term629, args);
    }

};


