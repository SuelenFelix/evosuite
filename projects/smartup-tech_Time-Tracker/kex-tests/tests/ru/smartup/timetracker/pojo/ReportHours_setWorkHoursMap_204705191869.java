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

public class ReportHours_setWorkHoursMap_204705191869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22137;

    public ReportHours_setWorkHoursMap_204705191869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22137 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term22137, term22137.getClass(), "projectId", 0);
        setField(term22137, term22137.getClass(), "projectName", null);
        setLongField(term22137, term22137.getClass(), "taskId", 0L);
        setField(term22137, term22137.getClass(), "taskName", null);
        setIntField(term22137, term22137.getClass(), "employeeId", 0);
        setField(term22137, term22137.getClass(), "employeeFirstName", null);
        setField(term22137, term22137.getClass(), "employeeLastName", null);
        setFloatField(term22137, term22137.getClass(), "billableHours", 0.0F);
        setFloatField(term22137, term22137.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term22137, term22137.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term22137, term22137.getClass(), "unbillableHours", 0.0F);
        setFloatField(term22137, term22137.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term22137, term22137.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term22137, term22137.getClass(), "totalHours", 0.0F);
        setFloatField(term22137, term22137.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term22137, term22137.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term22137, term22137.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWorkHoursMap", argTypes, term22137, args);
    }

};


