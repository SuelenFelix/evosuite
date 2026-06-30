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

public class ReportHoursForProjectsDto_setBillableHoursFrozen_12300152415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;
     Object term512;

    public ReportHoursForProjectsDto_setBillableHoursFrozen_12300152415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term489, term489.getClass(), "projectId", 597278769);
        setField(term489, term489.getClass(), "projectName", "aJlieCFVtF");
        setFloatField(term489, term489.getClass(), "billableHours", 0.25778466F);
        setFloatField(term489, term489.getClass(), "billableHoursFrozen", 0.11179066F);
        setFloatField(term489, term489.getClass(), "billableHoursNotFrozen", 0.9205692F);
        setFloatField(term489, term489.getClass(), "unbillableHours", 0.5306474F);
        setFloatField(term489, term489.getClass(), "unbillableHoursFrozen", 0.12532318F);
        setFloatField(term489, term489.getClass(), "unbillableHoursNotFrozen", 0.022483587F);
        setFloatField(term489, term489.getClass(), "totalHours", 0.9200632F);
        setFloatField(term489, term489.getClass(), "totalHoursFrozen", 0.025133014F);
        setFloatField(term489, term489.getClass(), "totalHoursNotFrozen", 0.5428452F);
        term512 = new Float(0.016575277F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "setBillableHoursFrozen", argTypes, term489, args);
    }

};


