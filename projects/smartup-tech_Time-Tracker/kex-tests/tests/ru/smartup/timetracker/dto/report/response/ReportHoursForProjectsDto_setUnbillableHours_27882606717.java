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
import java.lang.Float;

public class ReportHoursForProjectsDto_setUnbillableHours_27882606717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;
     Object term582;

    public ReportHoursForProjectsDto_setUnbillableHours_27882606717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term559, term559.getClass(), "projectId", -1456670397);
        setField(term559, term559.getClass(), "projectName", "tbcdzjIfER");
        setFloatField(term559, term559.getClass(), "billableHours", 0.04703206F);
        setFloatField(term559, term559.getClass(), "billableHoursFrozen", 0.036990583F);
        setFloatField(term559, term559.getClass(), "billableHoursNotFrozen", 0.8998475F);
        setFloatField(term559, term559.getClass(), "unbillableHours", 0.60471374F);
        setFloatField(term559, term559.getClass(), "unbillableHoursFrozen", 0.023032188F);
        setFloatField(term559, term559.getClass(), "unbillableHoursNotFrozen", 0.6767213F);
        setFloatField(term559, term559.getClass(), "totalHours", 0.65115076F);
        setFloatField(term559, term559.getClass(), "totalHoursFrozen", 0.48862952F);
        setFloatField(term559, term559.getClass(), "totalHoursNotFrozen", 0.37227178F);
        term582 = new Float(0.42623103F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term582;
        callMethod(klass, "setUnbillableHours", argTypes, term559, args);
    }

};


