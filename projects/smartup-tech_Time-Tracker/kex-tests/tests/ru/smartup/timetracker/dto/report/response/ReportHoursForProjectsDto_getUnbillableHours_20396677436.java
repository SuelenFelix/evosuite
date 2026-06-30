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

public class ReportHoursForProjectsDto_getUnbillableHours_20396677436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public ReportHoursForProjectsDto_getUnbillableHours_20396677436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term166, term166.getClass(), "projectId", -616727354);
        setField(term166, term166.getClass(), "projectName", "EGtDIRbSSb");
        setFloatField(term166, term166.getClass(), "billableHours", 0.80973893F);
        setFloatField(term166, term166.getClass(), "billableHoursFrozen", 0.7633268F);
        setFloatField(term166, term166.getClass(), "billableHoursNotFrozen", 0.541592F);
        setFloatField(term166, term166.getClass(), "unbillableHours", 0.13481021F);
        setFloatField(term166, term166.getClass(), "unbillableHoursFrozen", 0.996533F);
        setFloatField(term166, term166.getClass(), "unbillableHoursNotFrozen", 0.38000882F);
        setFloatField(term166, term166.getClass(), "totalHours", 0.10577053F);
        setFloatField(term166, term166.getClass(), "totalHoursFrozen", 0.5840714F);
        setFloatField(term166, term166.getClass(), "totalHoursNotFrozen", 0.478669F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHours", argTypes, term166, args);
    }

};


