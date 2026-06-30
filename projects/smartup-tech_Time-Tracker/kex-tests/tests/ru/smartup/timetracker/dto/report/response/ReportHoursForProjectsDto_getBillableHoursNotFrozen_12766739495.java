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

public class ReportHoursForProjectsDto_getBillableHoursNotFrozen_12766739495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;

    public ReportHoursForProjectsDto_getBillableHoursNotFrozen_12766739495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term133, term133.getClass(), "projectId", -1922583790);
        setField(term133, term133.getClass(), "projectName", "jJCZpVmanW");
        setFloatField(term133, term133.getClass(), "billableHours", 0.6436713F);
        setFloatField(term133, term133.getClass(), "billableHoursFrozen", 0.89057696F);
        setFloatField(term133, term133.getClass(), "billableHoursNotFrozen", 0.7332741F);
        setFloatField(term133, term133.getClass(), "unbillableHours", 0.15826964F);
        setFloatField(term133, term133.getClass(), "unbillableHoursFrozen", 0.45691717F);
        setFloatField(term133, term133.getClass(), "unbillableHoursNotFrozen", 0.17877543F);
        setFloatField(term133, term133.getClass(), "totalHours", 0.8598297F);
        setFloatField(term133, term133.getClass(), "totalHoursFrozen", 0.96323884F);
        setFloatField(term133, term133.getClass(), "totalHoursNotFrozen", 0.43692183F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursNotFrozen", argTypes, term133, args);
    }

};


