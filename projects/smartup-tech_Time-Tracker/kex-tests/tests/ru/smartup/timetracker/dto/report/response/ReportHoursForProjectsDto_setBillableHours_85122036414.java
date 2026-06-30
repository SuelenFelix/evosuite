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

public class ReportHoursForProjectsDto_setBillableHours_85122036414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;
     Object term477;

    public ReportHoursForProjectsDto_setBillableHours_85122036414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term454, term454.getClass(), "projectId", 1585847225);
        setField(term454, term454.getClass(), "projectName", "oVcInYnLWB");
        setFloatField(term454, term454.getClass(), "billableHours", 0.54285216F);
        setFloatField(term454, term454.getClass(), "billableHoursFrozen", 0.21098667F);
        setFloatField(term454, term454.getClass(), "billableHoursNotFrozen", 0.24346101F);
        setFloatField(term454, term454.getClass(), "unbillableHours", 0.32273352F);
        setFloatField(term454, term454.getClass(), "unbillableHoursFrozen", 0.24959576F);
        setFloatField(term454, term454.getClass(), "unbillableHoursNotFrozen", 0.43337202F);
        setFloatField(term454, term454.getClass(), "totalHours", 0.34331435F);
        setFloatField(term454, term454.getClass(), "totalHoursFrozen", 0.13246995F);
        setFloatField(term454, term454.getClass(), "totalHoursNotFrozen", 0.012435675F);
        term477 = new Float(0.912685F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term477;
        callMethod(klass, "setBillableHours", argTypes, term454, args);
    }

};


