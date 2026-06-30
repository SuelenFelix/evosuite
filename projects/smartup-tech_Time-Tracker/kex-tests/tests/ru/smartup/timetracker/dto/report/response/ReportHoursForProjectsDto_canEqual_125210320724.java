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

public class ReportHoursForProjectsDto_canEqual_125210320724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;
     Object term826;

    public ReportHoursForProjectsDto_canEqual_125210320724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term803, term803.getClass(), "projectId", -1007160944);
        setField(term803, term803.getClass(), "projectName", "BYqFIqCKAV");
        setFloatField(term803, term803.getClass(), "billableHours", 0.78659093F);
        setFloatField(term803, term803.getClass(), "billableHoursFrozen", 0.5037956F);
        setFloatField(term803, term803.getClass(), "billableHoursNotFrozen", 0.06587154F);
        setFloatField(term803, term803.getClass(), "unbillableHours", 0.20511848F);
        setFloatField(term803, term803.getClass(), "unbillableHoursFrozen", 0.08659977F);
        setFloatField(term803, term803.getClass(), "unbillableHoursNotFrozen", 0.22873008F);
        setFloatField(term803, term803.getClass(), "totalHours", 0.96286476F);
        setFloatField(term803, term803.getClass(), "totalHoursFrozen", 0.9824895F);
        setFloatField(term803, term803.getClass(), "totalHoursNotFrozen", 0.62323177F);
        term826 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term826;
        callMethod(klass, "canEqual", argTypes, term803, args);
    }

};


