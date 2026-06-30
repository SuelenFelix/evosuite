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

public class ReportHoursForProjectsDto_getBillableHoursFrozen_20466295944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;

    public ReportHoursForProjectsDto_getBillableHoursFrozen_20466295944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term100, term100.getClass(), "projectId", 391863371);
        setField(term100, term100.getClass(), "projectName", "xxtlPwDYFs");
        setFloatField(term100, term100.getClass(), "billableHours", 0.20144695F);
        setFloatField(term100, term100.getClass(), "billableHoursFrozen", 0.7031006F);
        setFloatField(term100, term100.getClass(), "billableHoursNotFrozen", 0.9431611F);
        setFloatField(term100, term100.getClass(), "unbillableHours", 0.95272815F);
        setFloatField(term100, term100.getClass(), "unbillableHoursFrozen", 0.7254646F);
        setFloatField(term100, term100.getClass(), "unbillableHoursNotFrozen", 0.9828442F);
        setFloatField(term100, term100.getClass(), "totalHours", 0.9472605F);
        setFloatField(term100, term100.getClass(), "totalHoursFrozen", 0.27797186F);
        setFloatField(term100, term100.getClass(), "totalHoursNotFrozen", 0.7467328F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursFrozen", argTypes, term100, args);
    }

};


