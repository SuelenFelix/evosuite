package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ReportHours_getTotalHoursNotFrozen_140388745816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19359;

    public ReportHours_getTotalHoursNotFrozen_140388745816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19420 = new HashMap();
        term19359 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19359, term19359.getClass(), "projectId", -203030934);
        setField(term19359, term19359.getClass(), "projectName", "XylxrMBraH");
        setLongField(term19359, term19359.getClass(), "taskId", -872011222785455006L);
        setField(term19359, term19359.getClass(), "taskName", "pORebkoRdD");
        setIntField(term19359, term19359.getClass(), "employeeId", -1179120542);
        setField(term19359, term19359.getClass(), "employeeFirstName", "mXGCWJDOqA");
        setField(term19359, term19359.getClass(), "employeeLastName", "dpNsDgfPso");
        setFloatField(term19359, term19359.getClass(), "billableHours", 0.53083503F);
        setFloatField(term19359, term19359.getClass(), "billableHoursFrozen", 0.5195638F);
        setFloatField(term19359, term19359.getClass(), "billableHoursNotFrozen", 0.71547955F);
        setFloatField(term19359, term19359.getClass(), "unbillableHours", 0.48796618F);
        setFloatField(term19359, term19359.getClass(), "unbillableHoursFrozen", 0.63550293F);
        setFloatField(term19359, term19359.getClass(), "unbillableHoursNotFrozen", 0.08016902F);
        setFloatField(term19359, term19359.getClass(), "totalHours", 0.0022646189F);
        setFloatField(term19359, term19359.getClass(), "totalHoursFrozen", 0.99403065F);
        setFloatField(term19359, term19359.getClass(), "totalHoursNotFrozen", 0.36226058F);
        setField(term19359, term19359.getClass(), "workHoursMap", term19420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursNotFrozen", argTypes, term19359, args);
    }

};


