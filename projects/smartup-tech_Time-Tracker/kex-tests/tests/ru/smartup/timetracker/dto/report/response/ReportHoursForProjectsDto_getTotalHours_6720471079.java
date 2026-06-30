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

public class ReportHoursForProjectsDto_getTotalHours_6720471079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;

    public ReportHoursForProjectsDto_getTotalHours_6720471079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term265, term265.getClass(), "projectId", 1227103734);
        setField(term265, term265.getClass(), "projectName", "hRNSzYYIrc");
        setFloatField(term265, term265.getClass(), "billableHours", 0.35872674F);
        setFloatField(term265, term265.getClass(), "billableHoursFrozen", 0.2946385F);
        setFloatField(term265, term265.getClass(), "billableHoursNotFrozen", 0.07802445F);
        setFloatField(term265, term265.getClass(), "unbillableHours", 0.36114347F);
        setFloatField(term265, term265.getClass(), "unbillableHoursFrozen", 0.52792794F);
        setFloatField(term265, term265.getClass(), "unbillableHoursNotFrozen", 0.24759698F);
        setFloatField(term265, term265.getClass(), "totalHours", 0.32021916F);
        setFloatField(term265, term265.getClass(), "totalHoursFrozen", 0.8886614F);
        setFloatField(term265, term265.getClass(), "totalHoursNotFrozen", 0.22651339F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHours", argTypes, term265, args);
    }

};


