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
import java.lang.Float;

public class ReportHoursForEmployeesDto_setTotalHoursFrozen_158614348832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4789;
     Object term4861;

    public ReportHoursForEmployeesDto_setTotalHoursFrozen_158614348832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4850 = new HashMap();
        term4789 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4789, term4789.getClass(), "projectId", -1845499264);
        setField(term4789, term4789.getClass(), "projectName", "JppkknKVOw");
        setLongField(term4789, term4789.getClass(), "taskId", 5262507301787091109L);
        setField(term4789, term4789.getClass(), "taskName", "iljANwuEjk");
        setIntField(term4789, term4789.getClass(), "employeeId", -505439934);
        setField(term4789, term4789.getClass(), "employeeFirstName", "kNqaJKIATy");
        setField(term4789, term4789.getClass(), "employeeLastName", "vKQukfbJUd");
        setFloatField(term4789, term4789.getClass(), "billableHours", 0.39897245F);
        setFloatField(term4789, term4789.getClass(), "billableHoursFrozen", 0.4555542F);
        setFloatField(term4789, term4789.getClass(), "billableHoursNotFrozen", 0.34164554F);
        setFloatField(term4789, term4789.getClass(), "unbillableHours", 0.9938727F);
        setFloatField(term4789, term4789.getClass(), "unbillableHoursFrozen", 0.39957583F);
        setFloatField(term4789, term4789.getClass(), "unbillableHoursNotFrozen", 0.39416778F);
        setFloatField(term4789, term4789.getClass(), "totalHours", 0.64149946F);
        setFloatField(term4789, term4789.getClass(), "totalHoursFrozen", 0.5384156F);
        setFloatField(term4789, term4789.getClass(), "totalHoursNotFrozen", 0.12826473F);
        setField(term4789, term4789.getClass(), "workHoursMap", term4850);
        term4861 = new Float(0.28813952F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4861;
        callMethod(klass, "setTotalHoursFrozen", argTypes, term4789, args);
    }

};


