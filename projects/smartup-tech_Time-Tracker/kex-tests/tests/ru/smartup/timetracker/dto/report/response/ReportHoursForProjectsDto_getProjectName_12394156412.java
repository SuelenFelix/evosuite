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

public class ReportHoursForProjectsDto_getProjectName_12394156412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public ReportHoursForProjectsDto_getProjectName_12394156412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term34, term34.getClass(), "projectId", 1162663216);
        setField(term34, term34.getClass(), "projectName", "sjlJAEtRrb");
        setFloatField(term34, term34.getClass(), "billableHours", 0.6880585F);
        setFloatField(term34, term34.getClass(), "billableHoursFrozen", 0.40176582F);
        setFloatField(term34, term34.getClass(), "billableHoursNotFrozen", 0.8783184F);
        setFloatField(term34, term34.getClass(), "unbillableHours", 0.26413453F);
        setFloatField(term34, term34.getClass(), "unbillableHoursFrozen", 0.7944024F);
        setFloatField(term34, term34.getClass(), "unbillableHoursNotFrozen", 0.3692338F);
        setFloatField(term34, term34.getClass(), "totalHours", 0.13906479F);
        setFloatField(term34, term34.getClass(), "totalHoursFrozen", 0.6076495F);
        setFloatField(term34, term34.getClass(), "totalHoursNotFrozen", 0.6608425F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term34, args);
    }

};


