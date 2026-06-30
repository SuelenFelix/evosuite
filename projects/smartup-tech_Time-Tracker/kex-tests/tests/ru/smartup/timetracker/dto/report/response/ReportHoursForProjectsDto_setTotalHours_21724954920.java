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

public class ReportHoursForProjectsDto_setTotalHours_21724954920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664;
     Object term687;

    public ReportHoursForProjectsDto_setTotalHours_21724954920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term664, term664.getClass(), "projectId", -655067527);
        setField(term664, term664.getClass(), "projectName", "hNxWaHcfhY");
        setFloatField(term664, term664.getClass(), "billableHours", 0.59679276F);
        setFloatField(term664, term664.getClass(), "billableHoursFrozen", 0.045893133F);
        setFloatField(term664, term664.getClass(), "billableHoursNotFrozen", 0.71142817F);
        setFloatField(term664, term664.getClass(), "unbillableHours", 0.36261773F);
        setFloatField(term664, term664.getClass(), "unbillableHoursFrozen", 0.6496153F);
        setFloatField(term664, term664.getClass(), "unbillableHoursNotFrozen", 0.31637716F);
        setFloatField(term664, term664.getClass(), "totalHours", 0.23081815F);
        setFloatField(term664, term664.getClass(), "totalHoursFrozen", 0.88196456F);
        setFloatField(term664, term664.getClass(), "totalHoursNotFrozen", 0.8818646F);
        term687 = new Float(0.5412182F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term687;
        callMethod(klass, "setTotalHours", argTypes, term664, args);
    }

};


