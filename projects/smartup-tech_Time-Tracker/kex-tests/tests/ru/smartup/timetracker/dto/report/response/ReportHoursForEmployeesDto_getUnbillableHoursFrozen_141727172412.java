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

public class ReportHoursForEmployeesDto_getUnbillableHoursFrozen_141727172412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2441;

    public ReportHoursForEmployeesDto_getUnbillableHoursFrozen_141727172412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2502 = new HashMap();
        term2441 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2441, term2441.getClass(), "projectId", -14890619);
        setField(term2441, term2441.getClass(), "projectName", "jUbSRrkrYZ");
        setLongField(term2441, term2441.getClass(), "taskId", -8885298608300233488L);
        setField(term2441, term2441.getClass(), "taskName", "bWWfajKbEX");
        setIntField(term2441, term2441.getClass(), "employeeId", 1632125673);
        setField(term2441, term2441.getClass(), "employeeFirstName", "cAPeiZHKGJ");
        setField(term2441, term2441.getClass(), "employeeLastName", "LvJFtLBaxj");
        setFloatField(term2441, term2441.getClass(), "billableHours", 0.24406976F);
        setFloatField(term2441, term2441.getClass(), "billableHoursFrozen", 0.6438162F);
        setFloatField(term2441, term2441.getClass(), "billableHoursNotFrozen", 0.79774547F);
        setFloatField(term2441, term2441.getClass(), "unbillableHours", 0.4476599F);
        setFloatField(term2441, term2441.getClass(), "unbillableHoursFrozen", 0.5329919F);
        setFloatField(term2441, term2441.getClass(), "unbillableHoursNotFrozen", 0.93280405F);
        setFloatField(term2441, term2441.getClass(), "totalHours", 0.7046975F);
        setFloatField(term2441, term2441.getClass(), "totalHoursFrozen", 0.20434368F);
        setFloatField(term2441, term2441.getClass(), "totalHoursNotFrozen", 0.6896952F);
        setField(term2441, term2441.getClass(), "workHoursMap", term2502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursFrozen", argTypes, term2441, args);
    }

};


