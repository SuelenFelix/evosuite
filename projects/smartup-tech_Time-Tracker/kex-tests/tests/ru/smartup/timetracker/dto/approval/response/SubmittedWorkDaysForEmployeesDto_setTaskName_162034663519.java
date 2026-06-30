package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedWorkDaysForEmployeesDto_setTaskName_162034663519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16404;

    public SubmittedWorkDaysForEmployeesDto_setTaskName_162034663519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16404 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16430 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16404, term16404.getClass(), "employeeId", -481533957);
        setField(term16404, term16404.getClass(), "firstName", "SFqCrhEWLm");
        setField(term16404, term16404.getClass(), "lastName", "GZdcJyZntS");
        setLongField(term16430, term16430.getClass(), "fastTime", 1689428810999L);
        setField(term16430, term16430.getClass(), "cdate", null);
        setField(term16404, term16404.getClass(), "trackUnitWorkDay", term16430);
        setIntField(term16404, term16404.getClass(), "projectId", 1240914516);
        setField(term16404, term16404.getClass(), "projectName", "OIHoJeysUi");
        setLongField(term16404, term16404.getClass(), "trackUnitId", -1539859611880912454L);
        setLongField(term16404, term16404.getClass(), "taskId", 4100236067313034103L);
        setField(term16404, term16404.getClass(), "taskName", "WXMWFDGcLB");
        setFloatField(term16404, term16404.getClass(), "trackUnitHours", 0.37164736F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wKWbJssZuG";
        callMethod(klass, "setTaskName", argTypes, term16404, args);
    }

};


