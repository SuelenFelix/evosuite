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

public class ReportHoursForProjectsDto_getUnbillableHoursFrozen_1937962557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;

    public ReportHoursForProjectsDto_getUnbillableHoursFrozen_1937962557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term199, term199.getClass(), "projectId", -1955890973);
        setField(term199, term199.getClass(), "projectName", "SzjVpOQTyS");
        setFloatField(term199, term199.getClass(), "billableHours", 0.75592405F);
        setFloatField(term199, term199.getClass(), "billableHoursFrozen", 0.068145275F);
        setFloatField(term199, term199.getClass(), "billableHoursNotFrozen", 0.10667074F);
        setFloatField(term199, term199.getClass(), "unbillableHours", 0.9571234F);
        setFloatField(term199, term199.getClass(), "unbillableHoursFrozen", 0.114929974F);
        setFloatField(term199, term199.getClass(), "unbillableHoursNotFrozen", 0.30926234F);
        setFloatField(term199, term199.getClass(), "totalHours", 0.37161416F);
        setFloatField(term199, term199.getClass(), "totalHoursFrozen", 0.022591352F);
        setFloatField(term199, term199.getClass(), "totalHoursNotFrozen", 0.6805867F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursFrozen", argTypes, term199, args);
    }

};


