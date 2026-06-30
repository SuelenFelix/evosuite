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
import java.lang.Integer;

public class ReportHours_setProjectId_57643718053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21905;
     Object term21918;

    public ReportHours_setProjectId_57643718053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21905 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21905, term21905.getClass(), "projectId", 0);
        setField(term21905, term21905.getClass(), "projectName", null);
        setLongField(term21905, term21905.getClass(), "taskId", 0L);
        setField(term21905, term21905.getClass(), "taskName", null);
        setIntField(term21905, term21905.getClass(), "employeeId", 0);
        setField(term21905, term21905.getClass(), "employeeFirstName", null);
        setField(term21905, term21905.getClass(), "employeeLastName", null);
        setFloatField(term21905, term21905.getClass(), "billableHours", 0.0F);
        setFloatField(term21905, term21905.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21905, term21905.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21905, term21905.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21905, term21905.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21905, term21905.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21905, term21905.getClass(), "totalHours", 0.0F);
        setFloatField(term21905, term21905.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21905, term21905.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21905, term21905.getClass(), "workHoursMap", null);
        term21918 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21918;
        callMethod(klass, "setProjectId", argTypes, term21905, args);
    }

};


