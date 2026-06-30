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
import java.lang.Long;

public class ReportHours_setTaskId_121251233220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19831;
     Object term19903;

    public ReportHours_setTaskId_121251233220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19892 = new HashMap();
        term19831 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19831, term19831.getClass(), "projectId", 679763016);
        setField(term19831, term19831.getClass(), "projectName", "PznxWXsZME");
        setLongField(term19831, term19831.getClass(), "taskId", -4920224193275732920L);
        setField(term19831, term19831.getClass(), "taskName", "ZzIujlwVsw");
        setIntField(term19831, term19831.getClass(), "employeeId", 1962444399);
        setField(term19831, term19831.getClass(), "employeeFirstName", "LWyEaeIyAo");
        setField(term19831, term19831.getClass(), "employeeLastName", "yVMkkQhvmN");
        setFloatField(term19831, term19831.getClass(), "billableHours", 0.1544348F);
        setFloatField(term19831, term19831.getClass(), "billableHoursFrozen", 0.56109315F);
        setFloatField(term19831, term19831.getClass(), "billableHoursNotFrozen", 0.5187846F);
        setFloatField(term19831, term19831.getClass(), "unbillableHours", 0.59679276F);
        setFloatField(term19831, term19831.getClass(), "unbillableHoursFrozen", 0.045893133F);
        setFloatField(term19831, term19831.getClass(), "unbillableHoursNotFrozen", 0.71142817F);
        setFloatField(term19831, term19831.getClass(), "totalHours", 0.36261773F);
        setFloatField(term19831, term19831.getClass(), "totalHoursFrozen", 0.6496153F);
        setFloatField(term19831, term19831.getClass(), "totalHoursNotFrozen", 0.31637716F);
        setField(term19831, term19831.getClass(), "workHoursMap", term19892);
        term19903 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term19903;
        callMethod(klass, "setTaskId", argTypes, term19831, args);
    }

};


