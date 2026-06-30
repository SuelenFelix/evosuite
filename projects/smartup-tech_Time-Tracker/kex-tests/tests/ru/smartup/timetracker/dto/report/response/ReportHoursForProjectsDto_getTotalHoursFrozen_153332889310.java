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

public class ReportHoursForProjectsDto_getTotalHoursFrozen_153332889310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;

    public ReportHoursForProjectsDto_getTotalHoursFrozen_153332889310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term298, term298.getClass(), "projectId", -1339778481);
        setField(term298, term298.getClass(), "projectName", "RMFIsYGgne");
        setFloatField(term298, term298.getClass(), "billableHours", 0.38555247F);
        setFloatField(term298, term298.getClass(), "billableHoursFrozen", 0.8878841F);
        setFloatField(term298, term298.getClass(), "billableHoursNotFrozen", 0.2889229F);
        setFloatField(term298, term298.getClass(), "unbillableHours", 0.65889484F);
        setFloatField(term298, term298.getClass(), "unbillableHoursFrozen", 0.25392914F);
        setFloatField(term298, term298.getClass(), "unbillableHoursNotFrozen", 0.63972145F);
        setFloatField(term298, term298.getClass(), "totalHours", 0.3357792F);
        setFloatField(term298, term298.getClass(), "totalHoursFrozen", 0.25937343F);
        setFloatField(term298, term298.getClass(), "totalHoursNotFrozen", 0.8704517F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursFrozen", argTypes, term298, args);
    }

};


