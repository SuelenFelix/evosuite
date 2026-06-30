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

public class ReportHours_getUnbillableHours_29790500746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21814;

    public ReportHours_getUnbillableHours_29790500746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21814 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21814, term21814.getClass(), "projectId", 0);
        setField(term21814, term21814.getClass(), "projectName", null);
        setLongField(term21814, term21814.getClass(), "taskId", 0L);
        setField(term21814, term21814.getClass(), "taskName", null);
        setIntField(term21814, term21814.getClass(), "employeeId", 0);
        setField(term21814, term21814.getClass(), "employeeFirstName", null);
        setField(term21814, term21814.getClass(), "employeeLastName", null);
        setFloatField(term21814, term21814.getClass(), "billableHours", 0.0F);
        setFloatField(term21814, term21814.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21814, term21814.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21814, term21814.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21814, term21814.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21814, term21814.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21814, term21814.getClass(), "totalHours", 0.0F);
        setFloatField(term21814, term21814.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21814, term21814.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21814, term21814.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHours", argTypes, term21814, args);
    }

};


