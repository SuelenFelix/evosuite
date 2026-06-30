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

public class ReportHours_getEmployeeFirstName_12007992041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21749;

    public ReportHours_getEmployeeFirstName_12007992041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21749 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21749, term21749.getClass(), "projectId", 0);
        setField(term21749, term21749.getClass(), "projectName", null);
        setLongField(term21749, term21749.getClass(), "taskId", 0L);
        setField(term21749, term21749.getClass(), "taskName", null);
        setIntField(term21749, term21749.getClass(), "employeeId", 0);
        setField(term21749, term21749.getClass(), "employeeFirstName", null);
        setField(term21749, term21749.getClass(), "employeeLastName", null);
        setFloatField(term21749, term21749.getClass(), "billableHours", 0.0F);
        setFloatField(term21749, term21749.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21749, term21749.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21749, term21749.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21749, term21749.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21749, term21749.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21749, term21749.getClass(), "totalHours", 0.0F);
        setFloatField(term21749, term21749.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21749, term21749.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21749, term21749.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeFirstName", argTypes, term21749, args);
    }

};


