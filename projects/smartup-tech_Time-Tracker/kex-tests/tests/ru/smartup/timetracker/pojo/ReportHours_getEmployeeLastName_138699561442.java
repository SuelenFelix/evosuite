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

public class ReportHours_getEmployeeLastName_138699561442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21762;

    public ReportHours_getEmployeeLastName_138699561442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21762 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21762, term21762.getClass(), "projectId", 0);
        setField(term21762, term21762.getClass(), "projectName", null);
        setLongField(term21762, term21762.getClass(), "taskId", 0L);
        setField(term21762, term21762.getClass(), "taskName", null);
        setIntField(term21762, term21762.getClass(), "employeeId", 0);
        setField(term21762, term21762.getClass(), "employeeFirstName", null);
        setField(term21762, term21762.getClass(), "employeeLastName", null);
        setFloatField(term21762, term21762.getClass(), "billableHours", 0.0F);
        setFloatField(term21762, term21762.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21762, term21762.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21762, term21762.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21762, term21762.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21762, term21762.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21762, term21762.getClass(), "totalHours", 0.0F);
        setFloatField(term21762, term21762.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21762, term21762.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21762, term21762.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeLastName", argTypes, term21762, args);
    }

};


