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

public class ReportHoursForProjectsDto_setProjectName_134246645713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399;

    public ReportHoursForProjectsDto_setProjectName_134246645713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term399, term399.getClass(), "projectId", -883034806);
        setField(term399, term399.getClass(), "projectName", "MxlszYVzRf");
        setFloatField(term399, term399.getClass(), "billableHours", 0.85665673F);
        setFloatField(term399, term399.getClass(), "billableHoursFrozen", 0.6563145F);
        setFloatField(term399, term399.getClass(), "billableHoursNotFrozen", 0.92038053F);
        setFloatField(term399, term399.getClass(), "unbillableHours", 0.35686338F);
        setFloatField(term399, term399.getClass(), "unbillableHoursFrozen", 0.5804949F);
        setFloatField(term399, term399.getClass(), "unbillableHoursNotFrozen", 0.26573372F);
        setFloatField(term399, term399.getClass(), "totalHours", 0.20737511F);
        setFloatField(term399, term399.getClass(), "totalHoursFrozen", 0.1610204F);
        setFloatField(term399, term399.getClass(), "totalHoursNotFrozen", 0.791937F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "setProjectName", argTypes, term399, args);
    }

};


