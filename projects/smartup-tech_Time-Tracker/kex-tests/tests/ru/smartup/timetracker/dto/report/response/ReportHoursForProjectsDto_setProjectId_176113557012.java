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
import java.lang.Integer;

public class ReportHoursForProjectsDto_setProjectId_176113557012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;
     Object term387;

    public ReportHoursForProjectsDto_setProjectId_176113557012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term364, term364.getClass(), "projectId", -522618178);
        setField(term364, term364.getClass(), "projectName", "uuaPigETmJ");
        setFloatField(term364, term364.getClass(), "billableHours", 0.07096106F);
        setFloatField(term364, term364.getClass(), "billableHoursFrozen", 0.6862221F);
        setFloatField(term364, term364.getClass(), "billableHoursNotFrozen", 0.5602794F);
        setFloatField(term364, term364.getClass(), "unbillableHours", 0.15917838F);
        setFloatField(term364, term364.getClass(), "unbillableHoursFrozen", 0.37164736F);
        setFloatField(term364, term364.getClass(), "unbillableHoursNotFrozen", 0.93741155F);
        setFloatField(term364, term364.getClass(), "totalHours", 0.71813905F);
        setFloatField(term364, term364.getClass(), "totalHoursFrozen", 0.8454723F);
        setFloatField(term364, term364.getClass(), "totalHoursNotFrozen", 0.079128504F);
        term387 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term387;
        callMethod(klass, "setProjectId", argTypes, term364, args);
    }

};


