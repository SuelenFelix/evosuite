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

public class ReportHoursForProjectsDto_setBillableHoursNotFrozen_143440981716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;
     Object term547;

    public ReportHoursForProjectsDto_setBillableHoursNotFrozen_143440981716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term524, term524.getClass(), "projectId", -1685132342);
        setField(term524, term524.getClass(), "projectName", "ZiaGIbnzTs");
        setFloatField(term524, term524.getClass(), "billableHours", 0.27994657F);
        setFloatField(term524, term524.getClass(), "billableHoursFrozen", 0.53083503F);
        setFloatField(term524, term524.getClass(), "billableHoursNotFrozen", 0.5195638F);
        setFloatField(term524, term524.getClass(), "unbillableHours", 0.71547955F);
        setFloatField(term524, term524.getClass(), "unbillableHoursFrozen", 0.48796618F);
        setFloatField(term524, term524.getClass(), "unbillableHoursNotFrozen", 0.63550293F);
        setFloatField(term524, term524.getClass(), "totalHours", 0.08016902F);
        setFloatField(term524, term524.getClass(), "totalHoursFrozen", 0.0022646189F);
        setFloatField(term524, term524.getClass(), "totalHoursNotFrozen", 0.99403065F);
        term547 = new Float(0.36226058F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term547;
        callMethod(klass, "setBillableHoursNotFrozen", argTypes, term524, args);
    }

};


