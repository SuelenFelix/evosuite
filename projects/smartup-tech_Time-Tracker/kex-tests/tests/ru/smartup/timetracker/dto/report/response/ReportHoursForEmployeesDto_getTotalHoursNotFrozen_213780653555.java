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

public class ReportHoursForEmployeesDto_getTotalHoursNotFrozen_213780653555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5838;

    public ReportHoursForEmployeesDto_getTotalHoursNotFrozen_213780653555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5838 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5838, term5838.getClass(), "projectId", 0);
        setField(term5838, term5838.getClass(), "projectName", null);
        setLongField(term5838, term5838.getClass(), "taskId", 0L);
        setField(term5838, term5838.getClass(), "taskName", null);
        setIntField(term5838, term5838.getClass(), "employeeId", 0);
        setField(term5838, term5838.getClass(), "employeeFirstName", null);
        setField(term5838, term5838.getClass(), "employeeLastName", null);
        setFloatField(term5838, term5838.getClass(), "billableHours", 0.0F);
        setFloatField(term5838, term5838.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5838, term5838.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5838, term5838.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5838, term5838.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5838, term5838.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5838, term5838.getClass(), "totalHours", 0.0F);
        setFloatField(term5838, term5838.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5838, term5838.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5838, term5838.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursNotFrozen", argTypes, term5838, args);
    }

};


