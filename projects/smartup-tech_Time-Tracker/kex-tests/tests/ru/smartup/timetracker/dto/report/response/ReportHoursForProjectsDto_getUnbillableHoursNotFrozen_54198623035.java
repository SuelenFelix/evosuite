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

public class ReportHoursForProjectsDto_getUnbillableHoursNotFrozen_54198623035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;

    public ReportHoursForProjectsDto_getUnbillableHoursNotFrozen_54198623035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term980 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term980, term980.getClass(), "projectId", 0);
        setField(term980, term980.getClass(), "projectName", null);
        setFloatField(term980, term980.getClass(), "billableHours", 0.0F);
        setFloatField(term980, term980.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term980, term980.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term980, term980.getClass(), "unbillableHours", 0.0F);
        setFloatField(term980, term980.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term980, term980.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term980, term980.getClass(), "totalHours", 0.0F);
        setFloatField(term980, term980.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term980, term980.getClass(), "totalHoursNotFrozen", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursNotFrozen", argTypes, term980, args);
    }

};


