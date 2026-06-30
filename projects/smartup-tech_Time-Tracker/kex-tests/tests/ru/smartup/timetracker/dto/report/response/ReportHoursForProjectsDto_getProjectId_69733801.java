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

public class ReportHoursForProjectsDto_getProjectId_69733801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReportHoursForProjectsDto_getProjectId_69733801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term1, term1.getClass(), "projectId", 568599855);
        setField(term1, term1.getClass(), "projectName", "PAEBtnZtTD");
        setFloatField(term1, term1.getClass(), "billableHours", 0.13238746F);
        setFloatField(term1, term1.getClass(), "billableHoursFrozen", 0.2707036F);
        setFloatField(term1, term1.getClass(), "billableHoursNotFrozen", 0.3455959F);
        setFloatField(term1, term1.getClass(), "unbillableHours", 0.09123778F);
        setFloatField(term1, term1.getClass(), "unbillableHoursFrozen", 0.5523636F);
        setFloatField(term1, term1.getClass(), "unbillableHoursNotFrozen", 0.8564069F);
        setFloatField(term1, term1.getClass(), "totalHours", 0.5446086F);
        setFloatField(term1, term1.getClass(), "totalHoursFrozen", 0.5254275F);
        setFloatField(term1, term1.getClass(), "totalHoursNotFrozen", 0.2857073F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term1, args);
    }

};


