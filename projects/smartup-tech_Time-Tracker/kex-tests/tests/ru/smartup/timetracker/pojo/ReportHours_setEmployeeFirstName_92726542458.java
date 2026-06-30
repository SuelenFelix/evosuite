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

public class ReportHours_setEmployeeFirstName_92726542458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21976;

    public ReportHours_setEmployeeFirstName_92726542458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21976 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21976, term21976.getClass(), "projectId", 0);
        setField(term21976, term21976.getClass(), "projectName", null);
        setLongField(term21976, term21976.getClass(), "taskId", 0L);
        setField(term21976, term21976.getClass(), "taskName", null);
        setIntField(term21976, term21976.getClass(), "employeeId", 0);
        setField(term21976, term21976.getClass(), "employeeFirstName", null);
        setField(term21976, term21976.getClass(), "employeeLastName", null);
        setFloatField(term21976, term21976.getClass(), "billableHours", 0.0F);
        setFloatField(term21976, term21976.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21976, term21976.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21976, term21976.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21976, term21976.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21976, term21976.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21976, term21976.getClass(), "totalHours", 0.0F);
        setFloatField(term21976, term21976.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21976, term21976.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21976, term21976.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmployeeFirstName", argTypes, term21976, args);
    }

};


