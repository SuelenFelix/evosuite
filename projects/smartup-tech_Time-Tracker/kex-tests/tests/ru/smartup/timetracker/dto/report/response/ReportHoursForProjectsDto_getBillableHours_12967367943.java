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

public class ReportHoursForProjectsDto_getBillableHours_12967367943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public ReportHoursForProjectsDto_getBillableHours_12967367943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term67, term67.getClass(), "projectId", 1484323161);
        setField(term67, term67.getClass(), "projectName", "MuLcgQHgqz");
        setFloatField(term67, term67.getClass(), "billableHours", 0.37773192F);
        setFloatField(term67, term67.getClass(), "billableHoursFrozen", 0.24413109F);
        setFloatField(term67, term67.getClass(), "billableHoursNotFrozen", 0.8474802F);
        setFloatField(term67, term67.getClass(), "unbillableHours", 0.9985961F);
        setFloatField(term67, term67.getClass(), "unbillableHoursFrozen", 0.51832694F);
        setFloatField(term67, term67.getClass(), "unbillableHoursNotFrozen", 0.97262454F);
        setFloatField(term67, term67.getClass(), "totalHours", 0.76550204F);
        setFloatField(term67, term67.getClass(), "totalHoursFrozen", 0.26441735F);
        setFloatField(term67, term67.getClass(), "totalHoursNotFrozen", 0.13745493F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHours", argTypes, term67, args);
    }

};


