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

public class ReportHoursForProjectsDto_getUnbillableHoursNotFrozen_5419862308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;

    public ReportHoursForProjectsDto_getUnbillableHoursNotFrozen_5419862308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term232, term232.getClass(), "projectId", -2038273078);
        setField(term232, term232.getClass(), "projectName", "MjGYSRKTNF");
        setFloatField(term232, term232.getClass(), "billableHours", 0.51208574F);
        setFloatField(term232, term232.getClass(), "billableHoursFrozen", 0.28528106F);
        setFloatField(term232, term232.getClass(), "billableHoursNotFrozen", 0.30827713F);
        setFloatField(term232, term232.getClass(), "unbillableHours", 0.63008493F);
        setFloatField(term232, term232.getClass(), "unbillableHoursFrozen", 0.97831506F);
        setFloatField(term232, term232.getClass(), "unbillableHoursNotFrozen", 0.9737084F);
        setFloatField(term232, term232.getClass(), "totalHours", 0.21723765F);
        setFloatField(term232, term232.getClass(), "totalHoursFrozen", 0.06688923F);
        setFloatField(term232, term232.getClass(), "totalHoursNotFrozen", 0.22417867F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursNotFrozen", argTypes, term232, args);
    }

};


