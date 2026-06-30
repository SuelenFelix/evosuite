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
import java.util.HashMap;

public class ReportHoursForEmployeesDto_equals_101522599135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5193;
     Object term5265;

    public ReportHoursForEmployeesDto_equals_101522599135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5254 = new HashMap();
        term5193 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5193, term5193.getClass(), "projectId", -1263114719);
        setField(term5193, term5193.getClass(), "projectName", "tlzpzIjMib");
        setLongField(term5193, term5193.getClass(), "taskId", 1233889271256172047L);
        setField(term5193, term5193.getClass(), "taskName", "AZdLeSugwv");
        setIntField(term5193, term5193.getClass(), "employeeId", -894662986);
        setField(term5193, term5193.getClass(), "employeeFirstName", "RMsXuyzKJV");
        setField(term5193, term5193.getClass(), "employeeLastName", "FwPbDZcHmB");
        setFloatField(term5193, term5193.getClass(), "billableHours", 0.18561351F);
        setFloatField(term5193, term5193.getClass(), "billableHoursFrozen", 0.45938897F);
        setFloatField(term5193, term5193.getClass(), "billableHoursNotFrozen", 0.9678135F);
        setFloatField(term5193, term5193.getClass(), "unbillableHours", 0.39801794F);
        setFloatField(term5193, term5193.getClass(), "unbillableHoursFrozen", 0.32750356F);
        setFloatField(term5193, term5193.getClass(), "unbillableHoursNotFrozen", 0.39722002F);
        setFloatField(term5193, term5193.getClass(), "totalHours", 0.13747519F);
        setFloatField(term5193, term5193.getClass(), "totalHoursFrozen", 0.5343882F);
        setFloatField(term5193, term5193.getClass(), "totalHoursNotFrozen", 0.714912F);
        setField(term5193, term5193.getClass(), "workHoursMap", term5254);
        term5265 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5265;
        callMethod(klass, "equals", argTypes, term5193, args);
    }

};


