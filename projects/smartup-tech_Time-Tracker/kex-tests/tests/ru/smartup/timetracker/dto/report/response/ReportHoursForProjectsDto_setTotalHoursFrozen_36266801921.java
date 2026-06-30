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

public class ReportHoursForProjectsDto_setTotalHoursFrozen_36266801921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;
     Object term722;

    public ReportHoursForProjectsDto_setTotalHoursFrozen_36266801921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term699 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term699, term699.getClass(), "projectId", -6029667);
        setField(term699, term699.getClass(), "projectName", "RkybSrpybU");
        setFloatField(term699, term699.getClass(), "billableHours", 0.5584653F);
        setFloatField(term699, term699.getClass(), "billableHoursFrozen", 0.16988689F);
        setFloatField(term699, term699.getClass(), "billableHoursNotFrozen", 0.026718378F);
        setFloatField(term699, term699.getClass(), "unbillableHours", 0.39286935F);
        setFloatField(term699, term699.getClass(), "unbillableHoursFrozen", 0.13618106F);
        setFloatField(term699, term699.getClass(), "unbillableHoursNotFrozen", 0.11577946F);
        setFloatField(term699, term699.getClass(), "totalHours", 0.55778444F);
        setFloatField(term699, term699.getClass(), "totalHoursFrozen", 0.5617009F);
        setFloatField(term699, term699.getClass(), "totalHoursNotFrozen", 0.6716574F);
        term722 = new Float(0.090670586F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term722;
        callMethod(klass, "setTotalHoursFrozen", argTypes, term699, args);
    }

};


